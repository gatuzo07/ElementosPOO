package org.unitec.maven;

import java.sql.Date;
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
public class ControladorGastos {
    @RequestMapping(value="/gastos/{fecha}/{concepto}/{cantidad}", method = RequestMethod.POST, headers={"Accept=text/html"})
    @ResponseBody String guardarGastos(@PathVariable Date fecha, @PathVariable String concepto, @PathVariable Float cantidad)throws Exception{
        Gastos g=new Gastos();
        g.setFecha(fecha);
        g.setConcepto(concepto);
        g.setCantidad(cantidad);
        DAOGastos dao=new DAOGastos();
        
        return "El gasto se ha guardado con éxito";
    }
    @RequestMapping(value="/gastos", method=RequestMethod.GET, headers={"Accept=text/json"})
    @ResponseBody ArrayList<Gastos> obtenerTodos()throws Exception{
        DAOGastos dao=new DAOGastos();
        ArrayList<Gastos> gastos=dao.buscarTodos();
        return gastos;
    }
}
