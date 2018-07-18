angular.module('angularjs').constant('state', (stateprovider, name) => {
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


