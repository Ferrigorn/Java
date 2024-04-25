/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructurasdecontrol;

/**
 *
 * @author fbabu
 */
import java.util.Scanner;
public class EstructurasDeControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Mayor o menor*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige el primer número");
        int numero1 = scanner.nextInt();
        System.out.println("Elige el segundo número");
        int numero2 = scanner.nextInt();
        
        if (numero1 > numero2){
            System.out.println(numero1 + " es mayor que " + numero2);
        }else if(numero1 < numero2){
            System.out.println(numero2 + " es mayor que " + numero1);
        }else {
            System.out.println("Los dos números son iguales");
        }
        
        /*Bucle for*/
        for(int i = 1; i<=10; i++){
            System.out.println(i);
        }
        
        /*Bucle while*/
        int contador = 10;
        while (contador > 0){
            System.out.println(contador);
            contador--;
        }
        
        /*Para la suma consecutiva de numeros hasta el valor
        que haya introducido el usuario*/
        Usuario.sumaConsecutiva();
        
        /*Switch de distintas operaciones*/
        Usuario.tiposOperaciones();
    }
    
}
