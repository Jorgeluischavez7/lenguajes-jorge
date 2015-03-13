
package com.capitulo6.threads;

/**
 *
 * @author T-301
 */
public class Facil extends Thread{
    //Siempre se llamara el metodo run. ejecuata el thread
    //Pasos
    /*
    1.-Creado
    2.-Inicializado
    3.-Ejecucucion (Metodo run)
    4.-Pausa
    5.-Muerte
    */
    @Override
    public void run(){
        try{//el try es para dormir el thread 3 segundos
            Thread.sleep(3000);
        System.out.println("Soy un thread facil");
        String nombre=Thread.currentThread().getName();
        System.out.println("me llamo" + nombre);
        }catch(InterruptedException e){}
        
    }
}
