/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.odam1.ud3_poo_ejercicio1.EjerciciosNumerados;

/**
 *
 * @author sebastian.eduardo.va
 */

        /*Define una enumeración llamada NivelEstudios con valores: PRIMARIA,
        SECUNDARIA, CICLOS, UNIVERSIDAD.
        
          Define también una clase llamada Estudiante que tenga como atributos: nombre, edad y nivel
        de estudios. Haz los atributos privados e incluye getters y setters.
        
          Haz un programa que solicite al usuario los datos de un alumno, y si todos son correctos, cree
        una instancia de Alumno y muestre el método toString del mismo, que permitirá visualizar
        todos sus atributos en una línea. 
        
          Los datos son correctos:
            *si el nombre ocupa más de 3 caracteres. 
            *la edad está entre 0 y 120 y el nivel de estudios introducido se corresponde con un
                valor de la enumeración definida*/


public class Estudiante {
    
    private String nombre;
    private int edad;
    private NivelEstudios nivelEstudio;
    
    //CONSTRUCTOR
    public Estudiante(String nombre, int edad, NivelEstudios nivelEstudio){
    this.nombre = nombre;
    this.edad  = edad;
    this.nivelEstudio = nivelEstudio;
    }
    
    public Estudiante(){
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
    public boolean setNombre(String nombre) {
        if(nombre.length()<=3){
           return false;
        } else{this.nombre = nombre;
            return true;
        }
        
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
    public boolean setEdad(int edad) {
        
        if(edad < 0 || edad > 120){
            return false;
        } else{this.edad = edad;
            return true;
        }
        
        
    }

    /**
     * @return the nivelEstudio
     */
    public NivelEstudios getNivelEstudio() {
        return nivelEstudio;
    }

    /**
     * @param nivelEstudio the nivelEstudio to set
     */
    public boolean setNivelEstudio(String nivelEstudio) {
        try {
            // Intentamos convertir el texto al ENUM
            this.nivelEstudio = NivelEstudios.valueOf(nivelEstudio.toUpperCase());
            return true;
        } catch (IllegalArgumentException e) {
            return false; // No coincidía con ninguno del Enum
        } catch (NullPointerException e) {
             return false; // Por si mandan nulo
        }
    }
    
    
    
    //Metodo toString
    
    @Override
    public String toString(){
        return "Estudiante: " + nombre + " | Edad: " + edad + " | Nivel: " + nivelEstudio;
    }
    
}
