
package Guia.primer.parcial;

/**
 *
 * @author JorgeLuis
 e) Crear una clase donde crees tres animales en un metodo que se llame GenerarAnimales
 que devuelva un arreglo generico a los Animales.
 */
import java.util.*;
public class GenerarAnimales {
    public static ArrayList<Animal> generarAnimales(){
         ArrayList<Animal> animales=new ArrayList<>();
         Animal a1=new Animal("Leon",2);
         Animal a2=new Animal("Delfin",6);
         Animal a3=new Animal("Tigre",5);
         animales.add(a1);
         animales.add(a2);
         animales.add(a3);
         return animales;
    }
}
