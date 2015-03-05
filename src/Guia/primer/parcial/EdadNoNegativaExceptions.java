package Guia.primer.parcial;

/**
 *
 * @author JorgeLuis
 c) Crear una excepción que se llame EdadNoNegativaException que muestre un mensaje que diga
 * "No acepto valores negativos"
 */
public class EdadNoNegativaExceptions extends Exception{
    public EdadNoNegativaExceptions(){
        super("No se aceptan edades negativas");
    }
}
