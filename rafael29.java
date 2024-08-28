/*29. Suponha que JAVA possua somente as operações de soma e subtração. Dados dois números inteiros
positivos A e B, determine o quociente e o resto da divisão de A por B.*/

import java.util.Scanner;
public class rafael29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int A, B, quociente, resto;

        quociente = 0;

        System.out.println("29. Programa que calcula o quociente e o resto da divisão de A por B");

        System.out.print("Digite o valor de A: ");
        A = teclado.nextInt();
        System.out.print("Digite o valor de B: ");
        B = teclado.nextInt();
        
        resto = A;

        while (resto >= B){
            resto = resto - B;
            quociente++;
        }

        System.out.println("Resultado: ");
        System.out.println("Quociente: "+quociente);
        System.out.println("Resto: "+resto);

        teclado.close();
    }    
}
