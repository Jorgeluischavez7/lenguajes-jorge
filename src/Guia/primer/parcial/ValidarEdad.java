
package Guia.primer.parcial;

/**
 *
 * @author JorgeLuis
 *d) Crear una clase que se llame ValidarEdad, que cheque la logica de la excepción anterior
 */
public class ValidarEdad {
    public static void validar(int edad)throws EdadNoNegativaExceptions{
        if(edad<0)throw new EdadNoNegativaExceptions();
    }
}
