package EjerciciosPrueba.Profe;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author fcl
 */
public class LibroProfesora {

   private String titulo;
   private String autor;
   private int numPaginas;
   private boolean abierto;
   private int pagActual;
   
   public LibroProfesora(String titulo, String autor, int numPaginas){
       this.titulo = titulo;
       this.autor = autor;
       this.numPaginas = numPaginas;
       this.abierto = false;
   }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the numPaginas
     */
    public int getNumPaginas() {
        return numPaginas;
    }

    /**
     * @param numPaginas the numPaginas to set
     */
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    /**
     * @return the abierto
     */
    public boolean isAbierto() {
        return abierto;
    }

    /**
     * @param abierto the abierto to set
     */
    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }
    
        /**
     * @return the pagActual
     */
    public int getPagActual() {
        return pagActual;
    }

    /**
     * @param pagActual the pagActual to set
     */
    public void setPagActual(int pagActual) {
        this.pagActual = pagActual;
    }
   
    public void abrir(){
        setAbierto(true);
    }
   
    public void cerrar(){
        setAbierto(false);
    }
    
    
   
    /*IMPORTANTE   
    La clase libro debería de encargarse de gestionar el estado del libro, y el código que usa el Libro debe encargarse de mostrar
    los mensajes al usuario
    */
    public boolean pasarPagina(){
        boolean paginaPasadaOK = true;
        
        if (!isAbierto()){
            paginaPasadaOK = false;
        }
        
        if (getPagActual()<getNumPaginas()){
            setPagActual(getPagActual()+1);
        }else{
            paginaPasadaOK = false;
        }
        
        return paginaPasadaOK;   
    }
    
    public void mostrarDatos(){
        System.out.println("***** LIBRO ******");
        System.out.println("Titulo:"+getTitulo());
        System.out.println("Autor:"+getAutor());
        System.out.println("PagActual:"+getPagActual());
        System.out.println("Estado:"+isAbierto());  
    }
    
    @Override
    public String toString(){
        return """
               ***** LIBRO ******
               titulo"""+getTitulo() + "\n" 
                + "Autor: " + getAutor() + "\n" 
                + "Abierto: " + isAbierto() + "\n"    
                + "Página actual: " + getPagActual() + "\n" 
                + "numPaginas:"+getNumPaginas();
    }
 

}
