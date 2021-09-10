package pruebapc1;
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
    public void EscribirFichero(String Valor,String Hora, int h, int min, int s,String Fecha ,int d, int mes, int y) {

        FileWriter fichero = null;
        PrintWriter pw = null;
        String[] Bitacora = new String[10];
        String RutaBitacora ="\\Archivos\\Bitacora.txt";
        try {
            String path = (System.getProperty("user.dir"));
            fichero = new FileWriter(path + RutaBitacora, true);
            pw = new PrintWriter(fichero);
            pw.print("-------------");
            pw.print(Valor);
            pw.print(Hora+"");
            pw.print(h+":");
            pw.print(min+":");
            pw.print(s+"");
            pw.print(Fecha+"");
            pw.print(d+"-");
            pw.print(mes+"-");
            pw.print(y+"\n");
    
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para 
                // asegurarnos que se cierra el fichero.
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }
    
}

    
