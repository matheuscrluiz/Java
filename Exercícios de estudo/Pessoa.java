/*2) Escreva um programa em C que verifique se um determinado
inteiro positivo que é lido via teclado, é ou não primo.*/

package estudo;

import java.util.Scanner;

public class Exercicio2Git{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner (System.in);
        
        int i, count = 0, numero;
        
        System.out.println("Digite um valor: ");
        numero = input.nextInt();
        
        for(i=1; i <= numero; i++){
            
            if(numero % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("O numero "+numero+" é primo.");
        }
        else{
            System.out.println("O numero "+numero+ " não é primo.");
        }
    }
}