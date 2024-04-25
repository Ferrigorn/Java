/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionesmetodos;

/**
 *
 * @author fbabu
 */
import java.util.Scanner;
public class FuncionesMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*metodo para coger dos numeros y realizar la suma. El método se encuentra en el archivo Suma*/
        int primerNum = 10;
        int segundoNum = 3;
        
        System.out.println("El resultado de la suma es: " + Suma.sumar( primerNum, segundoNum));
        
        /*Coger el elemento de mayor valor de un array*/
        
        int[] lista = {25, 65, 9, 36, 7};
        int[] array = {54, 8, 6, 36, 75, 1222};
        System.out.println("El numero de mayor valor de tu lista es: " + Array.mayorArr(lista));
        System.out.println("El numero de mayor valor de tu array es: " + Array.mayorArr(array));
        
        /*Par o impar*/
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduzca un número y le diremos si es par o impar");
        int numUser = scanner.nextInt();
        System.out.println("Esto es " + ParImpar.esPar(numUser));
        
        /*Invertir cadena*/
        
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduzca un texto");
        String texto = escaner.nextLine();//le ponemos nextLine para que coja todo el texto. Con next solo cogería la primera palabra
        System.out.println("Este es tu texto original: " + texto);
        System.out.println("Este es tu texto invertido: " + InvertirTexto.textoInvertido(texto));
        
        /*String sin vocales*/
        
        System.out.println("Este es tu texto sin vocales: " + QuitarVocales.sinVocales(texto));
        
        /*Calcular el factorial de un numero*/
        
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca un numero y le mostraremos su factorial");
        int n = input.nextInt();
        System.out.println("Este es el factorial de su número: " + Factorial.calcularFactorial(n));
    }
    
}
