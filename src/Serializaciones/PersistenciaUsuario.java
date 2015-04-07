
package Serializaciones;

import java.io.*;
public class PersistenciaUsuario {
    //Persistencia = guardar
    //Asociacion debil.
    public void guardar(Usuario u)throws Exception{//Metodo para guardar un usuario
        //aqui va logica muy logica, pero a la vez hermoso.
        //PASO 1
        File file=new File("D:\\archivaldo.yo");//Constructor indica la ruta y nombre del archivo
        //PASO 2
        FileOutputStream fos=new FileOutputStream(file);
        //PASO 3 llenarlo con algo, en este caso es un usuario
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(u);//lo guarda fisicamente
        oos.close();//cierra el archivo
        
    }
    public Usuario leer(String nombre)throws Exception{
       File file=new File("D:\\archivaldo.yo");
       //Paso 2
       FileInputStream fis=new FileInputStream(file);
       //PASO 3
       ObjectInputStream ois=new ObjectInputStream(fis);
       Usuario u=new Usuario();
       u= (Usuario)ois.readObject();//casting a usuario
       return u;
        
    }

    Object leer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
