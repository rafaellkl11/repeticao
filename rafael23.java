/*23. Considere uma linha ferroviária entre São Paulo e Curitiba. Suponha que uma locomotiva (trem) A parte
de São Paulo para Curitiba com velocidade de 30 m/s enquanto que uma outra locomotiva B parte de
Curitiba para São Paulo no mesmo instante com velocidade de 40 m/s. Considere a distância entre São
Paulo e Curitiba de 400 Km. Considere também que as linhas férreas são paralelas. Implemente um
algoritmo que calcule iterativamente o tempo em que as locomotivas se cruzarão no caminho. O
algoritmo deve calcular também a distância que as locomotivas devem percorrer até o momento do
cruzamento.*/

import java.util.Scanner;
public class rafael23{
   public static void main(String[] args){
      Scanner teclado = new Scanner (System.in);
      double veloA, veloB, distanA, distanB, distanTotal, hora, mins, seg, horaEncontr, minEncontr;
     
      veloA = 30;
      veloB = 40;
      distanTotal = 400;
      distanA = 0;
     
      System.out.println("23. Programa que calcula o tempo em que as colomotivas A e B se encontrarão no caminho de\nCuritiba para São Paulo.");
     
      System.out.print("Digite a hora de partida das locomotivas A e B no formato (h,mins): ");
      hora = teclado.nextDouble();

      teclado.close();
     
      mins = hora % 1;
      hora = hora - mins;
      mins = mins * 100 + hora * 60;
      seg = mins * 60;            
      distanTotal = distanTotal * 1000;
      distanB = distanTotal;
     
      while (distanA < distanB){
         distanA = distanA + veloA;
         distanB = distanB - veloB;
         seg++;      
      }
     
      distanA = distanA/1000;
      distanB = distanB/1000;
      minEncontr = seg / 60;
      minEncontr = minEncontr - (seg % 60) / 60;
      horaEncontr = minEncontr / 60;
      minEncontr = minEncontr % 60;
      horaEncontr = horaEncontr - minEncontr / 60;

      if (horaEncontr > 24){
        horaEncontr = horaEncontr - 24;
      }
     
      System.out.println("Resultado:");      
      System.out.println("Distância trem A: "+distanA+" km");
      System.out.printf("Distância trem B: %.2f km\n",distanB);      
      System.out.printf("Horário de encontro: %.0f",horaEncontr);
      System.out.printf(":%.0f",minEncontr);      
   }
}