/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AtributosEstaticos.Ejercicios;

/**
 *
 * @author sebastian.eduardo.va
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ejercicio1();
        
        //EJERCICIO 2
        Servidor serv1 = new Servidor("Ip1");
        Servidor serv2 = new Servidor("Ip2");
        Servidor serv3 = new Servidor("Ip3");
        System.out.println("========================");
        System.out.println(serv1);
        System.out.println("------------------------");
        System.out.println(serv2);
        System.out.println("------------------------");
        System.out.println(serv3);
        System.out.println("========================");

    }
    static void ejercicio1(){   
        //Ejercicio 1
        Usuario u1 = new Usuario ("Carlos", 25);
        Usuario u2 = new Usuario ("Perla", 35);
        Usuario u3 = new Usuario ("Juan", 20);
        
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);
    }
}
