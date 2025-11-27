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
    String nombre;
    String email;
    
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
        System.out.println("Bienvenido "+"usuario: "+nombre+", Email: "+ email);
    }
}
