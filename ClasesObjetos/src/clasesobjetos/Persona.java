/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesobjetos;

/**
 *
 * @author fbabu
 */
public class Persona {
    private String nombre;
    private int edad;
    private String direccion;
    private String aficiones;
    
    public Persona(String nombre, int edad, String direccion, String aficiones){
    this.nombre = nombre;
    this.edad = edad;
    this.direccion = direccion;
    this.aficiones = aficiones;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;}
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public String getAficiones(){
        return aficiones;
    }
    
    public void setAficiones(String aficiones){
        this.aficiones = aficiones;
    }
    
    public void imprimirDatos(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("Su edad es: " + edad);
    }
    
    public void imprimirTodosDatos(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("Su edad es: " + edad);
        System.out.println("Su dirección es: " + direccion);
        System.out.println("Las aficiones de " + nombre + " son: " + aficiones);
    }
    
    public boolean esMayorEdad(){
        boolean mayor = false;
    if (edad >=18){
        mayor = true;
        System.out.println("La persona " + nombre + " es mayor de edad");
    }else {
        System.out.println("La persona " + nombre + " es un bebito");
    }
    return mayor;}
    
    public void compararEdad(Persona otro){
        if (this.edad > otro.getEdad()){
            System.out.println( this.nombre + " es mayor que " + otro.getNombre());
        }else if (this.edad < otro.getEdad()) {
           System.out.println( otro.getNombre() + " es mayor que " + this.nombre); 
        }else{
            System.out.println(this.nombre + " y " + otro.getNombre() + " tienen la misma edad.");}
    }
}
