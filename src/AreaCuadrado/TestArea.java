
package AreaCuadrado;

/**
 *
 * @author JorgeLuis
 */
public class TestArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuadrado c=new Cuadrado();
        c.setLado(-2);
        System.out.println("El area del cudrado es "+ c.calcularArea());
    }
}
