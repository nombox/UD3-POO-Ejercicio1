/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ArrayList.Ejercicios;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author sebastian.eduardo.va
 */
public class AppEjercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
    //ejercicio1();
    //ejercicio2();
    
    
    }
    
    static void ejercicio1(){
        /*
    Crea un programa que gestione una lista de invitados para una fiesta.
1. Crea un ArrayList<String>.
2. Añade manualmente (desde el código) los nombres de 5 personas.
3. Imprime la lista completa usando System.out.println.
4. Después, usa un bucle for-each para saludar a cada uno: "¡Hola [nombre], estás
invitado/a!".
5. Finalmente, imprime el total de invitados usando .size()
    */
    ArrayList<String> invitados = new ArrayList<>();
    
    invitados.add("Pedro");
    invitados.add("Marcos");
    invitados.add("Isabel");
    invitados.add("Jerundio");
    invitados.add("Mamasoila");
    
        System.out.println("Los invitados son: "+invitados);
        
        for(String invitado:invitados){
            System.out.println("Hola!"+invitado+" estas invitado/a!");
        }
        
        System.out.println("El total de invitados es: "+ invitados.size());
    
    }
    
    static void ejercicio2(){
     /*simula un carrito de la compra. El programa pedirá al usuario que introduzca artículos
hasta que escriba "fin".
1. Si el usuario escribe un artículo que ya está en la lista (ej: "Leche"), el programa
debe decir "¡Ese producto ya está en el carrito!" y no añadirlo.
2. Si no está, lo añade.
3. Al escribir "fin", muestra todos los artículos comprados separados por comas.
*/
    ArrayList<String> carritoCompra = new ArrayList<>();
    Scanner entradaTeclado = new Scanner(System.in);     
    String decision = "";
    carritoCompra.clear();
    
    while(!decision.equals("fin")){
        System.out.println("Agrega tu artículo o la palabra fin para terminar");
        decision = entradaTeclado.next();
        if(carritoCompra.contains(decision)){
            System.out.println("Ese articulo ya esta en el carrito!");
        } else{
            if(!decision.equals("fin")){
            carritoCompra.add(decision);}
        } 
    } System.out.println("Tu carrito de la compra es: "+carritoCompra);
        
    
    }
}
