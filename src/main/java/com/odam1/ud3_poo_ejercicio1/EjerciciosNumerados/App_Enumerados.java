/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.odam1.ud3_poo_ejercicio1.EjerciciosNumerados;

import java.util.Scanner;

/**
 *
 * @author sebastian.eduardo.va
 */
public class App_Enumerados {
    public static Scanner entradaTeclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        //diasSemanas();
        //ejercicio1();
        //ejercicio3();
        
        
        
    }
    
    static void diasSemanas(){
    DiaSemana miDiaFavorito = DiaSemana.SABADO;
        System.out.println("Dia de la semana favorito: "+ miDiaFavorito);
        
        System.out.println("Mi día favorito en texto "+miDiaFavorito.name()+" y es el dia: "+(miDiaFavorito.ordinal()+1));
        
        System.out.println("Cual es tu día favorito");
        
        for(DiaSemana dia: DiaSemana.values()) //Funciona como un array del numerado
        {
            System.out.println("dia: "+ dia);
        }
        
        
        String diaUsuario = entradaTeclado.next().toUpperCase();
        try{
            DiaSemana diaUsuarioEnUM = DiaSemana.valueOf(diaUsuario);
            System.out.println("Dia escogido (enum) "+diaUsuarioEnUM);
        }catch(IllegalArgumentException e){
            System.out.println("Ese dia no existe!!!");
        }
    
    }
    
    static void ejercicio1(){
        /*
        Crea un enum llamado Meses con los 12 meses del año.
        En el main:
            1. Asigna el valor Meses.MARZO a una variable.
            2. Muestra por pantalla su name().
            3. Muestra su ordinal().
        */
        
        Meses mesElegido = Meses.MARZO;
        System.out.println("EL mes elegido es "+ mesElegido.name());
        System.out.println("Su ordinal en la cadena es "+(mesElegido.ordinal()+1));
        
        //EJERCICIO 2
        
        for(Meses mes: Meses.values()){
            System.out.println("Mes: "+mes+ ", posicion: "+ mes.ordinal());
        }
        
    } 
    
    static void ejercicio3(){
    /*Ejercicio 3
    Crea un enum llamado Puntuacion con valores:
    SUSPENSO, APROBADO, NOTABLE, SOBRESALIENTE
    En el main:
    1. Pide al usuario que introduzca una de esas palabras.
    2. Convierte el texto a enum usando Puntuacion.valueOf(...).
    3. Maneja posibles errores con un try/catch.
    4. Muestra:
    "Has seleccionado: APROBADO".*/
        
        
        
        System.out.println("Elige una puntuacion");
        String eleccion = entradaTeclado.next().toUpperCase();
        try{
        Puntuacion miPuntuacion = Puntuacion.valueOf(eleccion);
        System.out.println("Tu eleccion fue "+miPuntuacion);
        }catch(IllegalArgumentException e){
            System.out.println("Ese dia no existe!!!");
        }
        

    }
}
