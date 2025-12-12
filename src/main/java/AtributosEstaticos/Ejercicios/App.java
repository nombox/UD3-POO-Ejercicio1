/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AtributosEstaticos.Ejercicios;

import java.util.Scanner;



/**
 *
 * @author sebastian.eduardo.va
 */
public class App {
    public static Scanner entradaTeclado = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        System.out.println("Crea un mensaje para concatenar");
        String mensaje1 = entradaTeclado.next();
        
        System.out.println("Crea un segundo mensaje");
        String mensaje2 = entradaTeclado.next();
        
        System.out.println("Crea un tercer mensaje");
        String mensaje3 = entradaTeclado.next();
        
        LogSistema sistema1 = new LogSistema(mensaje1);
        LogSistema sistema2 = new LogSistema(mensaje2);
        LogSistema sistema3 = new LogSistema(mensaje3);
        
        System.out.println(LogSistema.getLog());

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
    
    static void ejercicio2(){
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
    
    static void ejercicio3(){
    int operador1 = 3;
        int operador2 = 2;
        
        System.out.println("El resultado de tu suma es: "+ Calculadora.sumar(operador1, operador2));
        System.out.println("El resultado de tu resta es: "+ Calculadora.restar(operador1, operador2));
        System.out.println("El resultado de tu multiplicacion es: "+ Calculadora.multiplicar(operador1, operador2));
        System.out.println("El resultado de tu division es: "+ Calculadora.dividir(operador1, operador2));
    
    }
}
