package estudo;

import java.util.Scanner;

public class UsandoPalavra {
    
    public static void main(String[] args){
        
        int idade;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = input.next();
        
        System.out.println("Digite seu segundo nome: ");
        String segundoNome = input.next();
        
        System.out.println("Digite sua idade: ");
        idade = input.nextInt();
        
        System.out.println("Olá, "+primeiroNome+" "+ segundoNome+". Você tem "+idade+" anos.");
    }
}