/*4.Escreva um algoritmo que receba números do usuário e imprima o triplo de cada número. O algoritmo
deve encerrar ao ser digitado o número –999. Obs.: O triplo de -999 não deve ser exibido.*/
import java.util.Scanner;
public class rafael04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int n, res;

        n = 0;

        while (n != -999){
            System.out.println("4.Programa que multiplica por 3, o programa será encerrado ao digitar -999");
            System.out.print("Digite um número: ");
            n = teclado.nextInt();

            res = n *3;
            if (n != -999){
                System.out.println("Resultado: "+res);
                System.out.println();
            }
        }


        teclado.close();
    }    
}
