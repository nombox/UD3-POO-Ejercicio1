/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPrueba;

/**
 *
 * @author sebastian.eduardo.va
 */
public class Circulo {

    //EJERCICIO 1
    /*Implementa una clase llamada Circulo, que tiene un atributo radio, y
          métodos para calcular la circunferencia, calcular el área y calcular el
          diámetro. Define una clase App con un método main en el que crees el
          objeto miCirculo, que tendrá que tener un radio, y calcula la circunferencia,
          el área y el diámetro*/
    private float radio;
    
    //CONSTRUCTORES
    
    public Circulo(float radio){
    this.radio = radio;
    }
    
    public Circulo(){
    
    }
    
    //------

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public void calcularArea() {
        System.out.println("tu area es: " + (Math.round(Math.PI * Math.pow(this.radio, 2) * 100) / 100f));
    }

    public void calcularDiametro() {
        System.out.println("Tu Diamentro es: " + (Math.round((2 * this.radio) * 100)) / 100);
    }

    public void calcularCircunferencia() {
        System.out.println("Tu Circunferencia es: " + (Math.round((2 * Math.PI * this.radio))) / 100);

    }

}
