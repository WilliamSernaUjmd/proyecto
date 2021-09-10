package pruebapc1;
import java.util.Scanner;

import java.util.Scanner;

public class Inventarios {
     void inventarios(){
            
            int op=0;
    Scanner leer=new Scanner(System.in);
        System.out.println("Inventario"); 
        System.out.println("1-Huevos"); 
        System.out.println("2-Pollo");
        System.out.println("3-Aceite");
        System.out.println("4-Fósforos");
        System.out.println("5-Dulces");
        System.out.println("6-Margarina");
        System.out.println("7-Jabon");
        System.out.println("8-Carne");
        System.out.println("9-Gaseosa");
        System.out.println("10-Desechables");
        System.out.println("11-TODOS");
        System.out.println("Digite codigo de producto");
        op=leer.nextInt();
        Archivos a = new Archivos();
        System.out.println(new String(new char[1]).replace("\0", "\r\n"));
        
       switch (op) {
           case 1: 
               System.out.println("Producto        Cantidad");
               System.out.println("Huevos          30");
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
               }           break;
           case 2: 
               System.out.println("Producto        Cantidad");
               System.out.println("Pollo           100");
           break;
           case 3: 
               System.out.println("Producto        Cantidad");
               System.out.println("Aceite          50");
           break;
           case 4: 
               System.out.println("Producto        Cantidad");
               System.out.println("Fósforos        500");
           break;
           case 5: 
               System.out.println("Producto        Cantidad");
               System.out.println("Dulces          200");
           break;
           case 6: 
               System.out.println("Producto        Cantidad");
               System.out.println("Margarina       75");
           break;
           case 7: 
               System.out.println("Producto        Cantidad");
               System.out.println("Jabón           90");
           break;
           case 8: 
               System.out.println("Producto        Cantidad");
               System.out.println("Carne           30");
           break;
           case 9: 
               System.out.println("Producto        Cantidad");
               System.out.println("Gaseosas        1000");
           break;
           case 10: 
               System.out.println("Producto        Cantidad");
               System.out.println("Desechables     35");
           break;
           case 11: 
               System.out.println("Producto        Cantidad");
               System.out.println("Huevos          30");
               System.out.println("Pollo           100");
               System.out.println("Aceite          50");
               System.out.println("Fósforos        500");
               System.out.println("Dulces          200");
               System.out.println("Margarina       75");
               System.out.println("Jabón           90");
               System.out.println("Carne           30");
               System.out.println("Gaseosas        1000");
               System.out.println("Desechables     35");
           break;
       
       }
}
}
