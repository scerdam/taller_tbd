var app = angular.module('angularSpa', [
    'ngRoute'
    ]);
app.config(function($routeProvider){
    $routeProvider
    .when('/home', {
        templateUrl: 'views/main.html',
        controller: 'MainCtrl'
      })
    .when('/about', {
        templateUrl: 'views/about.html',
        controller: 'AboutCtrl'
      })
    .otherwise({
        redirectTo: '/home'
      });
});



angular.module('demo', [])
.controller('Hello', function($scope, $http) {
    $http.get('http://localhost:8080/sakila-backend-master/actors').
        then(function(response) {
            $scope.sakila = response.data;
        });
});