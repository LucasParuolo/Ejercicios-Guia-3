
import java.io.InputStream;
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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int salida = 4;
        String res;
        int selec;
                
        do{
         System.out.println("Menu");
         System.out.println("1: Sumar");
         System.out.println("2: Restar");
         System.out.println("3: Multiplicar");
         System.out.println("4: Dividir");
         System.out.println("5: Salir");
         System.out.println("Elija una Opcion");
         selec = leer.nextInt();
        
         switch(selec){
             case 1:
                 int num1 = leer.nextInt();
                 int num2 = leer.nextInt();
                 int suma = num1 + num2;
                 System.out.println("la suma de " + num1 + " y " + num2 + " es igual a " + suma);
                 break;
             case 2:
                 int num3 = leer.nextInt();
                 int num4 = leer.nextInt();
                 int resta = num3 - num4;
                 System.out.println("la suma de " + num3 + " y " + num4 + " es igual a " + resta);
                 break;
             case 3:
                 int num5 = leer.nextInt();
                 int num6 = leer.nextInt();
                 int mul = num5 * num6;
                 System.out.println("la suma de " + num5 + " y " + num6 + " es igual a " + mul);
                 break;
             case 4:
                 int num7 = leer.nextInt();
                 int num8 = leer.nextInt();
                 int div = num7 / num8;
                 System.out.println("la suma de " + num7 + " y " + num8 + " es igual a " + div);
                 break;
             case 5:
                 System.out.println("¿Esta seguro que desea salir del programa?(S/N)");
                 res = leer.next();
                 if (res.equals("S")){
                     salida = 6;
                 }
                 break;
         }
    } while(salida < 5);
    }

   
   
    
}
