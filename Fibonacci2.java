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
public class Fibonacci2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n;
        System.out.println("Digite um número para verificar se o mesmo pertence"
                + "a uma sequência de fibonacci: ");
        n = ler.nextInt();
        int i, soma = 0;
        for(i=1; i<=n+1; i++){
            if(fib(i) == n){
                System.out.printf("%d ", fib(i));
                System.out.println("O número pertence a sequência de fibonacci!!");
                break;
            }else{
                soma = soma + 1;
                i = soma;
                if(i == n+1){
                   System.out.println("O número NÂO pertence a sequência de fibonacci.");
                   
                }
            }
        }
        
                
        
        
        System.out.println();
    }
    
    public static int fib(int n){
        if(n == 1)
            return(0);
        
        if (n == 2)
            return(1);
        int i, F = 0, F1 = 0, F2 = 1;
        for(i=3; i<=n; i++){
            F = F1 + F2;
            F1 = F2;
            F2 = F;
        }
               
        return(F);
    }
    
}
