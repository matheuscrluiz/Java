package estudo;

import java.util.Scanner;

public class Comparando{
    
    public static void main (String[] args){
        
        Scanner input = new Scanner (System.in);
        int idade;
        
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        
        System.out.println("Digite sua idade: ");
        idade = input.nextInt();
        
        if(idade >= 18){
            System.out.println("Você é maior de idade");
        }
        else{
            System.out.println("Você é menor de idade");
        }
        
        System.out.println("Seu nome é: "+nome);
    }
}