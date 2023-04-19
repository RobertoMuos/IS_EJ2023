package org.example;

public class Estudiante {
    private int numeroControl;
    private String nombre;
    private Especialidad especialidad;

    public Estudiante(int numeroControl, String nombre, Especialidad especialidad) {
        this.numeroControl = numeroControl;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public int getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(int numeroControl) {
        this.numeroControl = numeroControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
}