/*1) Escreva um programa em C que encontre o 
menor inteiro positivo n que atenda as seguintes condições :
n / 3 = x inteiro e resto 2
n / 5 = y inteiro e resto 3
n / 7 = z inteiro e resto 4 */


package estudo;

import java.util.Scanner;

public class Exercicio1Git{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int n =1;
        
        while(n != 1000){
            
            if (n % 3 == 2 && n % 5 == 3 && n % 7 == 4){
                System.out.println("O número é "+n);
                break;
            }
            
            n++;
        }
    }
}