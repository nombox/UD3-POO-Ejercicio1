package com.odam1.ud3_poo_ejercicio1.EjerciciosNumerados;

public class Bachiller extends EstudianteNew {

    private String seccion;

    public Bachiller(String nombre, int edad, NivelEstudios nivelEstudios, String seccion) {
        super(nombre, edad, nivelEstudios);

        if (seccion == null || seccion.length() != 1) {
            throw new RuntimeException("La seccion debe contener una sola letra.");
        }
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
}
