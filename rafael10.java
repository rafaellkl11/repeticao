/*10. Implemente um algoritmo que receba de entrada N valores digitados pelo usuário. Dentre os valores
digitados, seu programa deve encontrar o menor e o maior dos valores fornecidos.*/
import java.util.Scanner;
public class rafael10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nString;
        int i;
        double n, menor, maior;

        nString = "";
        i = 0;
        n = 0; 
        menor = 0;
        maior = 0;

        System.out.println("Programa que recebe N números e econtra o menor e o maior número");
        System.out.println("Digite '=' para calcular");

        while (!nString.equals("=")){
            i = i + 1;
            System.out.print("Digite o "+i+"° número:");
            nString = teclado.nextLine();

            if (nString.equals("=")){
                break;
            }

            n = Double.parseDouble(nString);

            if (i==1){
                menor = n;
            }
            else if (i == 2){
                if (n < menor){
                    maior = menor;
                    menor = n;
                } 
                else{
                    maior = n;
                }
            }
            else{
                if (n < menor){
                    menor = n;
                }
                else if (n > maior){
                    maior = n;
                }
            }
        }
        
        System.out.println("Resultado:");
        System.out.println("Menor: "+menor);
        System.out.println("Maior: "+maior);

        teclado.close();
    }
    
}
