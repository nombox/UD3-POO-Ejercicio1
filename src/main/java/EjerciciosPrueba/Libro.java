/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosPrueba;

/**
 *
 * @author sebas
 */
public class Libro {

    /*      Implementa una clase Libro, que va a tener un título, un autor, un
            numeroPaginas, puede estar abierto o cerrado, y una página actual. La
            clase va a contar con los siguientes métodos:
    
             abrir(): Marca el libro como abierto, mostrando un aviso por
            pantalla. Si el libro ya está abierto, no se puede volver a abrir.
             cerrar(): Marca el libro como cerrado, mostrando un aviso por
            pantalla. Si el libro ya está cerrado, no se puede volver a cerrar.
             pasarPagina(): Incrementa la página actual en uno. Muestra por
            pantalla la página que se acaba de leer. Si el libro está cerrado, no se
            puede pasar página.
             mostrarDatos(): Muestra por pantalla toda la información del libro
            en concreto.
    
                5. En base a esto, define una clase App con un método main en el que crees
            dos libros. Establece el valor de los atributos para ambos, y para el primero
            prueba el funcionamiento de los métodos definidos previamente. Para el
            segundo, define una página aleatoria entre 0 y la última página del libro, y
            pasa páginas hasta llegar a ella utilizando un bucle. Por último, muestra los
            datos de este libro.
     */

    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean estadoPaginas;
    private int paginaActual;

    //CONSTRUCTORES
    public Libro(String titulo, String autor, int numeroPaginas, boolean estadoPaginas, int paginaActual) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.estadoPaginas = estadoPaginas;
        this.paginaActual = paginaActual;
    }

    public Libro() {
    }

    //SETTERS Y GETTERS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public boolean getEstadoPaginas() {
        return estadoPaginas;
    }

    public void setEstadoPaginas(boolean estadoPaginas) {
        this.estadoPaginas = estadoPaginas;
    }

    public int getPaginaActual() {
        return paginaActual;
    }

    public void setPaginaActual(int paginaActual) {
        this.paginaActual = paginaActual;
    }

    //METODOS
    public void abrir() {
        /* abrir(): Marca el libro como abierto, mostrando un aviso por
            pantalla. Si el libro ya está abierto, no se puede volver a abrir.*/
        if (this.estadoPaginas == false) {
            System.out.println("Libro abierto");
            this.estadoPaginas = true;
        } else {
            System.out.println("No se puede volver a abrir porque el libro ya estaba abierto");
        }

    }

    public void cerrar() {
        /* cerrar(): Marca el libro como cerrado, mostrando un aviso por
           pantalla. Si el libro ya está cerrado, no se puede volver a cerrar.*/

        if (this.estadoPaginas == true) {
            System.out.println("Libro cerrado");
            this.estadoPaginas = false;
        } else {
            System.out.println("El libro ya estaba cerrado");
        }

    }

    public void pasarPagina() {

        /*  pasarPagina(): Incrementa la página actual en uno. Muestra por
            pantalla la página que se acaba de leer. Si el libro está cerrado, no se
            puede pasar página.*/
        if (this.paginaActual < this.numeroPaginas) {
            if (this.estadoPaginas == true) {
                System.out.println("La pagina que se paso fue la " + this.paginaActual);
                System.out.println("Pagina pasada");
                this.paginaActual += 1;
                System.out.println("Pagina actual "+this.paginaActual);
            } 
            
            if(this.estadoPaginas == false) {
                System.out.println("Libro cerrado, no se puede pasar pagina");
            }
        } else {
            System.out.println("El libro ya ha alcanzado su ultima pagina, se volvera al inicio");
            this.paginaActual = 1;
        }
    }

    public void mostrarDatos() {
        /*  mostrarDatos(): Muestra por pantalla toda la información del libro
           en concreto.*/
        String estadoLibro = null;
        if (this.estadoPaginas == true) {
            estadoLibro = "abierto";
        } else {
            estadoLibro = "cerrado";
        }

        System.out.println("El titulo del libro es " + this.titulo);
        System.out.println("El autor del libro es " + this.autor);
        System.out.println("El libro tiene aproximadamente " + this.numeroPaginas+ " paginas");
        System.out.println("El libro actualmente se encuentra " + estadoLibro);
        System.out.println("La pagina actual del libro es " + this.paginaActual);

    }

}
