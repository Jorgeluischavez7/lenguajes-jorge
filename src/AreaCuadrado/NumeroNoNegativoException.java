
package AreaCuadrado;

/**
 *
 * @author T-301
 */
//import java.lang.Exception; esta clase ya la tiene por defecto.

public class NumeroNoNegativoException extends Exception{
    //Constructor de la calse 
   // los constructores nunca se heredan, se invocan con la palabra super
    public NumeroNoNegativoException(){
        super("Lo siento pero no acepto valores negativos");//Mandar a llamar al constructos 
    }
}
