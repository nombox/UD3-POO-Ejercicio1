/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosPrueba.Profe;

import EjerciciosPrueba.Profe.LibroProfesora;
import EjerciciosPrueba.Profe.LibroProfesora;

/**
 *
 * @author fcl
 */
public class App_Libro {

  
    public static void main(String[] args) {
        
        LibroProfesora libro1 = new LibroProfesora("Titulo1","Maria",100);
        LibroProfesora libro2 = new LibroProfesora("Titulo2","Pepe",150);
        
        //Probamos los métodos con libro1
        System.out.println("Abriendo el libro1");
        libro1.abrir();
        //Ver pagina actual
        System.out.println("Estoy en la pagina: "+libro1.getPagActual());
        //Paso una pagina
        System.out.println("Pasando una pagina");
        libro1.pasarPagina();
        //Compruebo que avancé una página
        System.out.println("Pagina actual: "+libro1.getPagActual());
        //Cerramos el libro
        System.out.println("Cerrando el libro");
        libro1.cerrar();
        
        if (!libro1.pasarPagina()){
            System.out.println("El libro ya esta cerrado");
        }
        
        //Abrir el libro2
        libro2.setAbierto(true);
        int paginaAleatoria = 20;
        libro2.setPagActual(paginaAleatoria);
        
        System.out.println("PASAMOS LAS PAGINAS DEL LIBRO2");
        while (libro2.pasarPagina()){
            System.out.println("Pagina actual:"+libro2.getPagActual());
        }
        
        if (libro2.getPagActual() == libro2.getNumPaginas()){
            System.out.println("Hemos llegado a la última página");
        }
        System.out.println("QUE SALE AQUI?????");
        System.out.println(libro2);
        
        
             
        
        
    }
    
}
