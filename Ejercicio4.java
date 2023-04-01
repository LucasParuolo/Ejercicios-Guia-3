
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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba una frase que empiece con A");
        String Frase = leer.next();
        String primario = Frase.substring(0,1);
        
         if (primario.equals("A") || primario.equals("a")){
           System.out.println("Correcto");
       }else {
           System.out.println("Incorrecto");
       }       
    }
    
}
