/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionesmetodos;

/**
 *
 * @author fbabu
 */
public class Factorial {
    public static int calcularFactorial(int num){
    int n = num; //creamos variable para el parámetro
    int factorial = 1;//creamos variable para ir "añadiendo" los resultados de las operaciones del bucle
    for (int i= 2; i<=n; i++){//creamos un bucle para ir multiplicando el valor de n hasta 2(podría ser 1, pero nos daría el
        //mismo resultado ya que n*1 = n
    factorial *= i;}//multiplicamos y añadimos en cada posicion del bucle
    return factorial; //retornamos el valor total de la multiplicacion
    }
}
