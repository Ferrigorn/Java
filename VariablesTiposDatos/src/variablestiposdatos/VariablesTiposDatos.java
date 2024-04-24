/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variablestiposdatos;

/**
 *
 * @author fbabu
 */
import java.util.*;
public class VariablesTiposDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Declaramos los distintos tipos de variables y las inicializamos*/
        int numeroEntero = 3;
        double numeroDecimal = 3.1415;
        String frase = "Soy mi propia frase";
        String numero = "121";
        
        /*Imprimimos las variables por pantalla*/
        System.out.println("La variable " + numeroEntero + " es un int");
        System.out.println("La variable " + numeroDecimal + " es un double(decimal)");
        System.out.println("La variable " + frase + " es un String");
        System.out.println("La variable " + numero + " es un String");
        
        /*Cambiamos de un tipo a otro de dato*/
        /*De int a double*/
        double intComoDouble = (double) numeroEntero;
        System.out.println("Numero int como double: " + intComoDouble);
        /*De double a int. El valor queda truncado 
        (solo mostrará las unidades enteras)*/
        int doubleComoInt = (int) numeroDecimal;
        System.out.println("Numero double como int: " + doubleComoInt);
        /*De String a int*/
        int stringComoInt = Integer.parseInt(numero);
        System.out.println("String como int: " + stringComoInt);
        
        /*Calcular y mostrar el área de un rectángulo*/
        Scanner scanner = new Scanner(System.in);//Instanciamos un nuevo scanner
        System.out.println("Introduce el lado1");//Pedimos al usuario el primer lado
        String lado1 = scanner.nextLine();//cogemos el valor que haya introducido y lo asignamos a la variable lado1
        double ladoUno = Double.parseDouble(lado1);//pasamos el valor a un double para poder operar con el
        System.out.println("Introduce el lado2");//lo mismo para el lado2
        String lado2 = scanner.nextLine();
        double ladoDos = Double.parseDouble(lado2);
        
        Rectangulo rectangulo = new Rectangulo(); //Creamos un nuevo Objeto de la clase Rectangulo
        //Utilizamos el método de la clase Rectangulo con los parámetros que ha introducido el usuario
        //Creamos una variable para realizar el método de la clase Rectangulo
        double area = rectangulo.calcularArea(ladoUno, ladoDos); 
        System.out.println("El área de tu rectángulo es: " + area);//Imprimimos el resultado
        
        /*Conversor de Celsius a Fahrenheit y viceversa*/
        /*Fahrenheit a Celsius*/
        System.out.println("Introduce la temperatura en Fahrenheit");
        String tempFah = scanner.nextLine();
        double fahrenheit = Double.parseDouble(tempFah);
        double celsius = (fahrenheit -32) * 5 / 9;
        System.out.println("La temperatura " + fahrenheit + "ºF equivale a " + celsius + "ºC");
        
        /*Celsius a Fahrenheit*/
        System.out.println("Introduce la temperatura en Celsius");
        String tempCel = scanner.nextLine();
        double celsius2 = Double.parseDouble(tempCel);
        double fahrenheit2 = (celsius2 * 9 / 5) + 32;
        System.out.println("La temperatura " + celsius2 + "ºC equivale a " + fahrenheit2 + "ºF");
       
    }
}

        
    
    

