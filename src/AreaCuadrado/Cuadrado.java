//Tarea del area de un cuadrado
package AreaCuadrado;

/**
 *
 * @author JorgeLuis
 */
public class Cuadrado {
    private int lado;
    
    public void setLado(int lado){
        this.lado=lado;
    }
    public int getLado(){
        return lado;
    }
    public int calcularArea(){
        int area=lado*lado;
        return area;
    }
}
