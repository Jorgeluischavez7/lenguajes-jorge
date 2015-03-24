/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paca.barrio;

/**
 *
 * @author T-107
 */
import java.util.*;
public class ModeloGaleria {
    
    public static ArrayList<Galeria> generarGaleria(){
        ArrayList<Galeria> arreglo=new ArrayList<Galeria>();//Es un arreglo mutable de la clase galeria
            //La parte final es la URL de la imagen
        Galeria g1=new Galeria("Titulo 1", "Mi descripción uno", "/paca/barrio/uno.jpg");
        Galeria g2=new Galeria("Titulo 2", "Mi descripción dos", "/paca/barrio/dos.jpg");
        Galeria g3=new Galeria("Titulo 3", "Mi descripción tres", "/paca/barrio/tres.jpg");
        arreglo.add(g1);
        arreglo.add(g2);
        arreglo.add(g3);
        return arreglo;
    }
    
}
