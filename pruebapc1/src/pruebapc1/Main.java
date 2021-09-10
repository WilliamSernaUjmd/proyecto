package pruebapc1;
import java.time.LocalDateTime;
import java.util.Scanner;
import pruebapc1.Menu;
import java.io.*;


public class Main {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws FileNotFoundException, IOException{
        String cont = null;
        String usuario = "";
        String usuario1 = "Admin";
        String usuario2 = "Vendedor";
        String usuario3 = "Invitado";         
        String contraseña = "";
        String  contraseña1 = "admin123";
        String  contraseña2 = "vendedor123";
        String contraseña3 = "invitado123";
        boolean datosLoginEncontrados = false;

        int op=0;
//        boolean salir=false;
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Lista de Usuarios"); 
        System.out.println("1.Admin"); 
        System.out.println("2.Vendedor");
        System.out.println("3.Invitado");
        op=leer.nextInt();
        Archivos a = new Archivos();
        System.out.println(new String(new char[1]).replace("\0", "\r\n"));//Borrar pantalla
//        
switch (op){
            case 1:
                System.out.println("Bienvenido al sistema de ventas Don Diego");
        System.out.println("Favor ingresar su clave");
        System.out.println("Bienvenido " + usuario1);
        System.out.println("Contraseña: ");
        leer.next(contraseña1);
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\José\\Desktop\\proyecto\\pruebapc1\\Archivos\\Usuarios.txt"));
        String linea = reader.readLine();
        System.out.println(new String(new char[1]).replace("\0", "\r\n"));//Borrar pantalla

        
        if(linea.equals(contraseña1)){  
                LocalDateTime localDate = LocalDateTime.now();
                int h = localDate.getHour();
                int min = localDate.getMinute();
                int s = localDate.getSecond();   
                int d = localDate.getDayOfMonth();
                int mes =localDate.getMonthValue();
                int y = localDate.getYear(); //Y de año
               
                a.EscribirFichero("\nEntrada del Administrador","\nHora: ",h,min,s,"\nFecha: ",d,mes,y);
                boolean salir = false; //Escritura bitacora entrada
            System.out.println("¿Que desea hacer?");
            Menu m = new Menu();
            m.MenuA();
            System.out.println(m);                                    

        }
        else{
        System.out.println("Credenciales incorrectas");}
        

                break;
            case 2:
                System.out.println("Bienvenido al sistema de ventas Don Diego");
        System.out.println("Favor ingresar su clave");
        System.out.println("Bienvenido " + usuario2);
        System.out.println("Contraseña: ");
        leer.next(contraseña2);
        BufferedReader reader2 = new BufferedReader(new FileReader("C:\\Users\\José\\Desktop\\proyecto\\pruebapc1\\Archivos\\Usuarios.txt"));
        String linea2 = reader2.readLine();
        System.out.println(new String(new char[1]).replace("\0", "\r\n"));
        if(contraseña2.equals(contraseña2)){
              

                 LocalDateTime localDate = LocalDateTime.now();
                int h = localDate.getHour();
                int min = localDate.getMinute();
                int s = localDate.getSecond();   
                int d = localDate.getDayOfMonth();
                int mes =localDate.getMonthValue();
                int y = localDate.getYear(); //Y de año
               
                a.EscribirFichero("Entrada del Vendedor\n","Hora: \n",h,min,s,"Fecha: \n",d,mes,y);
                boolean salir = false; //Escritura bitacora entrada
            
            System.out.println("¿Que desea hacer?");
            Menu m = new Menu();
            m.MenuV();
            System.out.println(m);
        }
        else{
        System.out.println("Credenciales incorrectas");}
                
                break;
            case 3:
        System.out.println("Bienvenido al sistema de ventas Don Diego");
        System.out.println("Favor ingresar su clave");
        System.out.println("Bienvenido " + usuario3); 
        System.out.println("Contraseña: ");
        leer.next(contraseña3);
        BufferedReader reader3 = new BufferedReader(new FileReader("C:\\Users\\José\\Desktop\\proyecto\\pruebapc1\\Archivos\\Usuarios.txt"));
        String linea3 = reader3.readLine();
        System.out.println(new String(new char[1]).replace("\0", "\r\n"));
        if(contraseña3.equals(contraseña3)){
             

                LocalDateTime localDate = LocalDateTime.now();
                int h = localDate.getHour();
                int min = localDate.getMinute();
                int s = localDate.getSecond();   
                int d = localDate.getDayOfMonth();
                int mes =localDate.getMonthValue();
                int y = localDate.getYear(); //Y de año
               
                a.EscribirFichero("Entrada del Invitado\n","Hora: \n",h,min,s,"Fecha: \n",d,mes,y);
                boolean salir = false; //Escritura bitacora entrada
            
            System.out.println("¿Que desea hacer?");
            Menu m = new Menu();
            m.MenuI();
            System.out.println(m);
        }
        else{
        System.out.println("Credenciales incorrectas");}
                
                break;
                default:
                    System.out.println("Opción no valida");
                break;
        }

 }
}
