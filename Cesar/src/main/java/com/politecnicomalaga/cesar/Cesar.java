/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.politecnicomalaga.cesar;
import java.util.Scanner;

/**
 *
 * @author seryi
 */
public class Cesar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String textoOriginal;
        int iLlave;
        
        System.out.println("Introduzca una cadena de caracteres: ");
        textoOriginal = sc.nextLine();
        System.out.println("Introduzca un número: ");
        iLlave = sc.nextInt();
        System.out.println("");
        
        System.out.println("Su cadena de caracteres final es: ");
        //for(char caracter: textoOriginal.toCharArray()){
        for(int pos = 0; pos < textoOriginal.length(); pos++){
            
            int resultado = textoOriginal.codePointAt(pos);
                        
            resultado+=iLlave;
                      
            char caracter = (char) resultado;
                
            System.out.print(caracter);            
              
        }
                        
    }
}
