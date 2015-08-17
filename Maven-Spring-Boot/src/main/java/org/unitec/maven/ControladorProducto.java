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
    
    @RequestMapping(value="/producto/{id_producto}/{nombre}/{costo}/{unidades}", method=RequestMethod.POST, headers={"Accept=text/html"})
    @ResponseBody String guardar(@PathVariable Integer id_producto,@PathVariable String nombre,@PathVariable Float costo, @PathVariable Integer unidades)throws Exception{
        DAOProducto dao=new DAOProducto();
        Producto p=new Producto();
        p.setIdProducto(id_producto);
        p.setNombre(nombre);
        p.setCosto(costo);
        p.setUnidades(unidades);        
        dao.guardar(p);
        
        return "El producto se ha guardado con exito";        
    }
    
    @RequestMapping(value="/producto/{id_producto}/{nombre}/{costo}/{unidades}", method=RequestMethod.PUT, headers={"Accept=text/html"})
    @ResponseBody String actualizar(@PathVariable Integer id_producto,@PathVariable String nombre,@PathVariable Float costo, @PathVariable Integer unidades)throws Exception{
        DAOProducto dao=new DAOProducto();
        Producto p=new Producto();
        p.setIdProducto(id_producto);
        p.setNombre(nombre);
        p.setCosto(costo);
        p.setUnidades(unidades);
        dao.actualizar(p);
        return "El producto se ha actualizado con exito";
    }
}