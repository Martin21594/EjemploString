/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author Español
 */
public class EjemploString2 {
    
    
       public static void main(String[] args) {
        String cadena="Automovil";
        
        char letra1=cadena.charAt(0); //indica la posicion que va a mostar 
        char letra2=cadena.charAt(2);
        char letra3=cadena.charAt(5);
        
        System.out.println(letra1);//informa la posicion del String
        System.out.println(letra2);
        System.out.println(letra3);
        
        
        String cadena2="CasaRodante";
        
        char letra01=cadena2.charAt(0); //indica la posicion que va a mostar 
        char letra02=cadena2.charAt(1);
        char letra03=cadena2.charAt(2);
        
        System.out.println(letra01);//informa la posicion del String
        System.out.println(letra02);
        System.out.println(letra03);
        
        
        String cadena3="CursoJavaEXO";
        
        System.out.println(cadena3.toLowerCase()); //muestra todo en minuscula
        
           System.out.println(cadena3.startsWith("a")); 
             //evalua si la primera letra empieza en lo indicado muestra "V"o"F"
             
             System.out.println(cadena3.equals("Curso"));//compara si es V o F
             
             System.out.println(cadena3.toUpperCase()); // pasa todo a mayuscula
            
             System.out.println(cadena3.replace("a","e"));
             //reemplaza todos los caracteres A por la letra E.
             
             System.out.println(cadena3.endsWith("a"));
             //evalua si la ultima letra es verdadera o falsa segun lo indicado.
             
             System.out.println(cadena3.indexOf("Java"));
             //muestra la posicion donde empezo la palabra java en numero.
             
             
             
             
        
        
    }
}
    

