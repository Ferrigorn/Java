/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionesmetodos;

/**
 *
 * @author fbabu
 */
public class Array {
    public static int mayorArr(int[] array){
    int numMayor = array[0];//primero creamos una variable tipo int y le damos el valor de la primera posicion del array [0]
        
        for (int num : array){ //recorremos cada elemento individual del array lista
            if(num > numMayor){ //si el elemento recorrido (num) es mayor que el numero que teniamos(numMayor)éste pasara a ser nuestro numMayor
            numMayor = num;}
        }
        return numMayor;
    }
}
