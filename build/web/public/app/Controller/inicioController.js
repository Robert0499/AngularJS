angular
        .module('canastazo')
        .controller('inicioController', inicioController);
inicioController.$inject = ['$scope', '$state', 'DataBaseService', 'host'];

function inicioController($scope, $state, DataBaseService, host) {

  $scope.Registro = () => {
    var ciudad = $('#ciudades').val();
    var departamentos = $('#departamento').val();
    var pass1 = $('#pass').val();
    var pass = $('#pass1').val();
    if (pass1 == pass) {
      DataBaseService.insert({nombres: $scope.data.nombres, apellidos: $scope.data.apellidos, departamento: departamentos, ciudades: ciudad, correo: $scope.data.correo, password2: pass}).then(result => {
        console.log(result);
        if (result.status === 202) {
//          console.log(result);
          toastr.warning("El correo ya se encuentra registrado, prueba otro");
        } else if(result.status === 200) {
          toastr.success("Se Registro exitosamente");
        }
       
      }).catch(err => {
        console.log(err.data);

      });

    } else {
      toastr.error("Las contraseña no coinceden por favor verifica");
    }
  };

  $scope.Login = () => {
    DataBaseService.login({email: $scope.usu.email, password: $scope.usu.password}).then(result => {
      if (JSON.parse(result.data) === true) {
        console.log(result);
        toastr.success(result.data);
      } else if (JSON.parse(result.data) === false) {
        toastr.error(result.data);
      }
    }).catch(err => {
      console.log(err.data);
    });
  };

}
;