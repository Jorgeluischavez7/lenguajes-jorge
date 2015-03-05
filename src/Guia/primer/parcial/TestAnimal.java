
package Guia.primer.parcial;

/**
 *
 * @author JorgeLuis
 f) Crear una clase Main que se llame TestAnima, que itere animales del ejercicio 
 * anterior y muestre su nombre de cada uno.
 */
public class TestAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(Animal a:GenerarAnimales.generarAnimales()){
            System.out.println(a.getNombre() + "  "+ a.getEdad());
              
        }
        
    }
}
