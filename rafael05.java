/*5. Faça um programa que calcule e imprima a soma e a média dos 10 primeiros números positivos. Soma =
1 + 2 + 3 + ... + 10*/
public class rafael05 {
    public static void main(String[] args) {
        int n;
        double soma, media;
        
        soma = 0;

        System.out.print("5. Soma e media dos números: ");

        for (n = 1; n <= 10; n++){
            System.out.print(n+", ");
            soma = soma + n;
        }

        media = soma/10;

        System.out.println("\nResultado: ");
        System.out.println("Soma: "+ soma);
        System.out.println("Média: "+ media);

    }
}
