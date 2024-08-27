/*26. Implementar um algoritmo para calcular o sen(X). Sabe-se que o valor de X deverá ser fornecido pelo
usuário em graus. O valor do seno de X será calculado pela soma dos 15 primeiros termos da série a
seguir:*/

import java.util.Scanner;
public class rafael26{
   public static void main(String[] args){
      Scanner teclado = new Scanner (System.in);
      double xGraus, xRad, sen, fat, fatAux;
     
      fat = 0;
      sen = 0;
     
      System.out.println("16. Programa que calcula o seno de X");
     
      System.out.print("Digite o valor de X: ");
      xGraus = teclado.nextDouble();
     
      for (int i = 1; i <= 15; i++) {
         System.out.println(i);
         fat = 2 * i - 1;
         fatAux = fat;
         System.out.println(fat);
                 
         for (double j = fatAux; j >= 0; j--){
            fat = fat * j;
            System.out.println(fat);
           
           
         }
         
         
         if ((i%2) == 1){
            sen = sen + Math.pow(xGraus,3)/fat;
         }
         else {

         }        
      }
      System.out.println("sen"+sen);        
   }
}