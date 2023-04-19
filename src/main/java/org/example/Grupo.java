package org.example;

public class Grupo {
    private String RFC;
    private String nombre;

    private ArrayList<Estudiante> estudiantes = null;

    public Grupo(String RFC, String nombre, ArrayList<Estudiante> estudiantes) {
        this.RFC = RFC;
        this.nombre = nombre;
        this.estudiantes = estudiantes;
    }


    @Override
    public String toString(){
        return this.getRFC()+ "" + this.nombre+ this.estudiantes.toString();
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
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
