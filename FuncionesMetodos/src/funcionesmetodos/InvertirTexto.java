/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionesmetodos;

/**
 *
 * @author fbabu
 */
public class InvertirTexto {
    //Creamos un metodo con un parametro string
    public static String textoInvertido(String cadena){
        //creamos un
     StringBuilder cadenaInvertida = new StringBuilder();
        
        // Recorremos la cadena de texto en reversa y la agregamos al StringBuilder
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida.append(cadena.charAt(i));
        }
        
        // Convertimos el StringBuilder de nuevo a String y lo retornamos
        return cadenaInvertida.toString();}
}
