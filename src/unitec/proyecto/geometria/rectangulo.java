
package Unitec.proyecto.geometria;

/**
 *
 * @author T-107
 */
public class rectangulo implements Superficies {//Se implementa el metodo superficies
    private float ladoMayor;
    private float ladoMenor;

    public rectangulo() {
    }

    public rectangulo(float ladoMayor, float ladoMenor) {
        this.ladoMayor = ladoMayor;
        this.ladoMenor = ladoMenor;
    }
    
    public float calcularArea(){
        System.out.print("El area del Rectangulo es:  ");
        return ladoMayor*ladoMenor;
        
    }

    /**
     * @return the ladoMayor
     */
    public float getLadoMayor() {
        return ladoMayor;
    }

    /**
     * @param ladoMayor the ladoMayor to set
     */
    public void setLadoMayor(float ladoMayor) {
        this.ladoMayor = ladoMayor;
    }

    /**
     * @return the ladoMenor
     */
    public float getLadoMenor() {
        return ladoMenor;
    }

    /**
     * @param ladoMenor the ladoMenor to set
     */
    public void setLadoMenor(float ladoMenor) {
        this.ladoMenor = ladoMenor;
    }
    
    
}
