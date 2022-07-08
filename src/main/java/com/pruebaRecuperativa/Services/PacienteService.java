package com.pruebaRecuperativa.Services;


import com.pruebaRecuperativa.Models.Paciente;
import com.pruebaRecuperativa.Repositorys.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PacienteService {

    @Autowired
    PacienteRepository pacienteRepository;

    public void guardarRegistroPaciente(Paciente paciente) {pacienteRepository.save(paciente);
    }



}
