/*30. A companhia de teatro do IFMG Sabará deseja realizar uma série de espetáculos. A direção calcula que a
despesa fixa do espetáculo é de R$200,00. Além disso, sabe-se que com os ingressos ao preço de R$5,00
serão vendidos 120 entradas. Em uma pesquisa de público estimou-se que a cada R$0,50 de diminuição
no valor do ingresso espera-se um aumento de 26 ingressos nas vendas. Diante dessas informações,
implemente um programa que calcule e imprima uma tabela contendo os valores dos lucros esperados em
função do valor dos ingressos, fazendo uma variação nos ingressos de R$5,00 à R$1,00 de R$0,50 em
R$0,50. Escreva ainda o lucro máximo esperado, o preço do ingresso e quantidade de ingressos vendidos
para obtenção desse lucro máximo estimado.*/

public class rafael30 {
    public static void main(String[] args) {
        double preco, ingressos, despesa, lucro, lucroMax, ingressoMelhor, precoMelhor;

        despesa = 200;
        preco = 5;
        ingressos = 120;
        lucroMax = 0;
        ingressoMelhor = 0;
        precoMelhor = 0;

        System.out.println("30.Programa que calcula o lugro da companhia de teatro");

        System.out.println("Resultado: ");
        System.out.println("Quantidade|preço|lucro");

        lucro = ingressos * preco - despesa;

        System.out.println(ingressos+" | "+preco+" | "+lucro);

        for (double i = preco - 0.5; i >= 1; i = i - 0.5){
            ingressos = ingressos + 26;
            lucro = ingressos * i - despesa;
            System.out.println(ingressos+" | "+i+" | "+lucro);
            if (lucroMax < lucro){
                lucroMax = lucro;
                ingressoMelhor = ingressos;
                precoMelhor = i;
            }
        }
        System.out.println("\nOpção com melhor lucro: ");
        System.out.println("Quantidade|preço|lucro");
        System.out.println(ingressoMelhor+" | "+precoMelhor+" | "+lucroMax);

    }
}
