/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica1_201800663;

import java.util.Scanner;

/**
 *
 * @author v
 */
public class Práctica1_201800663 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        int opcion=0;
        
        do{
            Scanner scanner=new Scanner(System.in);
        
        System.out.println("****************************");
        System.out.println(" ------Menú Principal------");
        System.out.println("* 1. Jugar                 *");
        System.out.println("* 2. Historial             *");
        System.out.println("* 3. Salir                 *");
        System.out.println("****************************");
        
        System.out.println("Colocar el número de la opción elegida.");
        
           opcion=scanner.nextInt();
           switch(opcion){
               case 1:
                Jugar();
                break; 
            case 2:
                Historial();
                break;
                
            case 3:
                Salir();
                break;
                
            default:
               System.out.println("Opción inválida");
            
           }
            
           
        }while(opcion!=3);
        
        
       
    static void Jugar(){
        
        System.out.println("****************************");
        System.out.println(" -Información del jugador- ");
         
        Scanner tem = new Scanner(System.in);
        String nomb;
        int edad;
        int n;
        System.out.println("* Ingresa tu nombre");
        nomb = tem.nextLine();
        System.out.println("* Ingresa tu edad");
        edad = tem.nextInt();
        System.out.println("Ingrese las dimensiones del tablero");
        n = tem.nextInt();
        
        if (n >= 8 && n <= 25) {
            //Linea superior
            for(int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
             //Linea central
            for(int i = 0; i < n-2; i++) {
                System.out.print("*");
                for(int j = 0; j < n-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
             //Linea inferior
            
            for(int i = 0; i < n; i++) {
                System.out.print("*");
            }
            
           
            
            
            
        }else { 
            System.out.println("Error, el dato ingresado debe estar entre 8 y 25");
        }
        
        
                                     
    }
    static void Historial(){
        System.out.println("Información del jugador:");
    }
    static void Salir(){
        System.out.println("------El programa a finalizado------");
    }
        
        
    
    
}
