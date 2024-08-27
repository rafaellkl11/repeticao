/*25. O valor aproximado de PI pode ser calculado usando os 51 primeiros termos da seguinte série:

Sendo PI = . Sabendo disso, implemente um algoritmo que calcule e imprima o valor de PI
utilizando a série apresentada.*/

public class rafael25 {
   public static void main(String[] args) {
      double S, pi;
      
      S = 0;

      System.out.println("25. Programa que calcula o valor aproximado de PI");
        
      for (int i = 1; i <=51; i++) {
         if ((i%2) == 1){
            S = S + 1 / (Math.pow((2*i-1),3));
         }
         else {
            S = S - 1 / (Math.pow((2*i-1),3));
         }        
      }
      pi = Math.cbrt(S*32);
      
      System.out.println("Resultado: ");
      System.out.println("Valor de PI: "+pi);
   }    
}
