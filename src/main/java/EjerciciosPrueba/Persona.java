/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPrueba;

/**
 *
 * @author sebastian.eduardo.va
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    
    //CONSTRUCTORES
    
    public Persona(String nombre, String apellido, int edad){
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    }
    
    public Persona(){
    }

    //GETTERS Y SETTERS
    
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //METODOS
    public void presentarse(){
        System.out.println("Hola! Soy " + nombre +" "+apellido + " y tengo " + edad + " años.");
    }
    
    public void hablar(Persona persona1){
        System.out.println("Hola "+ persona1.nombre +"."
                            + " Yo soy "+ nombre +" "+ apellido + " y tengo "+ edad + " años");
        
    }
}
