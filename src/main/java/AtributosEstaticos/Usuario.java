/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtributosEstaticos;

/**
 *
 * @author sebastian.eduardo.va
 */
public class Usuario {
    private String nombre;
    private int edad;
    private static int contadorUsuarios = 0;
    public static int contadorPublico;
    
    public Usuario(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        setContadorUsuarios(contadorUsuarios+1);
        setContadorPublico(contadorPublico+1);
    }

    /**
     * @return the nombre
     */
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

    /**
     * @return the contadorUsuarios
     */
    public static int getContadorUsuarios() {
        return contadorUsuarios;
    }

    /**
     * @param aContadorUsuarios the contadorUsuarios to set
     */
    public static void setContadorUsuarios(int aContadorUsuarios) {
        contadorUsuarios = aContadorUsuarios;
    }

    /**
     * @return the contadorPublico
     */
    public static int getContadorPublico() {
        return contadorPublico;
    }

    /**
     * @param aContadorPublico the contadorPublico to set
     */
    public static void setContadorPublico(int aContadorPublico) {
        contadorPublico = aContadorPublico;
    }
            
}
