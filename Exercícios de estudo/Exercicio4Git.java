/*Escreva um programa em C que calcule o fatorial de um número inteiro positivo.*/

package estudo;

import java.util.Scanner;

public class Exercicio4Git{
    
    public static void main (String[] args){
        
        Scanner input = new Scanner (System.in);
        
        int numero, fat, resul;
        
        System.out.println("Digite um numero: ");
        numero = input.nextInt();
        
        fat = numero;
        resul = fat;
        while(numero > 1){
            
            numero = numero - 1;
            fat = fat * numero;
            
        }
        
        System.out.println("O fatorial de "+resul+" é "+fat);
    }
}