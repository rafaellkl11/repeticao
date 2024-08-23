/*21. Implemente um programa que receba de entrada um n�mero inteiro qualquer, ap�s isso verifique se o
n�mero inserido � ou n�o um PAL�NDROMO, ou seja, o n�mero � o mesmo tanto de visto da direita para
esquerda quanto da esquerda para a direita. Ex: 121, 1441, 34643, etc. N�o utilize fun��es pr�-definidas
no JAVA.*/

import java.util.Scanner;
public class rafael21{
   public static void main(String[] args){
      Scanner teclado = new Scanner (System.in);
      int num, numAux, casas, alg, algInvert, j, resto;
      
      casas = 0;
      j = 0;
      resto = 0;
      
      System.out.println("21. Programa que recebe um n�mero inteiro e verifica se � ou n�o um pal�ndromo ");
      
      System.out.print("Digite o n�mero: ");
      num = teclado.nextInt();

      teclado.close();
      
      numAux = num;
      
      while (numAux != 0){
         numAux = numAux / 10;
         casas++;
      }
      
      while (j != casas){
         j++;
         
         numAux = num;
         
         for (int n = 1; n <= j; n++){
            resto = numAux % 10;
            numAux = numAux / 10;
         }
         alg = resto;

         numAux = num;
         
         for (int n2 = casas; n2 >= j; n2--){
            resto = numAux % 10;
            numAux = numAux / 10;
         }
         algInvert = resto;
         
         if (alg != algInvert){
           System.out.print("Resultado: \nO n�mero "+num+" n�o � um palindromo");
           return;
         }         
      }
      
      System.out.println("Resultado: \nO n�mero "+num+" � um palindromo");
   }
}
