/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasdecontrol;

/**
 *
 * @author fbabu
 */
import java.util.Scanner;
public class Usuario {
    public static void sumaConsecutiva(){
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int numUser = escaner.nextInt();
        int contador= 1;
        int suma = 0;
        do{
        suma += contador;
        contador++;}
        while(contador <= numUser);
        System.out.println("La suma de todos los números hasta " + numUser + " es de: " + suma);
    }
    
    public static void tiposOperaciones(){
        Scanner scanner = new Scanner(System.in);//creamos la variable tipo escaner
        System.out.println("Introduzca el primer número");//Pedimos al usuario el numero que quiera
        double primerNum = scanner.nextDouble();//creamos la variable y le damos el valor que haya introducido el usuario(a través de scanner)
        System.out.println("Introduzca el segundo número");//lo mismo para el segundo numero
        double segundoNum = scanner.nextDouble();
        double resultado;//creamos la variable resultado, tendrá un valor u otro según la operacion
        String operacion;//creamos la variable operacion
        System.out.println("¿Que operacion quieres realizar?(suma, resta, multiplicacion, division)");
        operacion = scanner.next();//la variable creada anteriormente tendrá el valor que haya escogido el usuario(a través de escaner)
        /*Segun el valor de la variable operacion, haremos una cosa u otra(sumar, restar, multiplicar, dividir)*/
        switch (operacion){
            case "suma":
                resultado = primerNum + segundoNum;//la variable resultado tendrá el valor de primerNum+segundoNum
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case "resta":
                resultado = primerNum - segundoNum;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case "multiplicacion":
                resultado = primerNum * segundoNum;
                System.out.println("El resultado de la multiplicacion es: " + resultado);
                break;
                //creamos un condicional por si se ha introducido 0, cuya operacion no se puede realizar
            case "division": 
                if(segundoNum != 0){
                resultado = primerNum / segundoNum;
                    System.out.println("El resultado de la división es: " + resultado);
                }else {
                    System.out.println("No se puede dividir por 0!!");
                }
                break;
                //caso default, para "cubrirnos" las espaldas si el usuario ha introducido 
            default:
                System.out.println("Operacion no valida. Por favor introduce una operacion valida (suma, resta, multiplicacion, division)");
                break;
        }
        
    }
}
