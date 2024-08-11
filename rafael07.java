/*7. Faça um algoritmo que imprima a soma da sequência apresentada: H = 1/1 + 1/2 + 1/3 + ... + 1/N. O valor
de N deve ser positivo e fornecido pelo usuário.*/
import java.util.Scanner;
public class rafael07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double h, n;

        h = 0;

        System.out.println("7. Programa que calcula a soma da sequência 1/1 + 1/2 + 1/3 + ... + 1/N.");

        System.out.print("Digite o valor de N: ");
        n = teclado.nextInt();

        for (double i = 1; i <= n; i++){
            h = h + (1 / i);
        }

        System.out.println("Resultado:");
        System.out.printf("Soma: %.3f",h);

        teclado.close();
    }    
}
