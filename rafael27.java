/*27. Implemente um programa que solicite um valor inteiro positivo (N) ao usuário. Após isso, imprima a
tabuada dos números de 1 à N.*/

import java.util.Scanner;
public class rafael27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n, result;

        System.out.println("27. Programa que calcula a tabuada de N de 0 a N");

        System.out.print("Digite o valor de N: ");
        n = teclado.nextInt();

        System.out.println("Resultado: ");

        for (int i = 0; i <= n; i++){
            result = n * i;
            System.out.println(i+" * "+n+" = "+result);
        }

        teclado.close();
    }    
}
