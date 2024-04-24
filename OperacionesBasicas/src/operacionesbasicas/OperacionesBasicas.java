/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacionesbasicas;

/**
 *
 * @author fbabu
 */
import java.util.*;
public class OperacionesBasicas {
    public static void main(String[] args){
        int primerNum = 10;
        int segundoNum = 3;
        
        float intAFloat = (float) primerNum;
        float intAFloat2 = (float) segundoNum;
        
        double floatADouble = (double) intAFloat;
        double floatADouble2 = (double) intAFloat2;
        
        System.out.println("El resultado de la suma es: " + Suma.sumar( primerNum, segundoNum));
        System.out.println("El resultado de la resta es: " + Resta.restar( primerNum, segundoNum));
        System.out.println("El resultado de la multiplicación es: " + Multiplicacion.multiplicar( intAFloat, intAFloat2));
        if (segundoNum !=0) {
            System.out.println("El resultado de la división es: " + Division.dividir(intAFloat, intAFloat2));
        }else {
         System.out.println("No se puede dividir por 0!!");
        }
        System.out.println("El residuo de la división (módulo) es: " + Division.modulo(intAFloat, intAFloat2));
        System.out.println("El resultado de " + (primerNum) +" elevado a " + (segundoNum)+ " es: " + Multiplicacion.potencia( floatADouble, floatADouble2));
    
        OperacionesUsuario.operacionesU(); /*Funcion de la clase OperacionesUsuario que realiza todas las operaciones anteriormente 
                                            realizadas con los números que ingrese el usuario*/
        
        /*Método para calcular el promedio de 5 numeros introducidos por el usuario */
        
        System.out.println("Este es el promedio de tus numeros: " + PromedioUsuario.calcularPromedio());
    }
}
