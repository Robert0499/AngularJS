angular
  .module('angularjs')
  .controller('inicioController', inicioController);
inicioController.$inject = ['$scope', '$state'];

function inicioController($scope, $state) {
  console.log('Holaaa!');
}
