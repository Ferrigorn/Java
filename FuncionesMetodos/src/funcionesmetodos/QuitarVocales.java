/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionesmetodos;

/**
 *
 * @author fbabu
 */
public class QuitarVocales {
    public static String sinVocales(String cadena){
        return cadena.replaceAll("[aeiouAEIOU]", "");
    }
}
