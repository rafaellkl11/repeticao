/*13. Faça um algoritmo para identificar se um determinado número fornecido pelo usuário é primo ou não.
Lembrando que um número primo só é divisível por 1 e por ele mesmo. Exemplos: 2, 5, 7, etc.*/

import java.util.Scanner;
public class rafael13{
   public static void main(String[] args){
      Scanner teclado = new Scanner (System.in);
      int num, num2, resto, divisores;
      
      divisores = 0;
      
      System.out.println("13. Programa que identifica se o número e primo ou não");
      
      System.out.print("Digite o número: ");
      num = teclado.nextInt();
      
      num2 = num;
      
      while (num2 != 0){
         resto = num % num2;
         num2 = num2 - 1;
         if (resto == 0){
            divisores = divisores + 1;
            
         }
      }
      
      if (divisores <= 2){
         System.out.println("Resultado:\nO número "+num+" é primo");
      }
      else{
         System.out.println("Resultado:\nO número "+num+" não é primo");
      }
        
      teclado.close();
   }
}