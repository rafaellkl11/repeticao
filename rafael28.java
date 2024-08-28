/*28. Escreva um programa em JAVA que imprima o triângulo abaixo, em que a altura do triângulo (número de
linhas) é fornecido pelo usuário.*/

import java.util.Scanner;
public class rafael28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int l;
        String triangulo;

        triangulo = "";

        System.out.println("28. Programa que imprime um triângulo e a altura e digitada pelo usuario");

        System.out.print("Digite a altura do triângulo: ");
        l = teclado.nextInt();

        System.out.println("Resultado: ");

        for (int i = 1; i <= l; i++){
            triangulo = triangulo + "# ";
            System.out.println(triangulo);
        }

        teclado.close();
    }
}
