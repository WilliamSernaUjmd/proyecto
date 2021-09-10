package pruebapc1;
import java.util.Scanner;
import java.io.*;
import pruebapc1.LeeFichero;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Scanner;
import pruebapc1.Main;
import pruebapc1.Inventarios;

public class Menu {
//    public static void MenuP(String[] args){
//    
//    }
                Archivos a = new Archivos();
//                 LocalDateTime localDate = LocalDateTime.now();
//                int h1 = localDate.getHour();
//                int min1 = localDate.getMinute();
//                int s1 = localDate.getSecond();   
//                int d1 = localDate.getDayOfMonth();
//                int mes1 =localDate.getMonthValue();
//                int y1 = localDate.getYear(); //Y de año


    void MenuA() {
        int op=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("**Menú de opciones***"); 
        System.out.println("1.Venta Nueva"); 
        System.out.println("2.Consultar Inventario");
        System.out.println("3.Cambiar contraseña");
        System.out.println("4.Salir del sistema");
        System.out.println("Digite la opción");
        op=leer.nextInt();
        System.out.println(new String(new char[1]).replace("\0", "\r\n"));
        
            switch (op){
            case 1:
                switch (op){
                    case 1:
                }
               switch (op){
                case 1: 
               System.out.println("Huevo c/u $0.10");
               System.out.println("Desea comprar este articulo?");
               System.out.println("Elija una opcion ");
               System.out.println("1 si");
               System.out.println("2 no");
            int op1 = leer.nextInt();
               switch(op1){
                   case 1:
                      System.out.println("Cantidad a comprar");
                      double cant1=0;
                      Scanner num =new Scanner(System.in);
                      while (cant1!=0){
                        double num1 = (cant1*0.15);
                        double subtotal = num1;
                       System.out.println(subtotal);
                      }break;
                   case 2: 
                      System.out.println("Saliendo ...");
                      boolean salir = true;
               }           break;}
                
                
                
                
                
                System.out.println("Catalogo de productos");
                System.out.println("Huevo c/u $0.10");
                System.out.println("Pollo Libra $5.00");
                System.out.println("Aceite c/u $3.00");
                System.out.println("Fosforo c/u $0.50");
                System.out.println("Dulces c/u $0.80");
                System.out.println("Margarina c/u $0.30");
                System.out.println("Jabón c/u $2.25");
                System.out.println("Carne c/u $2.75");
                System.out.println("Gaseosa c/u $1.80");
                System.out.println("Desechables c/u $3.25"); 
                break;
            case 2:
                ///Llamar al fichero leer de inventario
                        Inventarios i = new Inventarios();
                        i.inventarios();
                        System.out.println(i);
                break;
            case 3: 
                
                break;
            case 4:
                System.out.println("Saliendo del programa");
                LocalDateTime localDate = LocalDateTime.now();
                int h1 = localDate.getHour();
                int min1 = localDate.getMinute();
                int s1 = localDate.getSecond();   
                int d1 = localDate.getDayOfMonth();
                int mes1 =localDate.getMonthValue();
                int y1 = localDate.getYear(); //Y de año
                a.EscribirFichero("Salida del Administrador\n","\nHora:",h1,min1,s1,"\nFecha:",d1,mes1,y1);
                boolean salir = true;
                break;
                default:
                    System.out.println("Opción no valida");
                break;
        }
        
    }
    
    void MenuV() {
        int op=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("**Menú de opciones***"); 
        System.out.println("1.Venta Nueva"); 
        System.out.println("2.Consultar Inventario");
        System.out.println("3.Salir del sistema");
        System.out.println("Digite la opción");
        op=leer.nextInt();
        System.out.println(new String(new char[1]).replace("\0", "\r\n"));
        
            switch (op){
            case 1:
                System.out.println("Catalogo de productos");
                System.out.println("Huevo c/u $0.10");
                System.out.println("Pollo Libra $5.00");
                System.out.println("Aceite c/u $3.00");
                System.out.println("Fosforo c/u $0.50");
                System.out.println("Dulces c/u $0.80");
                System.out.println("Margarina c/u $0.30");
                System.out.println("Jabón c/u $2.25");
                System.out.println("Carne c/u $2.75");
                System.out.println("Gaseosa c/u $1.80");
                System.out.println("Desechables c/u $3.25"); 
                break;
            case 2:
                
                break;
            case 3:
                System.out.println("Saliendo del programa");
                                
                LocalDateTime localDate = LocalDateTime.now();
                int h1 = localDate.getHour();
                int min1 = localDate.getMinute();
                int s1 = localDate.getSecond();   
                int d1 = localDate.getDayOfMonth();
                int mes1 =localDate.getMonthValue();
                int y1 = localDate.getYear(); //Y de año
                            a.EscribirFichero("\nSalida del Vendedor","\nHora:",h1,min1,s1,"\nFecha:",d1,mes1,y1);
                            boolean salir = true;
      
                
                break;
                default:
                    System.out.println("Opción no valida");
                break;
        }
        
    }
    
    void MenuI() {
        int op=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("**Menú de opciones***"); 
        System.out.println("1.Consultar Catalogo"); 
        System.out.println("2.Salir del sistema");
        System.out.println("Digite la opción");
        op=leer.nextInt();
        System.out.println(new String(new char[1]).replace("\0", "\r\n"));
        
            switch (op){
            case 1:

                System.out.println("Catalogo de productos");
                System.out.println("Huevo c/u $0.10");
                System.out.println("Pollo Libra $5.00");
                System.out.println("Aceite c/u $3.00");
                System.out.println("Fosforo c/u $0.50");
                System.out.println("Dulces c/u $0.80");
                System.out.println("Margarina c/u $0.30");
                System.out.println("Jabón c/u $2.25");
                System.out.println("Carne c/u $2.75");
                System.out.println("Gaseosa c/u $1.80");
                System.out.println("Desechables c/u $3.25"); 
                break;
            case 2:
                System.out.println("Saliendo del programa");
                                
                LocalDateTime localDate = LocalDateTime.now();
                int h1 = localDate.getHour();
                int min1 = localDate.getMinute();
                int s1 = localDate.getSecond();   
                int d1 = localDate.getDayOfMonth();
                int mes1 =localDate.getMonthValue();
                int y1 = localDate.getYear(); //Y de año
                a.EscribirFichero("\nSalida del Invitado","\nHora:",h1,min1,s1,"\nFecha:",d1,mes1,y1);
                boolean salir = true;
                
                break;
                default:
                    System.out.println("Opción no valida");
                break;
        }
        
    }

}
