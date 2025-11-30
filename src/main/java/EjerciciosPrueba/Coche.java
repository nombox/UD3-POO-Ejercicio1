/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPrueba;

/**
 *
 * @author sebas
 */
public class Coche {
    
                 /*Implementa una clase Coche que va a tener dos atributos, velocidad y
                matrícula, y los métodos acelerar(int incremento), frenar(int
                decremento) y mostrarVelocidad(), que muestra por pantalla la
                velocidad del vehículo. Define una clase App con un método main en el que
                crees dos objetos de tipo coche. Establece velocidades diferentes en cada
                uno, y llama varias veces a acelerar y frenar con valores distintos en cada
                uno de los objetos mostrando posteriormente la velocidad.*/

    private int velocidad;
    private String matricula;
    
    //CONSTRUCTORES
    public Coche(int velocidad, String matricula){
        this.velocidad = velocidad;
        this.matricula = matricula;
    }
    
    public Coche(){
    }
    
    //SETTERS Y GETTERS
    public int getVelocidad(){
    return velocidad;
    }
    
    public void setVelocidad(int velocidad){
    this.velocidad = velocidad;
    }
    
    public String getMatricula(){
    return matricula;
    }
    
    public void setMatricula(String matricula){
    this.matricula = matricula;
    }
    
    //METODOS
    public void acelerar(int incremento){ 

        this.velocidad = this.velocidad + incremento;
        
    }
            
    public void frenar(int decremento){
     
     this.velocidad = this.velocidad - decremento;
     
     if(this.velocidad<0){
         this.velocidad = 0;
     }
     
    } 
    
    public void mostrarVelocidad(){
        
        if(this.velocidad==0){
        System.out.println("El coche de matricula " + this.matricula+ " se ha detenido ya que su velocidad es de: " + this.velocidad + " km/h.");
        
        } else{System.out.println("Velocidad final del coche " + this.matricula+ " es: " + this.velocidad + " km/h.");}

    }
    
    
    
    
    
}
