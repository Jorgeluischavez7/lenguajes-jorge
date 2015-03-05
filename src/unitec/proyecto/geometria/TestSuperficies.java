//Clase de aplicacion, es la que va a ejecutar

package Unitec.proyecto.geometria;

/**
 *
 * @author T-301
 */
public class TestSuperficies {
public static void main (String[] args) throws Exception{
    for (Superficies s:GenerarSuperficies.obtenerFiguras()){
      //Polimorfismo  inyeccion de dependencias
        System.out.println(s.calcularArea());//la mama s manda a llamar el calculo de calcularArea
    }
}    
}
