/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ArrayList.EjemploBorrado;

import java.util.ArrayList;

/**
 *
 * @author sebastian.eduardo.va
 */
public class EjemploArrayListBorrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Ejemplo pasajeros de un viaje
        
        ArrayList<String> pasajeros = new ArrayList<>();
        
        //Agregando pasajeros que suben al bus
        
        pasajeros.add("Pepe");
        pasajeros.add("Pedro");
        pasajeros.add("Maria");
        pasajeros.add("Ana");
        pasajeros.add("Luis");
        pasajeros.add("Laura");
        
        //Borrar todos los elementos que comiencen por P del metodo clasico INCORRECTO
        /*for (int i = 0; i<pasajeros.size(); i++){
            if(pasajeros.get(i).charAt(0)=='P'){
            
            pasajeros.remove(i);
            }
           
        }
        */
        
        //De la manera correcta es de adelante hacia atras
        for (int i=pasajeros.size()-1; i>=0;i--){
        if(pasajeros.get(i).charAt(0)=='P'){
            
            pasajeros.remove(i);
            }
        }
         System.out.println("Pasajeros"+pasajeros);
    }
    
}
