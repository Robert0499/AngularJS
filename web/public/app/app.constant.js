angular.module('canastazo').constant('state', (stateprovider, name) => {
  stateprovider.state(name, {
    url: '/' + name,
    controller: name + 'Controller',
    templateUrl: 'public/app/View/' + name + '.html',
    resolve: {
      loadMyCtrl: [
        '$ocLazyLoad',
        $ocLazyLoad => {
          return $ocLazyLoad.load([
            { files: ['public/app/Controller/' + name + 'Controller.js'] }
          ]);
        }
      ]
    }
  });
});
angular.module('canastazo').constant('host', 'http://localhost:8080/AppCanastazo/');


