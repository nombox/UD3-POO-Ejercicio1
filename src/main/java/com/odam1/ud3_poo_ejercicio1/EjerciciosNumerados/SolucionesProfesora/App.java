/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.odam1.ud3_poo_ejercicio1.EjerciciosNumerados.SolucionesProfesora;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class App {

    public static void main(String[] args) {
       Scanner entradaTeclado = new Scanner(System.in);
      
       //Ejercicio 1
       Meses varMes = Meses.MARZO;
       
       System.out.println("La variable contiene el mes:"+varMes.name());
       System.out.println("Se trata del mes "+(varMes.ordinal()+1)+ " del año");
        
       //Ejercicio 2
       for (Meses mes: Meses.values()){
           System.out.println("MES:"+mes.name()+"- POSICION:"+mes.ordinal());
       }   
       
       //Ejercicio 3
       System.out.println("Introduce una puntuación:suspenso, aprobado, notable o sobresaliente");
       String puntuacionUsuario = entradaTeclado.next().toUpperCase();
       
       try{
           Puntuacion puntuacionUsuarioEnum = Puntuacion.valueOf(puntuacionUsuario);
           System.out.println("Has seleccionado:"+puntuacionUsuario);
       }catch(IllegalArgumentException e){
           System.out.println("Valor incorrecto");
       }
       
       //Ejercicio 5
       try{
            Estudiante e = new Estudiante("Pepe", 20, NivelEstudios.CICLOS);
       }catch(IllegalArgumentException e){
            e.getMessage();
        }
    }
    
}
