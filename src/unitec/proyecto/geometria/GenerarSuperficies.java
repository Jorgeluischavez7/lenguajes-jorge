
package Unitec.proyecto.geometria;
import java.util.*;//El asterisco es para que esten disponibles sus clases de ese paquete

public class GenerarSuperficies {
    //para la excepciones throws Exception
    public static ArrayList<Superficies> obtenerFiguras()throws Exception{//tipos de retornos multiples
     ArrayList<Superficies> figuritas=new ArrayList<Superficies>();//En este arreglo no se indica el tamaño
     //Primero creamos cuadrados
     Cuadrado cu1=new Cuadrado(12);
      Cuadrado cu2=new Cuadrado(14);
       Cuadrado cu3=new Cuadrado(13);
    //Crear un rectangulos
       rectangulo rec1=new rectangulo(10,8);
         
    //Crear dos trinagulos
       Triangulo tr1=new Triangulo(5,10);
       Triangulo tr2=new Triangulo(7,14);
       
    //Crear dos Circulos
       Circulo cir1=new Circulo(5);
        Circulo cir2=new Circulo(9);
        
        //Agregarlos al ArrayList
        figuritas.add(cu1);
        figuritas.add(cu2);
        figuritas.add(cu3);
        figuritas.add(rec1);
        figuritas.add(tr1);
        figuritas.add(tr2);
        figuritas.add(cir1);
        figuritas.add(cir2);
        
        return figuritas;
    }
}
