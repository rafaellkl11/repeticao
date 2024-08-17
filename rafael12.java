/*12. No último ano foi realizada um estudo estatístico sobre acidentes de trânsito em 5 cidades brasileiras.
Para isso os seguintes dados foram coletados:
a) Nome da cidade (String ou char).
b) Número de veículos
c) Número de acidentes de trânsito
Com esses dados deseja-se saber:
a) O maior e o menor índice de acidentes e o nome da cidade a que pertencem
b) A razão entre quantidade de acidentes por quantidade de veículos nas 5 cidades analisadas
c) A média de veículos nas cinco cidades
d) A média de acidentes de trânsito nas cidades com menos de 200 veículos
*/

import java.util.Scanner;
public class rafael12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String cidade, cidadeMenor, cidadeMaior;
        int veiculos, acidentes, somaVeiculos, somaAcidentes, mediaVeiculos, mediaAcidentes, j;
        double indice, indiceMenor, indiceMaior;
        
        cidadeMenor = "";
        cidadeMaior = "";
        somaVeiculos = 0;
        somaAcidentes = 0;
        indiceMenor = 0;
        indiceMaior = 0;
        j = 0;

        System.out.println("12. Programa que a cidade com maior indice de acidentes, razão entre quantidade de acidentes por qunatidade de veiculos, a media de veiculos e a media de acidentes");

        for (int i = 1; i <= 5; i++){
            System.out.print("Digite o nome da "+i+"° cidade: ");
            cidade = teclado.nextLine();
            System.out.print("Digite o número de veiculos da "+i+"° cidade: ");
            veiculos = teclado.nextInt();
            System.out.print("Digite o númeor de acidentes da "+i+"° cidade: ");
            acidentes = teclado.nextInt();
            teclado.nextLine();

            somaVeiculos = somaVeiculos + veiculos;
            if (veiculos <= 200){  
                j = j + 1;  
                somaAcidentes = somaAcidentes + acidentes;
            }

            indice = (double)acidentes / (double)veiculos;

            if (i==1){
                indiceMenor = indice;
                cidadeMenor = cidade;
            }
            else if (i == 2){
                if (indice < indiceMenor){
                    indiceMaior = indiceMenor;
                    cidadeMaior = cidadeMenor;
                    cidadeMenor = cidade;
                    indiceMenor = indice;
                } 
                else{
                    indiceMaior = indice;
                    cidadeMaior = cidade;
                }
            }
            else{
                if (indice < indiceMenor){
                    indiceMenor = indice;
                    cidadeMenor = cidade;
                }
                else if (indice > indiceMaior){
                    indiceMaior = indice;
                    cidadeMaior = cidade;
                }
            }

        }

        mediaVeiculos = somaVeiculos / 5;
        mediaAcidentes = somaAcidentes / j;

        System.out.println("Resultado: ");
        System.out.println("Cidade com maior indice: "+cidadeMaior+"\nMaior indice: "+indiceMaior);
        System.out.println("Cidade com menor indice: "+cidadeMenor+"\nMenor indice: "+indiceMenor);
        System.out.println("Média de veiculos: "+mediaVeiculos);
        System.out.println("Média de acidentes: "+mediaAcidentes);


        teclado.close();
    }    
}
