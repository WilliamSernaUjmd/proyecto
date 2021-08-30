package pruebapc1;
import java.util.Scanner;
import Menu.Menu;
import static java.awt.SystemColor.menu;

public class Main {
    public static void main(String[] args){
        String usuario = "";
        String usuario1 = "Admin";
        String usuario2 = "Vendedor";
        String usuario3 = "Invitado";         
        String contrasena = "";
        String contrasena1 = "admin123";
        String contrasena2 = "vendedor123";
        String contrasena3 = "invitado123";
      
        int op=0;
//        boolean salir=false;
        
        Scanner leer=new Scanner(System.in);
//        System.out.println("Lista de Usuarios"); 
//        System.out.println("1.Admin"); 
//        System.out.println("2.Vendedor");
//        System.out.println("3.Invitado");
       
        System.out.println("Bienvenido al sistema de ventas Don Diego");
        System.out.println("Favor ingresar sus credenciales");
        System.out.println("Usuario:");
        leer.next(usuario);
        System.out.println("Clave: ");
        leer.next(contrasena);
        if(usuario.equals(usuario1) && (contrasena.equals(contrasena1))){
            System.out.println("Bienvenido " + usuario1);  
            System.out.println("¿Que desea hacer?");
            Menu m = new Menu();
            m.MenuA();
            System.out.println(m);
        }
        else{
        System.out.println("Credenciales incorrectas");} ///
      
        System.out.println("Bienvenido al sistema de ventas Don Diego");
        System.out.println("Favor ingresar sus credenciales");
        System.out.println("Usuario:");
        leer.next(usuario2);
        System.out.println("Clave: ");
        leer.next(contrasena2);
        if(usuario2.equals(usuario2) && (contrasena2.equals(contrasena2))){
            System.out.println("Bienvenido " + usuario2);  
            System.out.println("¿Que desea hacer?");
            Menu m = new Menu();
            menu.MenuV();
            System.out.println(m);
        }
        else{
        System.out.println("Credenciales incorrectas");} //
        
        
        System.out.println("Bienvenido al sistema de ventas Don Diego");
        System.out.println("Favor ingresar sus credenciales");
        System.out.println("Usuario:");
        leer.next(usuario3);
        System.out.println("Clave: ");
        leer.next(contrasena3);
        if(usuario3.equals(usuario3) && (contrasena3.equals(contrasena3))){
            System.out.println("Bienvenido " + usuario3);  
            System.out.println("¿Que desea hacer?");
            Menu m = new Menu();
            m.MenuI();
            System.out.println(m);
        }
        else{
        System.out.println("Credenciales incorrectas");}
        
        op=leer.nextInt();
        
  }
}
