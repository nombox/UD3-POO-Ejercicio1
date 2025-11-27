/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.odam1.ud3_poo_ejercicio1;

/**
 *
 * @author sebastian.eduardo.va
 */
public class App {

    public static void main(String[] args) {

        System.out.println("***TIENDA ONLINE***");
        
        Usuario usuario1 = new Usuario();
        usuario1.nombre = "Pepe";
        usuario1.email = "pepe@gmail.com";

        usuario1.mostrarInfo();
        
        //Usuario 2
        Usuario usuario2 = new Usuario("Maria", "margia@gmail.com");
        
        //Creo un producto
        /*Producto producto1 = new Producto();
        producto1.nombre = "camiseta";
        producto1.codigoProducto = "00001";
        producto1.precio= 24.95f;*/
        
        Producto producto2 = new Producto("Camiseta", 24.34f, "00001");
        
        producto2.mostrarInfor();
        
        //El usuario1 hace un pedido de 2 unidades de producto1
        
        //
        Pedido pedido1 = new Pedido();
        pedido1.usuario = usuario1;
        pedido1.producto = producto2;
        pedido1.cantidad = 2;
        
        pedido1.mostrarInfor();
    }
}
