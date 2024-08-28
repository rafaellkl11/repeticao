/*32. Escrever um algoritmo que gera e escreve os 5 primeiros números perfeitos. Um número perfeito é aquele
que é igual a soma dos seus divisores. (Ex.: 6 = 1+2+3; 28= 1+2+4+7+14 etc).*/

public class rafael32 {
    public static void main(String[] args) {
        int num, numPerf, resto, divisor, somaDiv;

        num = 1;
        divisor = 0;
        somaDiv = 0;
        numPerf = 0;

        System.out.println("32. Programa que encontra os 5 primeiros números perfeitos: ");

        System.out.println("Resultado:");

        while (numPerf <= 5){
            while (somaDiv != num){
                num++;
                divisor = 0;
                somaDiv = 0;
                while (num/2 > divisor){
                    divisor++;
                    resto = num % divisor;
                    
                    if (resto == 0){
                        somaDiv = somaDiv + divisor;
                    }
                }
                if (num == somaDiv){
                    numPerf++;
                }
            }
            System.out.println(somaDiv);
            num++;
        }
    }
    
}
