package org.example;

public class Materia {
    private int ID;
    private String nombre;

    public Materia(int ID, String nombre) {
        this.ID = ID;
        this.nombre = nombre;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }


}
