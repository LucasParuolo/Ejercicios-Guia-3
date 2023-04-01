
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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escriba un numero");
        int cant = leer.nextInt();
        
        
        
        for (int cont1 = 0; cont1 < cant; cont1++){
            for (int cont2 = 0; cont2 < cant; cont2++){
                if (cont1 > 0 && cont1 < cant-1 && cont2 > 0 && cont2 < cant-1){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
                }
            System.out.println(" ");
            }
        }
    }
    
