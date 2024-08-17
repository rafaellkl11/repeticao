/*17. Escreva um algoritmo que calcule o m.d.c. (máximo divisor comum) entre A e B (número inteiros e
positivos). Esses dois valores são passados pelo usuário através do teclado. Utilize a lógica do algoritmo
de Euclides.*/

import java.util.Scanner;
public class rafael17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num1, num2, resto, result, aux;

        resto = 1;
        result = 0;

        System.out.println("17. Programa que calcula o M.D.C(Máximo divisor comum)");

        System.out.print("Digite o A número: ");
        num1 = teclado.nextInt();
        System.out.print("Digite o B núemro: ");
        num2 = teclado.nextInt();

        teclado.close();

        if (num1 < 0 || num2 < 0){
            System.out.println("Resultado:\nValores invalidos");
            return;
        }

        if (num1 < num2){
            aux = num1;
            num1 = num2;
            num2 = aux;
        }

        while (resto != 0){
            resto = num1 % num2;
            result = num1 / num2;
            if (resto == 0){
                result = num2;
            }
            else {
                num1 = num2;
                num2 = resto;
            }
        }
        System.out.println("Resultado: ");
        System.out.println("MDC: "+result);

    }    
}
