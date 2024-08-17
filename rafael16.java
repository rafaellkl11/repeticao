/*16. Elabore um algoritmo que faça a conversão de um número binário de N bits digitados pelo usuário para o
número na base octal, base decimal e base hexadecimal. Valide se o valor informado na entrada só
possui 0’s ou 1’s, ou seja, se é mesmo um número binário. Não utilize funções pré-definidas no
JAVA.*/

import java.util.Scanner;
public class rafael16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
    long binario, decimal,  i, casasOctal, casasHexadecimal, resto, potencia, bits; 
    String octal, hexadecimal, numHexa;

        bits = 0;
        decimal =0;
        casasOctal = 0;
        casasHexadecimal = 0;
        octal = "";
        hexadecimal = "";
        numHexa = "";

        System.out.println("16. Programa que converte de binário para decimal, octal e hexadeciaml");

        System.out.print("Digite o número binário: ");
        binario = teclado.nextInt();

        teclado.close();

        i = binario;

        while (i != 0){
            resto = i % 10;
            i = i / 10;
            if (resto != 1 && resto !=0){
                System.out.println("Valor invalido");
                return;
            }
        }

        i = binario;

        while (i != 0){
            resto = i % 10;
            i = i / 10;
        }

        i = binario;

        while (i != 0){
            resto = i % 10;
            i = i / 10;
            bits ++;

            potencia = 1;

            if (resto == 1){
                if (bits == 1){
                    potencia = 1;
                }               
                else if (bits >1){
                    for (int j = 2; j<=bits; j++){
                        potencia = potencia * 2;
                    }
                }
                decimal = decimal + potencia;
            }
        }

        i = decimal;

        while (i != 0){
            i = i / 8;
            casasOctal++;
        }

        resto = 0;

        while (casasOctal != 0){
                i = decimal;
                for(int j = 1; j <= casasOctal; j++){
                    resto = i % 8;
                    i = i / 8;
                }
                octal = octal + Long.toString(resto); 
                casasOctal --;    
        }

        i = decimal;

        while (i != 0){
            i = i / 16;
            casasHexadecimal ++;
        }

        resto = 0;

        while (casasHexadecimal != 0){
            i = decimal;
            for(int j = 1; j <= casasHexadecimal; j++){
                resto = i % 16;
                i = i / 16;
            }
            if (resto == 10){
                numHexa = "A";
            }
            else if (resto == 11){
                numHexa = "B";
            }
            else if (resto == 12){
                numHexa = "C";
            }
            else if (resto == 13){
                numHexa = "D";
            }
            else if (resto == 14){
                numHexa = "E";
            }
            else if (resto == 15){
                numHexa = "F";
            }
            else{
                numHexa = Long.toString(resto);
            }
            hexadecimal = hexadecimal + numHexa; 
            casasHexadecimal --;    
    }

        System.out.println("Resultado: ");
        System.out.println("Número binário: "+binario);
        System.out.println("Número decimal: "+decimal);
        System.out.println("Número octal: "+octal);
        System.out.println("Número hexadecimal: "+hexadecimal);

    }
}