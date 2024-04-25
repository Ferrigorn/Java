/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasesobjetos;

/**
 *
 * @author fbabu
 */
public class ClasesObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1 = new Persona("Larry", 29, "c/Consell de Cent, 93", "deporte y musica");
        Persona persona2 = new Persona("Furry", 29, "c/Noseque de Nosedonde", "no hacer nada");
        Persona persona3 = new Persona("Papitu", 14, "c/Noseque de Nosedonde", "aficionar");
        Persona persona4 = new Persona("Josefa", 35, "c/Bruguera s/n", "disparar");
        persona1.imprimirDatos();
        persona1.imprimirTodosDatos();
        persona1.esMayorEdad();
        persona1.compararEdad(persona2);
        persona1.compararEdad(persona3);
        persona1.compararEdad(persona4);
    }
    
}
