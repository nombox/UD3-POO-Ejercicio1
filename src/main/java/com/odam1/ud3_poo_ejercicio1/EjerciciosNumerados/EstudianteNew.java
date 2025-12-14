package com.odam1.ud3_poo_ejercicio1.EjerciciosNumerados;

public class EstudianteNew {

    private String nombre;
    private int edad;
    private NivelEstudios nivelEstudios;

    public EstudianteNew(String nombre, int edad, NivelEstudios nivelEstudios) {
        if (nombre == null || nombre.trim().length() < 3) {
            throw new RuntimeException("El nombre tiene menos de 3 caracteres, por favor ingrese un nombre valido.");
        }

        if (edad < 0 || edad > 120) {
            throw new RuntimeException("La edad tiene que estar entre 0 y 120, por favor ingrese una edad valida.");
        }

        this.nombre = nombre;
        this.edad = edad;
        this.nivelEstudios = nivelEstudios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public NivelEstudios getNivelEstudios() {
        return nivelEstudios;
    }

    public void setNivelEstudios(NivelEstudios nivelEstudios) {
        this.nivelEstudios = nivelEstudios;
    }

    @Override
    public String toString() {
        return "EstudianteNew{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", nivelEstudios=" + nivelEstudios +
                '}';
    }
}
