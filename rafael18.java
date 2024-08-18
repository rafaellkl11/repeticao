/*18. Faça um algoritmo que simule o funcionamento de uma calculadora que contenha as operações
aritméticas básicas com dois números digitados pelo usuário. O programa implementado deve mostrar
seguinte menu ao usuário. Não se esqueça de verificar se as operações podem ser realizadas.*/
import java.util.Scanner;
public class rafael18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double num1, num2, opcao, result;
        String operacao;

        operacao = "";
        opcao = 0; 
        result = 0;

        System.out.println("18. Programa que faz perações báscas com dois números digitados pelo usuário");

        while (opcao != 5){
            System.out.println("\nCalculadora do Rafael");
            System.out.println("opções:\n");
            System.out.println("    1-Soma");
            System.out.println("    2-Subtração");
            System.out.println("    3-Multiplicação");
            System.out.println("    4-Divisão");
            System.out.println("    5-Sair\n");
            System.out.print("Digite o número da opção que deseja: ");
            opcao = teclado.nextDouble();

            if (opcao == 5){
                return;
            }

            System.out.print("Digite o 1° número: ");
            num1 = teclado.nextDouble();
            System.out.print("Digite o 2° número: ");
            num2 = teclado.nextDouble();

            

            if (opcao == 1){
                result = num1 + num2;
                operacao = " + ";
            }
            else if (opcao == 2){
                result = num1 - num2;
                operacao = " - ";
            }
            else if (opcao == 3){
                result = num1 * num2;
                operacao = " * ";
            }
            else if (opcao == 4){
                result = num1 / num2;
                operacao = " / ";
                if (num2 == 0){
                    System.out.println("Erro, divisão por 0");
                    break;
                }
            }
            else {
                System.out.println("Erro, digite novamente");            
            }
            System.out.println("Resultado: ");
            System.out.println(num1+""+operacao+""+num2+" = "+result+"\n");
            System.out.print("Digite 0 para continuar:");
            opcao = teclado.nextDouble();
                        
            teclado.close();
        }
        
    }
}
