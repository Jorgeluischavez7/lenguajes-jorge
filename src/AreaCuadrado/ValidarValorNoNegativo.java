
package AreaCuadrado;

/**
 *
 * @author T-301
 */
public class ValidarValorNoNegativo {
//throws= Puede lanzarse la excepcion  NumeroNoNegativoException
    public  static void validar(float valor) throws NumeroNoNegativoException{
        //Es una palabra reservada aplicada a atributos, ,metoso y clases.
        if (valor<0)throw new NumeroNoNegativoException();//NumeroNoNegativoException() se vuelve un objeto por el new
       
    }
}
