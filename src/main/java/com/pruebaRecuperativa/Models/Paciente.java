package com.pruebaRecuperativa.Models;


import javax.persistence.*;

@Entity
@Table(name="pacientes")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //Atributos//

    private Long id;
    private String rut;
    private String nombre;
    private String fechaNacimiento;

    //Constructores//


    public Paciente() {
        super();
    }

    public Paciente(Long id, String rut, String nombre, String fechaNacimiento) {
        super();
        this.id = id;
        this.rut = rut;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    //Getters & Setters//


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idPaciente")
    private CitaMedica citaMedica;
}
