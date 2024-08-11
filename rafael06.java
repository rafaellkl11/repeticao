/*6. Faça um programa que calcule e imprima a soma e a média dos N primeiros números positivos. Soma = 1
+ 2 + 3 + ... + N */
import java.util.Scanner;
public class rafael06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n;
        double soma, media;

        soma = 0;

        System.out.println("6. Programa que calcula os N primeiros números.");
        
        System.out.print("Digite o valor de N: ");
        n = teclado.nextInt();

        for (int i = 0; i <= n; i++){
            soma = soma + i;
        }

        media = soma / n;

        System.out.println("Resultado:");
        System.out.println("Soma: "+soma);
        System.out.println("Média: "+media);
        
        teclado.close();
    }    
}
