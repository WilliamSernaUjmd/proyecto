
package ujmd.edu.sv.proyectoconsola;

import java.util.Scanner;

/**
 *
 * @author Jessica Alberto
 */
public class Main {
    public static void main(String[] args){
        String usuario="Jessica";
        String contraseña="123456";
        int op=0;
        boolean salir=false;
        Scanner leer=new Scanner(System.in);
        System.out.println("Bienvenido al sistema de ventas Don Diego");
        System.out.println("Favor ingresar sus credenciales");
        System.out.println("Usuario:");
        leer.next(usuario);
        System.out.println("Contraseña:");
        leer.next(contraseña);
        if(usuario.equals("Jessica")){
            System.out.println("Bienvenido" + usuario);  
            System.out.println("¿Que desea hacer?"); 
      //  while(!salir){    
        System.out.println("*******Menú de opciones********"); 
        System.out.println("1.Venta Nueva"); 
        System.out.println("2.Consultar Inventario");
        System.out.println("3.Cambiar contraseña");
        System.out.println("4.Salir del sistema");
        System.out.println("Digite la opción");
        op=leer.nextInt();
        
            switch(op){
            case 1:
                System.out.println("Catalogo de productos");
                System.out.println("Huevo c/u $0.10");
                System.out.println("Pollo Libra $5.00");
                System.out.println("Aceite c/u $3.00");
                System.out.println("Fosforo c/u $0.50");
                System.out.println("Dulces c/u $0.80");
                System.out.println("Margarian c/u $0.30");
                System.out.println("Jabón c/u $2.25");
                System.out.println("Carne c/u $2.75");
                System.out.println("Gaseosa c/u $1.80");
                System.out.println("Desechables c/u $3.25");
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
                default:
                    System.out.println("Opción no valida");
                break;
        }
        }
        
      
        //}
        else{
            System.out.println("Credenciales incorrectas");
        }
    }
}
