var app = angular.module('myApp', []);
app.controller('formCtrl', function($scope,$http) {
	var baseurl="http://localhost:80801/";
	$scope.UserlogDetails=[];
	$scope.login= function(loginfo) {
		$scope.UserlogDetails.push(loginfo);

		console.log($scope.UserlogDetails);
		$http({
			method: "GET",
			url: baseurl + "loginUser",

		}).then(function mySuccess(response) {

		}, function myError(response) {
			$scope.myWelcome = response.statusText;
		})


	}


	$scope.regi=function(){
		var userDetails={
			"userName":$scope.Userregi.username,
			"email":$scope.Userregi.email,
			"password":$scope.Userregi.pass

		};
		$http({
			method: 'POST',
			url: 'http://localhost:8081/newUser',
			data:userDetails,
			headers: {
				'Content-Type': 'application/json'
			}

		}).then(function mySuccess(response) {
			console.log(userDetails);
			


		}, function myError(response) {
			$scope.myWelcome = response.statusText;
		})
		


	}
	
    $scope.firstname = "John";
});