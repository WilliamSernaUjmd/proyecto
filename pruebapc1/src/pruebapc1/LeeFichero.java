package pruebapc1;

/*package pruebapc1;*/
import java.io.*;


public class LeeFichero {
    
    BufferedReader br = null;
     String[] listaUsuarios = new String[3];
     String RutaAbsoluta ="\\Archivos\\Usuarios.txt";
     String[] listaProductos = new String[10];
     String RutaProductos ="\\Archivos\\Lista de productos.txt";
     String[] listaInventario = new String[10];
     String RutaInventario ="\\Archivos\\Lista de inventario.txt";
    

    public  void main(String[] arg) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;        
        try {          
            String path = System.getProperty("user.dir"); // ruta relativa
            System.out.println("path :" + path);
            
        // Apertura del fichero y creacion de BufferedReader para poder 
        // hacer una lectura comoda (disponer del metodo readLine()). 
            archivo = new File(path + RutaAbsoluta); // ruta absoluta
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            
            // Lectura del fichero 
            String linea;
            int i=0;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                listaUsuarios[i] = linea;
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        // En el finally cerramos el fichero, para asegurarnos 
        // que se cierra tanto si todo va bien como si salta
        // una excepcion. 
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}