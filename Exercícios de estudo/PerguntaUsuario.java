package estudo;


import java.util.Scanner; /*importando classe pro usuario digitar */

public class PerguntaUsuario {
    
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double base, altura, area; /*no valor do DOUBLE usa-se virgula */ 
        
        System.out.println("Informe o valor da base: ");
        base = input.nextDouble(); /*pega o valor digitado pelo usuario */
        
        System.out.println("Informe o valor da altura: ");
        altura = input.nextDouble(); /*pega o valor digitado pelo usuario */
        
        area = base * altura; 
        
        System.out.println("O valor da área é de: " + area + " m");
    }
}