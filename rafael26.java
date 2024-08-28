/*26. Implementar um algoritmo para calcular o sen(X). Sabe-se que o valor de X deverá ser fornecido pelo
usuário em graus. O valor do seno de X será calculado pela soma dos 15 primeiros termos da série a
seguir:*/

import java.util.Scanner;
public class rafael26{
   public static void main(String[] args){
      Scanner teclado = new Scanner (System.in);
      double xGraus, xRad, sen, fat, expo, fatAux;
     
      fat = 1;
      sen = 0;
      expo = 0;
     
      System.out.println("26. Programa que calcula o seno de X");
     
      System.out.print("Digite o valor de X: ");
      xGraus = teclado.nextDouble();

      xRad = xGraus * 3.14 / 180;
     
      for (int i = 1; i <= 15; i++) {
         fat = 2 * i - 1;
         expo = 2 * i - 1;
         fatAux = fat;

         for (double j = 1; j <= fatAux-1; j++){
            fat = fat * j;
         }        

         if ((i%2) == 1){
            sen = sen + Math.pow(xRad,expo)/fat;
         }
         else {
            sen = sen - Math.pow(xRad,expo)/fat;
         }   

      }
      System.out.println("Resultado: ");
      System.out.printf("Valor do seno: %.2f",sen);  
      
      teclado.close();
   }
}