/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtributosEstaticos.Ejercicios;

import java.util.ArrayList;

/**
 *
 * @author sebastian.eduardo.va
 */
public class Servidor {
    private String nombre;
    private int id;
    private static int conexionesActivas;
    private static ArrayList<Integer> idServidores = new ArrayList();
    
    
    public Servidor(String nombre){
    
    this.nombre = nombre;
    int nuevoId;
    
    do{
        
    nuevoId = (int) (Math.random()*100);
    } while(idServidores.contains(nuevoId));
    
    idServidores.add(nuevoId);
    this.setId(nuevoId);
    
    setConexionesActivas(conexionesActivas+1);
    
    }
    
    public Servidor(){
    
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
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the conexionesActivas
     */
    public static int getConexionesActivas() {
        return conexionesActivas;
    }

    /**
     * @param aConexionesActivas the conexionesActivas to set
     */
    public static void setConexionesActivas(int aConexionesActivas) {
        conexionesActivas = aConexionesActivas;
    }
    
    @Override
    
    public String toString(){
    return "Nombre del servidor: " + getNombre() +"|"+ "\nId del servidor: "+ getId()+"|"+"\nConexiones activas: " + getConexionesActivas()+"|";
    
    }
    
    
}
