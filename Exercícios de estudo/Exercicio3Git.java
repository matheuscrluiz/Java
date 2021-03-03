/*3) Um inteiro perfeito n é igual a soma de todos os seus divisores próprios. 
A faixa de seus divisores próprios vai de 1 a (n-1).
Por exemplo : 6 é um inteiro perfeito; a soma de todos os seus divisores
próprios (1 + 2 + 3) é igual a 6. Escreva um programa em C que determine 
se um número no intervalo de 1 a 32767 é um inteiro perfeito.*/

package estudo;

import java.util.Scanner;

public class Exercicio3Git{
    
    public static void main (String[] args){
        
        Scanner input = new Scanner (System.in);
        
        int numero, divisores =0, i=1, soma=0;
        
        System.out.println("Digite um número: ");
        numero = input.nextInt();
        
        for(i=1;i<numero;i++){
            
            if(numero % i == 0){
                soma = soma + i;
            }
        }
        if (soma == numero){
            System.out.println("O número "+numero+" é inteiro perfeito");
        }
        else{
            System.out.println("O número "+numero+" não é inteiro perfeito");
        }
    }
}