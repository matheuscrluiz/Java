package estudo;

import java.util.Scanner;

public class NumeroParImpar{
    
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Digite o número desejado: ");
        numero = input.nextInt();
        
        if(numero % 2 == 0){
            
            System.out.println("O número "+numero+" é par");
        }
        else{
            System.out.println("O número "+numero+" é impar.");
        }
        
    }
}