package com.pruebaRecuperativa.Controllers;


import com.pruebaRecuperativa.Models.CitaMedica;
import com.pruebaRecuperativa.Models.Paciente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/paciente")
public class PacienteController {

    //primera pestaña de ingreso de datos para la tabla pacientes//
    @RequestMapping("")
    public String paciente(@ModelAttribute("paciente")Paciente paciente) {

        return "paciente.jsp";
    }

    //segunda pestaña de ingreso de los datos de la cita médica//

    @RequestMapping("/citaMedica")
    public String citaMedica(@ModelAttribute("citaMedica") CitaMedica citaMedica) {

        return "citaMedica.jsp";
    }




}
