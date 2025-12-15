/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ArrayList;

import java.util.ArrayList;

/**
 *
 * @author sebastian.eduardo.va
 */
public class App {

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
        
        System.out.println("Lista de pasajeros: "+pasajeros);
        
        //Mostrar con bucle clasico
        System.out.println("Bucle For Clasico");
        for (int i=0; i<pasajeros.size();i++){
            System.out.println(pasajeros.get(i));
        }
        
        //Bucle for each
        
        System.out.println("Bucle For-each");
        for(String pasajero:pasajeros){
            System.out.println(pasajero);
        }
        
        //Buscar un pasajero en concreto
        System.out.println("El pasajero del asiento 2 se llama "+pasajeros.get(1));
    
        //Modificar un pasajero y que otro ocupa su lugar
        pasajeros.set(3, "Juana");
        System.out.println("Pasajeros despues de la sustitución de Ana: " +pasajeros);
        
        //Un pasajero se siente mal y hay que sacarlo del bus. Eliminarlo
        pasajeros.remove(5);
        //pasajeros.remove("Laura"); <-- otra forma de hacerlo por el contenido
        
        System.out.println("Lista de pasajeros despues de la baja:"+pasajeros);
        
        //Terminó el trayecto, los pasajero se bajan y se vacía la lista
        pasajeros.clear();
    }
    
    
}
