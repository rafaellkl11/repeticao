/*22. Sabe-se que um pa�s A possui 500000 habitantes e uma taxa de natalidade de 3% ao ano, j� o pa�s B
possui 700000 habitantes e uma taxa de natalidade de 2% ao ano. Escreva um algoritmo, sabendo que
estamos no ano de 2015, que calcule em que ano a popula��o do pa�s A ultrapassar� a popula��o de B.*/

public class rafael22{
   public static void main(String[] args){
      double A, B;
      int ano;
      
      System.out.println("22. Programa que calcula o ano em que a popula��o da cidade A ultrapassar� a\ncidade B "); 
      
      A = 500000;
      B = 700000;
      ano = 2015;
      
      while (A < B){
         A = A + A * 0.03;
         B = B + B * 0.02;
         ano++;
      }
      
      System.out.println("Resultado:");
      System.out.println("Ano: "+ano);      
   }
}
