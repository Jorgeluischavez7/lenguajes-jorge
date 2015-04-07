/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializaciones;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-107
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario u=new Usuario();
        u.setEmail("jorge@gmail.com");
        u.setNombre("Jorge");
        u.setSueldo(700000);
        //Lo guardamos
        PersistenciaUsuario per=new PersistenciaUsuario();
        try {
            per.guardar(u);//la u se tiene que probar en un try cacht
            System.out.println("usuario guardado con exito");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
