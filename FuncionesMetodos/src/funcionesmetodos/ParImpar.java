/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionesmetodos;

/**
 *
 * @author fbabu
 */
public class ParImpar {
    public static boolean esPar(int num){
        boolean verdad = false;
        if (num % 2 ==0){
            verdad = true;
            System.out.println("El numero " + num + " es par");
        }
        return verdad;
    }
}
