/*31. Em uma eleição presidencial existem quatro candidatos. Os votos são informados através de códigos. Os
dados utilizados para a contagem dos votos obedecem à seguinte codificação:
- 1, 2, 3, 4: voto para os respectivos candidatos;
- 5: voto em branco;
- Outros valores: voto nulo.
Elabore um algoritmo que leia o código do candidato em um voto. Calcule e escreva:
- total de votos para cada candidato;
- total de votos nulos;
- total de votos em branco;
Como finalizador do conjunto de votos, tem-se o valor de código igual à 0.*/

import java.util.Scanner;
public class rafael31 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int voto, v1, v2, v3, v4, branco, nulo, total;

        voto = 99;
        v1 = 0;
        v2 = 0;
        v3 = 0;
        v4 = 0;
        branco = 0;
        nulo = 0;

        System.out.println("31. Programa que simula uma urna");

        while (voto != 0) {
            System.out.println("número dos candidatos disponiveis:\n");
            System.out.println("1 - Fulano");
            System.out.println("2 - Siclano");
            System.out.println("3 - Beltrano");
            System.out.println("4 - Jorgin do pneu");
            System.out.println("5 - Branco");
            System.out.println("0 - Sair\n");
            System.out.print("Digite o número do candidato: ");
            voto = teclado.nextInt();

            if (voto == 1){
                v1++;
            }
            else if (voto == 2){
                v2++;
            }
            else if (voto == 3){
                v3++;
            }
            else if (voto == 4){
                v4++;
            }
            else if (voto == 5){
                branco++;
            }
            else if (voto == 0){
                voto = 0;
            }
            else {
                nulo++;
            }
        }

        total = v1 + v2 + v3 + v4 + branco + nulo;

        System.out.println("Resultado: ");
        System.out.println("Total de votos: "+ total);
        System.out.println("Votos no Fulano: "+ v1);
        System.out.println("Votos no Siclano: "+ v2);
        System.out.println("Votos no Beltrano: "+ v3);
        System.out.println("Votos no Jorgin do pneu: "+ v4);
        System.out.println("Votos no Brano: "+ branco);
        System.out.println("Votos no nulo: "+ nulo);


        teclado.close();
    }
}
