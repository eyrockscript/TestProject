/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metalsa.testproject;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author eliud.trejo
 */
@Controller
@RequestMapping("/")
public class TestController {
    
    /**
     * Metodo de prueba, debería enviar al index pero no lo hace
     * @param request
     * @param model
     * @return una cadena de texto con el nombre del html a mostrar
     */
    @RequestMapping( value = "index",method = RequestMethod.GET)
    public String container( HttpServletRequest request, Model model) {
        System.out.println("aaaaaaa");
        return "index_";
    }
}
