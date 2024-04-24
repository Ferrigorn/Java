/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacionesbasicas;

/**
 *
 * @author fbabu
 */
import java.util.Scanner;
public class OperacionesUsuario {
     public static void operacionesU(){
         Scanner scanner = new Scanner(System.in);
     

        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = 0;
        double modulo = 0;
        double potencia = 0;

        if (numero2 != 0) {
            division = numero1 / numero2;
        } else {
            System.out.println("No se puede dividir por cero.");
        }

        modulo = numero1 % numero2;
        potencia = Math.pow(numero1, numero2);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);

        if (numero2 != 0) {
            System.out.println("División: " + division);
        }

        System.out.println("Módulo: " + modulo);
        System.out.println("Potencia: " + potencia);

        //scanner.close();
     }
}
