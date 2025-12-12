/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtributosEstaticos.Ejercicios;

/**
 *
 * @author sebastian.eduardo.va
 */
public class LogSistema {
    private static String log;
    
    //Constructor
    
    public LogSistema(String log){
    agregarLog(log);
    }
    
    public LogSistema(){}

    /**
     * @return the log
     */
    public static String getLog() {
        return log;
    }

    /**
     * @param aLog the log to set
     */
    public static void setLog(String aLog) {
        log = aLog;
    }
    
    public static void agregarLog(String mensaje){
        log += mensaje + " ";

    }
    

}
