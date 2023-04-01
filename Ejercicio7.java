
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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner read = new Scanner(System.in);
        
        String cadena;
        int tic = 4;
        int lon;
        int total = 0;
        int correc = 0;
        int error = 0;
        
        do{
        System.out.println("Introdusca una cadena");
        
        int pass = 0;
        
        cadena = read.nextLine();
        lon = cadena.length();
        if (pass == 0){
            if (cadena.equals("&&&&&")){
                pass = 1;
                tic = 5;
            }
        }
        
        if (pass == 0){
         if (cadena.length() > 5){
             error += 1;
             pass = 1;
         }
        }
         String primario = cadena.substring(0, 1);
         String secundario = cadena.substring(lon-1, lon);
         if (pass == 0){
           if (primario.equals("X") || secundario.equals("O")){
            correc += 1;
           }else{ 
            error += 1;
           }
         }
             
         if (tic != 5){
         total += 1;
         }
         
    } while(tic != 5);
        System.out.println("Se realizaron un total de " + total + " de envios");
        System.out.println(correc + " de ellos correctos");
        System.out.println("Y " + error + " de ellos incorrectos");
    }
    
}
