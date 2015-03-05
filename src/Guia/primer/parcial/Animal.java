//Guia primer parcial
package Guia.primer.parcial;

/**
  @author JorgeLuis
 a) Encapsula la clase Animal
 */
public class Animal {
    private String nombre;
    private int edad;
    
    //Constructor 
    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return edad;
    }
    
}
