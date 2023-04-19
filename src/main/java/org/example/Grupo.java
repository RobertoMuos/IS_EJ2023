package org.example;

public class Grupo {
    private String RFC;
    private String nombre;

    public Grupo(String RFC, String nombre) {
        this.RFC = RFC;
        this.nombre = nombre;
    }

    public String getRFC() {
        return RFC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
