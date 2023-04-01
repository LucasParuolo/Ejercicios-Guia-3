
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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba un limite");
        int limite = leer.nextInt();

        int suma = 0;
        
        while(limite > suma){
             System.out.println("Escriba un numero");
             int num1 =leer.nextInt();
             suma +=  num1;
             
        }
        
    }

    
    
}
