/*15. Faça um programa em JAVA que imprima os N primeiros termos da serie de Fibonacci. Sabe-se que N é
fornecido pelo usuário. Fibonacci = 1, 1, 2, 3, 5, 8, 13, 21, ...*/

import java.util.Scanner;
public class rafael15 {
    public static void main(String[] args) {
        Scanner teclado =  new Scanner (System.in);
        int n, num2, num3, result;
        String resultS;

        num2 = 0;
        num3 = 0;
        resultS = "";

        System.out.println("15. Programa que imprima os N primeiros termos da serie de Fibonacci");

        System.out.print("Digite o valor de N: ");
        n = teclado.nextInt();

        for (int i = 1; i <= n; i++){
            if (i == 1){
                result = 1;
                num2 = 1; 
            }
            else if (i == 2){
                result = 1;
                num3 = 1;
            }
            else{
                result = num2 + num3;
            }            
            resultS = resultS + Integer.toString(result);
            num2 = num3;
            num3 = result;
            if (i != n){
                resultS = resultS + ", ";
            }
        }
        System.out.println("Resultado:");
        System.out.println("Os "+n+" primeiros termos da serie são:");
        System.out.println(resultS);
        
        teclado.close();
    }
}
