
package com.capitulo6.threads;

/**
 *
 * @author T-301
 */
public class ProbarThreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("probar Threads");
        //Paso 1. Crearlo
        Facil t1=new Facil();
        Facil t11=new Facil();
        t1.setName("Petra");
        //el r1 es de runnable
        Regular r1=new Regular();
        
         Thread t2=new Thread(r1);//tiene un constructor por defecto y la caracteristica de recivir un runnable
         Thread t3=new Thread(new Runnable(){

           @Override
           public void run() {
               System.out.println("soy un thread mucho mejorrrrr");
           }
             
         }
         );
          Relojito treloj=new Relojito();
         
         
         
        //Paso 2. Inicializado
        t1.start();
        t11.start();
        t2.start();
        t3.start();
        treloj.start();
       
    }
    
}
