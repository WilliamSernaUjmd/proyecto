import java.io.*;
public class Archivos {
    
    public static void main (String[] args){
    
   
    File Archivo = null;
    FileReader fr = null;
    BufferedReader br = null;
     String[] listaUsuarios = new String[3];
     String RutaAbsoluta ="\\Archivos\\Usuario.txt";
     String[] listaProductos = new String[10];
     String RutaProductos ="\\Archivos\\Lista de productos.txt";
     String[] listaInventario = new String[10];
     String RutaInventario ="\\Archivos\\Lista de inventario.txt";
    
    try{
        String path = System.getProperty("user.dir");
        System.out.println("path: "+path);
        Archivo = new File(path + RutaAbsoluta);
        fr = new FileReader(Archivo);
        br = new BufferedReader(fr);
        String linea = null;
        int i = 0;
        while((linea=br.readLine())!=null)
        System.out.println(linea);
        listaUsuarios[i] = linea;
        i++;
    }
    catch (Exception e){
        e.printStackTrace();
    }
    
    finally{
    try {
        if(null!= fr){
        fr.close ();
                }
        }
        catch (Exception e2){
        e2.printStackTrace();
    }
    }
    }
}
    
