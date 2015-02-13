//Tarea del area de un cuadrado
package AreaCuadrado;

/**
 *
 * @author JorgeLuis
 */
public class Cuadrado {
    private float lado;
    //Constructor por defecto public Cuadrado(){}
    
    public Cuadrado (float lado){//Aqui se declara un constructor para iniciar el atributo (lado).
        this.lado=lado;
    }
    public Cuadrado (){}
    
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
