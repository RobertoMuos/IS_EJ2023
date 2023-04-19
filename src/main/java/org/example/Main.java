package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hola");
        System.out.println("Joel");
        System.out.println("Javier");

        Grupo grupos = new Grupo("2","A", new ArrayList<Estudiante>(){

            {
                //int numeroControl, String nombre, Especialidad especialidad
                add(12,"Javier","Sistemas");
            };

        });


    }

}