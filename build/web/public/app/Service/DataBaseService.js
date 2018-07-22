angular.module('canastazo').service('DataBaseService', DataBaseService);

DataBaseService.$inject = [
  '$http',
  'host',
  '$httpParamSerializerJQLike'
];

function DataBaseService($http, host, $httpParamSerializerJQLike) {

//  this.usuarios = ()=>{
//    return $http.get(host + 'Usuarios');
//  };

this.insert = data =>{
  return $http.post(host + 'inicio', $httpParamSerializerJQLike(data));
};

  this.login = data => {
    return $http.post(host + 'login', $httpParamSerializerJQLike(data));
  };

}