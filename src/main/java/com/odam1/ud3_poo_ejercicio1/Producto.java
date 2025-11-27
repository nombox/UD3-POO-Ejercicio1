/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.odam1.ud3_poo_ejercicio1;

/**
 *
 * @author sebastian.eduardo.va
 */
public class Producto {
    String codigoProducto;
    float precio;
    String nombre;
    
    
    public Producto(String codigoProducto, float precio, String nombre){
        this.codigoProducto = codigoProducto;
        this.precio = precio;
        this.nombre = nombre;
    }
    
    public void mostrarInfor(){
        System.out.println("Producto: "+nombre+". Codigo: "+ codigoProducto
                            +", precio: "+precio);
    }
}
