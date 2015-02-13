
package AreaCuadrado;

/**
 *
 * @author T-301
 */
public class Arreglos1 { 
    public static void main(String args[]){
        //Declarar un arreglo
        int x[]=new int[3];
        int []y=new int[3];
        int z[]={1, -200, 45};
        /*Incorrectos
        int w=new int[];
        int j[3]=new int[];
        int m[4]=new int[4];
        int []n={1, 4.5, 3};
        __________________________________*/
        x[0]=127;
        x[1]=200;
        x[2]=-23;
        //Para iterar areglos. (iterear es hacer el recorrido de)
        for(int i=0; i<x.length; i++){
            System.out.println(x[i]);
        }
        for(int algo:x){
            System.out.println(algo);
        }
        
    }
}
