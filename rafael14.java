/*14. Fa�a um programa que calcule e imprima o fatorial do valor N. O valor de N ser� fornecido de entrada
pelo usu�rio. O fatorial de um n�mero positivo N qualquer (representado por N!) � o produto de todos os
inteiros positivos menores ou iguais � N, ou seja, Fatorial (N) = 1 * 2 * 3 * ... * N. Por exemplo, o
fatorial de 5 = 1*2*3*4*5 = 120.*/

import java.util.Scanner;
public class rafael14{
   public static void main(String[] args){
      Scanner teclado = new Scanner (System.in);
      int num, resultado;
      
      resultado = 1;
      
      System.out.println("14. Programa que calcula o fatorial de N");
      
      System.out.print("Digite o valor de N: ");
      num = teclado.nextInt();
      
      for (int soma = 1; soma <= num; soma++){
         resultado = resultado * soma;
      }
      System.out.println("Resultado: ");
      System.out.println("Fatoria de "+num+" � igual a "+resultado);

      teclado.close();      
   }
}
