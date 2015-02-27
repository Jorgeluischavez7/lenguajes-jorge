
package Unitec.proyecto.geometria;

/**
 *
 * @author T-107
 */
public class Circulo implements Superficies {// se implementa la supercalse Superficie 
    private float radio;

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }
    
    //para calculo se quita para que marque error porque no tiene la clase calcularArea Implementada
    
    public float calcularArea(){
        System.out.print("El area del Circulo es: ");
        return 3.1416f*radio*radio;
    }

    /**
     * @return the radio
     */
    public float getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    
}
