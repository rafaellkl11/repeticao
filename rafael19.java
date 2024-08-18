/*19. Faça um programa que deve solicitar números para o usuário até que seja digitado -1. Quando o usuário
digitar -1, o programa termina e imprime a média de todos os números positivos digitados.*/
import java.util.Scanner;
public class rafael19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double num, soma, media;
        int i;

        num = 0;
        i = 0;
        soma = 0;

        System.out.println("19. Programa que calcula a média dos números digitados ");
        
        while (num != -1){
            i++;
            System.out.println("Digite -1 para calcular");
            System.out.print("Digite o "+i+"° número: ");
            num = teclado.nextDouble();

            if (num == -1){
                i--;
            }
            else{
                soma = soma + num;
            }            
            

        }
        
        media = soma / i;

        System.out.println("Resultado: ");
        System.out.printf("A Média dos "+i+" números digitados é %.2f",media);

        teclado.close();
    }    
}
