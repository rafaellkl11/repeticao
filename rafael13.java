/*13. Fa�a um algoritmo para identificar se um determinado n�mero fornecido pelo usu�rio � primo ou n�o.
Lembrando que um n�mero primo s� � divis�vel por 1 e por ele mesmo. Exemplos: 2, 5, 7, etc.*/

import java.util.Scanner;
public class rafael13{
   public static void main(String[] args){
      Scanner teclado = new Scanner (System.in);
      int num, num2, resto, divisores;
      
      divisores = 0;
      
      System.out.println("13. Programa que identifica se o n�mero e primo ou n�o");
      
      System.out.print("Digite o n�mero: ");
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
         System.out.println("Resultado:\nO n�mero "+num+" � primo");
      }
      else{
         System.out.println("Resultado:\nO n�mero "+num+" n�o � primo");
      }
        
      teclado.close();
   }
}