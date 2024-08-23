/*24. Uma Empresa de fornecimento de energia elétrica faz a leitura mensal dos medidores de consumo. Para
cada consumidor, são digitados os seguintes dados:
- Número do consumidor;
- Quantidade de kWh consumidos durante o mês;
- Tipo (código) do consumidor.
1 – residencial, preço em reais por kWh = 0,3
2 – comercial, preço em reais por kWh = 0,5
3 – industrial, preço em reais por kWh = 0,7

Os dados devem ser lidos até que seja encontrado um consumidor com Número 0 (zero). Escreva um
programa que calcule e imprima:
- O custo total para cada consumidor;
- O total de consumo para os três tipos de consumidor;
- A média de consumo dos tipos 1 e 2.*/

import java.util.Scanner;
public class rafael24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double numConsumidor, tipo, consumo, total, consumo1, consumo2, consumo3, consumidores1, consumidores2, mediaconsumidor1, mediaconsumidor2;
        String consumidores;
        
        numConsumidor = 1;
        consumo = 0;
        tipo = 0;
        total = 0;
        consumo1 = 0;
        consumo2 = 0;
        consumo3 = 0;
        consumidores1 = 0;
        consumidores2 = 0;
        consumidores = "cosumidor | total\n";

        while (numConsumidor != 0){
            System.out.println("24. Programa que faz leitura mensal dos medidores de consumo de energia elétrica.");

            System.out.print("Digite 0 para sair\nDigite o número do consumidor: ");
            numConsumidor = teclado.nextDouble();
            if (numConsumidor != 0){
                System.out.print("Digite a quantidade de kWh: ");
                consumo = teclado.nextDouble();
                System.out.print("Tipos consumidor\n\n  1 - residencial\n  2 - comercial\n  3 - industrial\n\nDigite o Tipo de consumidor: ");
                tipo = teclado.nextDouble();
                if (tipo == 1){
                total = consumo * 0.3;
                consumo1 = consumo1 + consumo;
                consumidores1++;
                }
                else if (tipo == 2){
                    total = consumo * 0.5;
                    consumo2 = consumo2 + consumo;
                    consumidores2++;
                }
                else if (tipo == 3){
                    total = consumo * 0.7;
                    consumo3 = consumo3 + consumo;
                }

                if (numConsumidor != 0){
                    consumidores = consumidores + numConsumidor + " | R$"+ total+"\n";
                }

            }
            
            
        }

        mediaconsumidor1 = consumo1 / consumidores1;
        mediaconsumidor2 = consumo2 / consumidores2; 

        System.out.println("Resultado:");
        System.out.println(consumidores);
        System.out.println("Total de consumo tipo 1: "+consumo1+" kWh");
        System.out.println("Total de consumo tipo 2: "+consumo2+" kWh");
        System.out.println("Total de consumo tipo 3: "+consumo3+" kWh");
        System.out.println("\nMédia de consumo do tipo 1: "+mediaconsumidor1+" kWh");
        System.out.println("Média de consumo do tipo 2: "+mediaconsumidor2+" kWh");

        teclado.close();
    }    
}