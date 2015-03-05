/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unitec.proyecto.geometria;

/**
 *
 * @author T-107
 */
public interface Superficies {
    //public Superficies(){}  //Marca error porque se rompe la primera regla
    //public float calcularArea(){}   //Mara error en este metodo porque tiene llaves
    //float lado;   //marca error como no tiene constructor marca error y como tambien no se pueden crear constructores
    //y no se puede inicializar
    
    float lado=4;  ///corresto
    public float calcularArea();
    
    
}
