/* 9. Faça um programa que calcule e imprima a soma e a média de N números digitados pelo usuário. O valor
de N deve ser fornecido pelo usuário.*/
import java.util.Scanner;
public class rafael09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String nString;
        double n, soma, media, i;

        soma = 0;
        i = 0;
        nString = "";

        System.out.println("9. Programa que calcula a soma e média de N números.");
        System.out.println("Digite '=' para calcular.");

        while (!nString.equals("=")){
            i = i + 1;
            System.out.print("Digite o "+i+"° número: ");
            nString = teclado.nextLine();

            if (nString.equals("=")){
                break;
            }

            n = Double.parseDouble(nString);

            soma = soma + n;

        }

        media = soma/(i-1);

        System.out.println("Resultado: ");
        System.out.println("Soma: "+soma);
        System.out.println("Media: "+media);
        
        teclado.close();
    }
    
}
