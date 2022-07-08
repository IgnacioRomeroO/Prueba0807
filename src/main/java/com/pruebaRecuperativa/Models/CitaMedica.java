package com.pruebaRecuperativa.Models;

import javax.persistence.*;

@Entity
@Table(name = "citasClientes")
public class CitaMedica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String hora;
    private String areaMedica;

    //Constructores//


    public CitaMedica() {
        super();
    }

    public CitaMedica(Long id, String hora, String areaMedica) {
        super();
        this.id = id;
        this.hora = hora;
        this.areaMedica = areaMedica;
    }

    //Getters & Setter//


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getAreaMedica() {
        return areaMedica;
    }

    public void setAreaMedica(String areaMedica) {
        this.areaMedica = areaMedica;
    }
}
