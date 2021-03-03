package estudo; 

import java.util.Scanner;

public class MaiorMenor{
    
    public static void main (String[] args){
        
        Scanner input = new Scanner (System.in);
        
        int n1, n2;
        
        System.out.println("Digite um valor: ");
        n1 = input.nextInt();
        
        System.out.println("Digite um valor: ");
        n2 = input.nextInt();
        
        if(n1>n2){
            System.out.println("O número "+n1+" é maior que "+n2);
        }
        else if (n2>n1){
            System.out.println("O número "+n2+" é maior que "+n1);
        }
        else{
            System.out.println("Os números são iguais");
        }
    }
}