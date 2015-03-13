
package com.capitulo6.threads;

/**
 *
 * @author T-301
 */
public class Regular implements Runnable{

    //Overrride sobreescribiendo
    @Override
    public void run() {
         System.out.println("Soy un thread mas dificil");
    }
    
}
