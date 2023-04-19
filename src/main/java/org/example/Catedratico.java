package org.example;

public class Catedratico {

    private String nombreCatedratico;
    private String apellidosCatedratico;
    private String nivelMaximoEstudios;
    private String especialidad;
    private String claveCatedratico;
    private String grupo;

    public Catedratico(String nombreCatedratico, String apellidosCatedratico, String nivelMaximoEstudios, String especialidad, String claveCatedratico, String grupo) {
        this.nombreCatedratico = nombreCatedratico;
        this.apellidosCatedratico = apellidosCatedratico;
        this.nivelMaximoEstudios = nivelMaximoEstudios;
        this.especialidad = especialidad;
        this.claveCatedratico = claveCatedratico;
        this.grupo = grupo;
    }



    public String getNombreCatedratico() {
        return nombreCatedratico;
    }

    public void setNombreCatedratico(String nombreCatedratico) {
        this.nombreCatedratico = nombreCatedratico;
    }

    public String getApellidosCatedratico() {
        return apellidosCatedratico;
    }

    public void setApellidosCatedratico(String apellidosCatedratico) {
        this.apellidosCatedratico = apellidosCatedratico;
    }

    public String getNivelMaximoEstudios() {
        return nivelMaximoEstudios;
    }

    public void setNivelMaximoEstudios(String nivelMaximoEstudios) {
        this.nivelMaximoEstudios = nivelMaximoEstudios;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getClaveCatedratico() {
        return claveCatedratico;
    }

    public void setClaveCatedratico(String claveCatedratico) {
        this.claveCatedratico = claveCatedratico;
    }
}
