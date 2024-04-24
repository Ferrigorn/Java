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
public class PromedioUsuario {
    public static double calcularPromedio(){
        Scanner escanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        double numero1 = escanner.nextDouble();
        System.out.println("Ingrese el segundo numero");
        double numero2 = escanner.nextDouble();
        System.out.println("Ingrese el tercer numero");
        double numero3 = escanner.nextDouble();
        System.out.println("Ingrese el cuarto numero");
        double numero4 = escanner.nextDouble();
        System.out.println("Ingrese el quinto numero");
        double numero5 = escanner.nextDouble();
        
        double promedio = (numero1 + numero2 + numero3 + numero4 + numero5) / 5;
        return promedio;
        
        
    }
}
