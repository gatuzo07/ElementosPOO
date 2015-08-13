package org.unitec.maven;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gatuzo07
 */

@RestController
@RequestMapping("/")
public class ControladorTarjeta {
    @RequestMapping(value="/tarjeta/{nombre}/{diaCorte}", method = RequestMethod.POST, headers={"Accept=text/html"})
    @ResponseBody String guardarTarjeta(@PathVariable String nombre, @PathVariable Integer diaCorte)throws Exception{
        Tarjeta t=new Tarjeta();
        t.setDiacorte(diaCorte);
        t.setNombre(nombre);
        DAOTarjeta dao=new DAOTarjeta();
        
        return "La tarjeta se ha guardado con éxito";
    }
    @RequestMapping(value="/tarjeta", method=RequestMethod.GET, headers={"Accept=text/json"})
    @ResponseBody ArrayList<Tarjeta> obtenerTodos()throws Exception{
        DAOTarjeta dao=new DAOTarjeta();
        ArrayList<Tarjeta> tarjetas=dao.buscarTodos();
        return tarjetas;
    }
}
