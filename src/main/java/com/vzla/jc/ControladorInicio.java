package com.vzla.jc;

import com.vzla.jc.domain.Persona;
import java.util.ArrayList;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {

    @Value("${index.saludo}")
    private String saludo;

    @GetMapping("/")
    public String inicio(Model model) {
        var mensaje = "Hola Mundo con Thymeleaf";
        var mensaje2 = "Hola a todos, este es otro mensaje";
        var mensaje3 = "La Lista personas esta vacia";

        var persona = new Persona();
        persona.setNombre("Jose");
        persona.setApellido("Cossi");
        persona.setEmail("josecossib@mail.com");
        persona.setTelefono("+541124023646");

        var persona2 = new Persona();
        persona2.setNombre("Luisa");
        persona2.setApellido("Gomez");
        persona2.setEmail("lgomez@mail.com");
        persona2.setTelefono("+541121523646");
        
        var persona3 = new Persona();
        persona3.setNombre("Amanda");
        persona3.setApellido("Cossi Gomez");
        persona3.setEmail("Amandacossigomez@mail.com");
        persona3.setTelefono("+541421523646");
        
        var persona4 = new Persona();
        persona4.setNombre("Carlos");
        persona4.setApellido("Olivares");
        persona4.setEmail("colivares120@mail.com");
        persona4.setTelefono("+541121987646");
        
        
        /*Agregamos un arrayList*/
      //  var personas = new ArrayList();
      //   personas.add(persona);
      //  personas.add(persona);
        
     // var personas = Arrays.asList(persona, persona2, persona3, persona4);
      var personas = new ArrayList();
        log.info("Ejecutando el controlador Spring MVC");
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("mensaje2", mensaje2);
        model.addAttribute("saludo", saludo);
       // model.addAttribute("persona", persona);
        model.addAttribute("personas", personas);
        model.addAttribute("mensaje3", mensaje3);

        return "index";
    }

}
