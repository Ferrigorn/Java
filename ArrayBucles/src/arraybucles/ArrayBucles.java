/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraybucles;

/**
 *
 * @author fbabu
 */
import java.util.Arrays;
public class ArrayBucles {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("ArrayEquals")
    public static void main(String[] args) {
        /*Suma de los numeros del array*/
        int[] lista = {23, 50, 6, 45, 4};//variable para los valores del array. es un INT porque los valores seran numeros
        int suma = 0;//creamos la variable suma porque es donde iremos añadiendo el valor de la suma de los numeros del array
        for (int i = 0; i<lista.length; i++){//creamos el bucle que recorrerá el array
            suma += lista[i];//por cada posicion [i] del array, sumará (+=) el valor del numero
        }
        System.out.println("El valor de la suma de los numeros del array es: " + suma);
        
        /*Mostrar los numeros del array en orden inverso*/
        System.out.println("Numeros del array en orden inverso: ");
        for (int i = lista.length - 1; i>=0; i--){//creamos un bucle que recorra el array desde el final (lista.length - 1) 
            //hasta el principio (lista.length = 0)
            System.out.println(lista[i]);//Nos muestra el valor de [i] en cada posición del array
        }
        
        /*mostrar el numero con mayor valor del array*/
        int numMayor = lista[0];//primero creamos una variable tipo int y le damos el valor de la primera posicion del array [0]
        
        for (int num : lista){ //recorremos cada elemento individual del array lista
            if(num > numMayor){ //si el elemento recorrido (num) es mayor que el numero que teniamos(numMayor)éste pasara a ser nuestro numMayor
            numMayor = num;}
        }
        //mostramos por pantalla el valor de numMayor una vez finalizado el bucle
        System.out.println("El numero con mayor valor del array es: " + numMayor);
        
        /*Comparar si dos arrays son iguales*/
        //creamos los arrays
        int[] array1 = {23, 50, 6, 45, 4};
        int[] array2 = {4, 40, 76, 5, 14};
        //comparamos con el método equals de util.Arrays. Este metodo compara los valores de cada posicion[i] del array
        System.out.println("Los arrays 1 y 2 son iguales: " + Arrays.equals(array1, array2));//false
        System.out.println("Los arrays array1 y lista son iguales: " + Arrays.equals(array1, lista));//true
        System.out.println("Los arrays lista y array2 son iguales: " + Arrays.equals(lista, array2));//false
        /*En el siguiente caso nos dará false porque el metodo equals() hace la comparación con
        la posición de memoria del objeto, no con los valores que tenga asignados(como hace el metodo Arrays.equal
        Es decir, los valores de dentro del array son los mismos, pero la posicion de cada objeto no*/
        System.out.println("Los arrays array1 y lista son iguales: " + array1.equals(lista));
        
        /*Encontrar el mayor y menor*/
        
        int mayor = array2[0];
        int menor = array2[0];
        
        for (int num : array2){
        if (num > mayor){
            mayor = num;
        }else if(num < menor){
            menor = num; }
        
        }
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
    
    }
}
