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
        //ejercicio4();
 
        
        
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
    
    static void ejercicio4(){
        /*Define una enumeración llamada NivelEstudios con valores: PRIMARIA,
        SECUNDARIA, CICLOS, UNIVERSIDAD.
        
          Define también una clase llamada Estudiante que tenga como atributos: nombre, edad y nivel
        de estudios. Haz los atributos privados e incluye getters y setters.
        
          Haz un programa que solicite al usuario los datos de un alumno, y si todos son correctos, cree
        una instancia de Alumno y muestre el método toString del mismo, que permitirá visualizar
        todos sus atributos en una línea. 
        
          Los datos son correctos:
            *si el nombre ocupa más de 3 caracteres. 
            *la edad está entre 0 y 120 y el nivel de estudios introducido se corresponde con un
                valor de la enumeración definida*/
        
     //Creo el objeto
        Estudiante nuevoEstudiante = new Estudiante();
        //booleano para saber si todo esta correcto
        boolean todoCorrecto = true;

        // 1. SOLICITAR DATOS
        System.out.println("--- Registro de Estudiante ---");
        
        System.out.print("Introduce el nombre: ");
        String nombre = entradaTeclado.nextLine();

        if(!nuevoEstudiante.setNombre(nombre)){
        System.out.println("Error el nombre debe tener más de 3 caracteres");
        todoCorrecto = false;
        }
        

        System.out.print("Introduce la edad: ");
        int edad = entradaTeclado.nextInt(); 
        
        if(!nuevoEstudiante.setEdad(edad)){
         System.out.println("La edad del usuario debe ser entre 0 y 120");
        todoCorrecto = false;
        }
        
  
        // para limpiar el buffer
        entradaTeclado.nextLine(); 

        System.out.print("Introduce el nivel de estudios (PRIMARIA, SECUNDARIA, CICLOS, UNIVERSIDAD): ");
        String nivelTexto = entradaTeclado.next().toUpperCase(); 
        
        if(!nuevoEstudiante.setNivelEstudio(nivelTexto)){
            System.out.println("Error: Nivel de estudios no reconocido.");
            todoCorrecto = false;
        }

        // 2. VALIDAR DATOS
        // Vamos a usar una variable booleana para controlar si todo es correcto

        
        //Creacion del objeto usuario
        
        if(todoCorrecto){
            
            System.out.println("Nuevo estudiante creado con exito");
            System.out.println(nuevoEstudiante.toString());
        } else{System.out.println("No se pudo crear el estudiante debido a un error");}
        
        
    
    }
}
