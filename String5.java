/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author ruanb
 */
public class String5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner ler = new Scanner(System.in);
        int n=5, i;
        String s[] = new String[n];
       
        System.out.printf("Insira uma string com cinco letras: ");
        System.out.println();
        for(i=0; i<n; i++){
              System.out.printf("%d° letra: ", (i+1));
              s[i]= ler.nextLine();
        }
        
         for(i=(n-1); i>=0; i--){
             System.out.printf("s[%d] = %s\n", i, s[i]);
             
        }
        
      
        
    }
    
}
