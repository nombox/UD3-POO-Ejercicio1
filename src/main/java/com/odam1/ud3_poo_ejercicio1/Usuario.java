/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.odam1.ud3_poo_ejercicio1;

/**
 *
 * @author sebastian.eduardo.va
 */
public class Usuario {
    private String nombre;
    private String email;
    
    //GETTER Y SETTER
    
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    //Para poder usarlo vacío o sea agergarle en el main las caracteristicas como yo las quiera
    public Usuario(){
    
    }
    
    //CONSTRUCTOR
    public Usuario(String nombre, String email){
        this.nombre = nombre;
        this.email = email;
    }
    
    //Usuario 2
    
    
    
    public void mostrarInfo(){
        System.out.println("Bienvenido "+"usuario: "+getNombre()+", Email: "+ getEmail());
    }

    
}
