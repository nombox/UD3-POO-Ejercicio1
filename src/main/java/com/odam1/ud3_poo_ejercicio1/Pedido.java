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
    private Usuario usuario;
    private Producto producto;
    private int cantidad;
    
    public void mostrarInfor(){
        System.out.println("");
        System.out.println("****Informacion del pedido****");
        System.out.println("Usuario: "+getUsuario().getNombre());
        System.out.println("Producto: " +getProducto().getNombre());
        System.out.println("Cantidad pedida: "+getCantidad());
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
