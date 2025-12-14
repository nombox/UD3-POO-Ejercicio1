/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.odam1.ud3_poo_ejercicio1.EjerciciosNumerados;

import com.odam1.ud3_poo_ejercicio1.EjerciciosNumerados.exception.TextTooLongException;
import com.odam1.ud3_poo_ejercicio1.EjerciciosNumerados.exception.TextTooShortException;

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
//        ejercicio4Nuevo();

        ejercicioExcepctions();
        
        
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

    static void ejercicio4Nuevo(){
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

        // 1. Ingreso de datos

        EstudianteNew nuevoEstudiante = null;
       while (nuevoEstudiante == null) {
           entradaTeclado.reset();
           try {
               // 1. SOLICITAR DATOS
               System.out.println("--- Registro de Estudiante ---");

               System.out.print("Introduce el nombre: ");
               String nombre = entradaTeclado.nextLine();

               System.out.print("Introduce la edad: ");
               int edad = entradaTeclado.nextInt();

               // para limpiar el buffer
               entradaTeclado.nextLine();
               NivelEstudios nivelEstudios = getNivelEstudios(entradaTeclado);

               //2. Creacion de estudiante
               nuevoEstudiante = new EstudianteNew(nombre,edad,nivelEstudios);
           } catch (Exception e) {
               //2.5 (Manejo de exceptions sobre datos del estudiante)
               System.out.println("Error de ingreso de datos: " + e.getMessage());
           }
       }
        //3. Dibujo en pantalla de los datos del estudiante creado
        System.out.println("Datos del estudiante: " + nuevoEstudiante);
    }

    private static NivelEstudios getNivelEstudios(Scanner entrada) {
        NivelEstudios nivelEstudios = null;
        while (nivelEstudios == null) {
            try {
                System.out.print("Introduce el nivel de estudios (PRIMARIA, SECUNDARIA, CICLOS, UNIVERSIDAD): ");
                String nivelTexto = entrada.next().toUpperCase();
                nivelEstudios = NivelEstudios.valueOf(nivelTexto); //IllegalArgumentException
                // para limpiar el buffer
                entrada.nextLine();
            } catch (IllegalArgumentException e){
                System.out.println("Error de valor de nivel de estudios: Nivel de estudios no reconocido.");
            }
        }
        return nivelEstudios;
    }

    private static void ejercicioExcepctions() {
        /* Diseñar un juego donde tienes que ingresar un texto y si es del tamaño correcto, entonces ganas.
         * De lo contrario, Mostrar un mensaje sigtificativo que muestre que tan cerca estuviste de adivinar
         */

        final int sizeCorrecto = 10;

        entradaTeclado.reset();
        System.out.print("Ingresa un texto a ver si adivinas el tamaño que se espera para un texto: ");
        String texto = entradaTeclado.nextLine();

        try {
            if (texto == null) {
                throw new RuntimeException("EL TEXTO NO PUEDE SER NULO.");
            }

            if (texto.length() < sizeCorrecto) {
                throw new TextTooShortException("EL TEXTO ES DEMASIADO CORTO.", sizeCorrecto - texto.length());
            }


            if (texto.length() > sizeCorrecto) {
                throw new TextTooLongException("EL TEXTO ES DEMASIADO LARGO.");
            }

            if (texto.length() == sizeCorrecto) {
                System.out.print("GANASTE! El tamaño correcto era " + sizeCorrecto + " tu texto es: " + texto);
            }
        } catch (TextTooLongException e) {
            System.out.print("Buena suerte la proxima! Ingresaste un texto muy largo.");
        } catch (TextTooShortException e) {
            System.out.print("Buena suerte la proxima! Ingresaste un texto muy corto.");
        } catch (Exception e) {
            System.out.print("Ha ocurrido un error inesperado! Por favor contacte con soporte a alicando@gmail.com, informacion de error: " + e);
        }

    }
}
