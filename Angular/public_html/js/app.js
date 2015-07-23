/* 
 * Primero se creara un modulo, el cual es una aplicación de Angular js
 * 
 * Dentro de los corchetes se indican las directivas, son similares a los
 * import.io 
 * 
 * Se invoca en el index dentro --> <html ng-app="aplicacionchiquita">
 * 
 * Definimos un controlador para comunicarnos con el index --> aplicacion.controller
 * 
 * Se crean los modelos dentro del controlador --> $scope.mensaje 
 * y se invocan en el index dentro --> <body ng-controller="ControladorPrincipal">
 */

var aplicacion=angular.module('AplicacionChiquita',[]);

aplicacion.controller('ControladorPrincipal',function($scope){
/*  $scope.mensaje='Hola desde angular'; */
    $scope.centigrados='';
    $scope.fahrenheit='';
    $scope.kelvin='';
    $scope.boton=function(){
        cent=(($scope.centigrados)*1.8)+32;
        fahr=(parseFloat($scope.centigrados)+273.73);
        $scope.fahrenheit='ºF = '+cent;
        $scope.kelvin='ºK = '+fahr;
    };
}
        );


