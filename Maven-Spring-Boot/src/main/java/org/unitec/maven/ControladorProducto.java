package org.unitec.maven;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author gatuzo07
 *      Esto es un Servicio REST
 */
@Controller
@RequestMapping("/")
public class ControladorProducto {
    
    @RequestMapping(value="/producto/{nombre}/{costo}/{unidades}", method=RequestMethod.POST, headers={"Accept=text/html"})
    @ResponseBody String guardar(@PathVariable String nombre,@PathVariable Float costo, @PathVariable Integer unidades)throws Exception{
        Producto p=new Producto();
        p.setCosto(costo);
        p.setNombre(nombre);
        p.setUnidades(unidades);
        DAOProducto.guardar(p);
        
        return "El producto se ha guardado con exito";
        
    }
    
}
