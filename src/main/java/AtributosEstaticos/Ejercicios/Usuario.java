/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtributosEstaticos.Ejercicios;

/**
 *
 * @author sebastian.eduardo.va
 */
public class Usuario {
    /*
        Crea una clase Usuario con un atributo estático contadorIds que genere identificadores
    incrementales únicos. Cada nuevo usuario debe recibir un id distinto automáticamente,
    empezando por el 0.
    Crea 3 usuarios y muestra sus IDs
    */
    
    private String nombre;
    private int edad;
    private static int contadorIds;
    private int ids;
    
    public Usuario(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.ids = Usuario.getContadorIds();
        setContadorIds(contadorIds+1);
       
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
     * @return the contadorIds
     */
    public static int getContadorIds() {
        return contadorIds;
    }

    /**
     * @param aContadorIds the contadorIds to set
     */
    public static void setContadorIds(int aContadorIds) {
        contadorIds = aContadorIds;
    }
    
    //metodo que retorna    

    /**
     * @return the ids
     */
    public int getIds() {
        return ids;
    }

    /**
     * @param ids the ids to set
     */
    public void setIds(int ids) {
        this.ids = ids;
    }
    
    @Override
    public String toString(){
    return "Nombre: "+getNombre() + "\n Edad: " + getEdad() + "\n ID: " + getIds();
    
    }
    
}
