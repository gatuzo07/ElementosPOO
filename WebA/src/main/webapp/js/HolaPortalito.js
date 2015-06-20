/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function(){
$("#boton-hola").click(function(){
    /*
     * Vamos a envíar el dato del nombre a nuestro servlet portalito
     * y esperar la respuesta del servlet portalito
     */
    
   $.ajax({
      url:"portalito",
      method:"post",
      data:{
          nombre:$("#nombre").val()          
      },
      success: function (datos) {
          $("#respuesta").html(datos);  
        },
      failure:function(){
          
      }  
  });   
}); 
});
