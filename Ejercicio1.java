
import java.util.Scanner;
import static sun.util.calendar.CalendarUtils.mod;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rober
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Crear un programa que dado un número determine si es par o impar.
       Scanner num = new Scanner(System.in);
       System.out.println("Ingrese un numero");
       int number = num.nextInt();
       
        if (number % 2 == 0)
        {
        System.out.println(number + " es un numero par");
        }else 
        {
            System.out.println(number + " es un numero inpar");
            }
        
        
    }
           
    
}
