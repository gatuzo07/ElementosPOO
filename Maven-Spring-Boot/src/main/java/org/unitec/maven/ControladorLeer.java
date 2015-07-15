package org.unitec.maven;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author gatuzo07
 * Se ocupa para presentar paginas Web o bien para liberar Servicios
 * que es lo que vamos a realizar.
 * 
 * El servicio se libera a cualquier cliente, cualquier plataforma
 * @Controller <--- Se le llaman estereotipos
 * @RequestMapping("/") <--- Mapeo solicitado http://localhost:8080/
 */

@Controller
@RequestMapping("/")
public class ControladorLeer {
    
    @RequestMapping(value="/leer", method = RequestMethod.GET, headers = {"Accept=text/html"})
    @ResponseBody String leer() throws Exception{
        
        return "Aqui vamos a mostrar el servicio leer que ya hicimos";
    }
}
