
package AreaCuadrado;

/**
 *
 * @author T-301
 */
public class Arreglos1 { 
    public static void main(String args[]){
        //Declarar un arreglo
        int x[]=new int[3];
        //int []y=new int[3];
        //int z[]={1, -200, 45};
        /*Incorrectos
        int w=new int[];
        int j[3]=new int[];
        int m[4]=new int[4];
        int []n={1, 4.5, 3};
        __________________________________*/
        x[0]=127;
        x[1]=200;
        x[2]=-23;
        
        //Para iterar areglos. (iterear es hacer el recorrido del arreglo)
       // despues de i<x.length es para que corra por todo el arreglo
        for(int i=0; i<3; i++){
            System.out.println(x[i]);
        }
        
        int a=2;
        int b=0;
        
        try{
        System.out.println(a/b);//Excepcion tipo aritmetico
        }
        catch(Throwable e){// La (e) es de exception
            System.out.println(e.getMessage());//get Message es para saber el tipo de error o la excepcion que lanzo
        }// EXCEPCION MAMA DE TODAS ES Throwable


        //No se ejecuta bien por el 4 y lanza una excepcion 
        System.out.println("Si ocurre la excepcion nunca me veras");
        //____________________________________
        //  Ciclo mejorado
        
        for(int algo:x ){//la X es el nombre del arreglo
            System.out.println(algo);
        }
          
    }
}
