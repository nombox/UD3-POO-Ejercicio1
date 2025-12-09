/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AtributosEstaticos;

/**
 *
 * @author sebastian.eduardo.va
 */
public class AppUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario u1 = new Usuario("pepe", 20);
        Usuario u2 = new Usuario("Maria", 25);
        Usuario u3 = new Usuario("Javier", 55);
        
        System.out.println("El numero de usuarios creados es: "+ Usuario.getContadorUsuarios());
        System.out.println("EL numero de usuarios es: "+ Usuario.contadorPublico);
    }
    
}
