import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
   import java.util.Scanner;

   
   public class Login {
       public static void login(String[] args) throws IOException{
        String usuario1 = "Admin";
        String usuario2 = "Vendedor";
        String usuario3 = "Invitado";         
        String  contraseña1 = "admin123";
        String  contraseña2 = "vendedor123";
        String contraseña3 = "invitado123";
        boolean datosLoginEncontrados = false;
 
 
        BufferedReader reader = new BufferedReader(new FileReader("\\Archivos\\Usuario.txt"));
        String linea = reader.readLine();

        while (linea != null && datosLoginEncontrados == false)
        {
        String[] datosLogin = linea.split(",");
        if (datosLogin[0].equals(usuario1) && datosLogin[1].equals(contraseña1)){
            datosLoginEncontrados = true;
        }
        else{
            linea = reader.readLine();
        }
        }

        if(datosLoginEncontrados){
            System.out.println("Bienvenido");
        }else{
            System.out.println("No esta registrado");
        }
        
}
}