/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.odam1.ud3_poo_ejercicio1;

/**
 *
 * @author sebastian.eduardo.va
 */
public class Pedido {
    Usuario usuario;
    Producto producto;
    int cantidad;
    
    public void mostrarInfor(){
        System.out.println("Información del pedido");
        System.out.println("Usuario: "+usuario.nombre);
        System.out.println("Producto: " +producto.nombre);
        System.out.println("Cantidad pedida: "+cantidad);
    }
}
