//Tarea del area de un cuadrado
package AreaCuadrado;

/**
 *
 * @author JorgeLuis
 */
public class Cuadrado {
    private float lado;
    //Constructor por defecto public Cuadrado(){}
    
    /**
     *Este constructor tiene un argumento de tipo flotante  
     * @param lado El parametro que debes ingresar es el valor del lado de tu cuadrado
     */
    
    public Cuadrado (float lado){
        this.lado=lado;
    }
    public Cuadrado (){}//constructor por defecto, se crea proque desaparece por el constructor de arriba
    
    public void setLado(float lado){
        this.lado=lado;
    }
    public float getLado(){
        return lado;
    }
    public float calcularArea(){
        float area=lado*lado;
        return area;
    }
}
/**comentario de tipo documentacion
 */