/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.odam1.ud3_poo_ejercicio1.EjerciciosNumerados.SolucionesProfesora;

/**
 *
 * @author laura
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private NivelEstudios nivelEstudios;

    
    public Estudiante(String nombre, int edad, NivelEstudios nivel) {
        if (nombre == null || nombre.length() <= 3)
            throw new IllegalArgumentException("Nombre inválido");

        if (edad < 0 || edad > 120)
            throw new IllegalArgumentException("Edad inválida");

        if (nivel == null)
            throw new IllegalArgumentException("Nivel de estudios inválido");

        this.nombre = nombre;
        this.edad = edad;
        this.nivelEstudios = nivel;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the nivelEstudios
     */
    public NivelEstudios getNivelEstudios() {
        return nivelEstudios;
    }

    /**
     * @param nivelEstudios the nivelEstudios to set
     */
    public void setNivelEstudios(NivelEstudios nivelEstudios) {
        this.nivelEstudios = nivelEstudios;
    }
    
    @Override
    public String toString(){
        return this.nombre + " "+ this.edad + ", nivel de estudios: "+ this.nivelEstudios;
    }
}
