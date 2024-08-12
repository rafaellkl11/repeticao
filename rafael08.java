/*8. Faça um algoritmo que imprima a soma da sequência apresentada: H = 1 - 1/2 + 1/3 – 1/4 + 1/5... 1/N. O
valor de N deve ser positivo e fornecido pelo usuário.*/
import java.util.Scanner;
public class rafael08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double h, n, resto;

        h = 0;
        resto = 0;

        System.out.println("8. Programa que calcula a soma da sequência 1/1 - 1/2 + 1/3 - 1/4 +... + 1/N.");

        System.out.print("Digite o valor de N: ");
        n = teclado.nextInt();

        for (double i = 1; i <= n; i++){
            resto = i%2;

            if (resto == 1){
                h = h + (1 / i);
            }
            else{
                h = h - (1 / i);
            }
        }

        System.out.println("Resultado:");
        System.out.printf("Soma: %.3f",h);

        teclado.close();
    }    
}
