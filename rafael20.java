/*20. Construa um algoritmo para calcular a média de valores PARES e ÍMPARES, que serão digitados pelo
usuário. Ao final, o algoritmo deve mostrar estas duas médias bem como o maior número PAR e o menor
número ÍMPAR digitado. O algoritmo finaliza quando o usuário digitar um valor negativo.*/

import java.util.Scanner;
public class rafael20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double num, maiorPar, menorImpar,somaPar, somaImpar, mediaPar, mediaImpar, i, j, resto;

        num = 1;
        maiorPar = 0;
        menorImpar = 999999999;
        somaPar = 0;
        somaImpar = 0;
        i = 0;
        j = 0;

        System.out.println("20. Programa que calcula a média de valores pares e impares, o maior número par e o menor impar ");
        
        while (num > 0){
            System.out.println("Digite um número negativo para calcular a média");
            System.out.print("Digite o número:");
            num = teclado.nextDouble();

            if (num >= 0){
                resto = num % 2;
                if(resto == 0){
                    if(num > maiorPar){
                        maiorPar = num;
                    }
                    somaPar = somaPar + num;
                    i++;
                }
                else{
                    if (num < menorImpar){
                        menorImpar = num;
                    }
                    somaImpar = somaImpar + num;
                    j++;
                }
            }
        }

        mediaPar = somaPar / i;
        mediaImpar = somaImpar / j;

        System.out.println("Resultado:");
        System.out.println("Média dos números pares: "+mediaPar);
        System.out.println("Média dos números impares: "+mediaImpar);
        System.out.println("Maior número par: "+maiorPar);
        System.out.println("Menor número impar: "+menorImpar);

        teclado.close();
    }    
}
