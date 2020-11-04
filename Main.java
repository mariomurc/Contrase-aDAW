/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3_contraseñadaw;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String contraseña="";
        byte intentos=3;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("INTRODUCE LA CONTRASEÑA PARA ACCEDER A CLASE");
        contraseña=teclado.next();
        if (contraseña.equals("DAW")){
            System.out.println("ENHORABUENA, HAS ACCEDIDO AL SISTEMA");
        }
        else {
             System.out.println("ERROR, LA CONTRASEÑA NO ES CORRECTA");
             
             while (intentos > 0){
                System.out.println("INTRODUCE LA CONTRASEÑA DE NUEVO");
                System.out.println("Te quedan " +intentos+ " intentos");
                contraseña=teclado.next();
                intentos--;
                
                
                if (intentos == 1){
                    System.out.println("INTRODUCE LA CONTRASEÑA DE NUEVO");
                    System.out.println("Te queda " +intentos+ " intento");
                    contraseña=teclado.next();
                    intentos--;
                if (contraseña.equals("DAW")){
                     System.out.println("ENHORABUENA, HAS ACCEDIDO AL SISTEMA");                  
                }
                else {
                    System.out.println("ERROR, LA CONTRASEÑA NO ES CORRECTA");
                    }
                } //cierre primer if
             } //cierre while
        } //cierre primer else
    } //cierre de la clase
} //cierre del main