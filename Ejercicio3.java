
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rober
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       System.out.println("Escriba una frase");
       String frase = leer.next();
       
       if (frase.length() ==8){
           System.out.println("La frase tiene 8 caracteres");
       }else {
           System.out.println("Esta frase no tiene 8 caracteres");
       }
    } 
    
    
    
}
