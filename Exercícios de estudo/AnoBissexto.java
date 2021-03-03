/*Um ano é considerado BISSEXTO quando: 
1. Todos os anos multiplos de 400. 
2. Todos os multiplos de 4 e não multiplos de 100.
*/

package estudo;

import java.util.Scanner;

public class AnoBissexto{
    
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int ano;
        
        System.out.println("Digite o ano para verificar se é bissexto: ");
        ano = input.nextInt();
        
       /* if((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)){
            
            System.out.println("O ano "+ano+" é bissexto.");
        }
        else{
            System.out.println("O ano "+ano+" não é bissexto.");
        }
        */
       
       boolean x = ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0));
       
       System.out.println(x);
       
    }
}
