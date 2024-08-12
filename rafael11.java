/*11. Faça um programa que leia a nota e o nome de N alunos na prova de algoritmos e imprima a maior e a
menor nota computada e qual aluno tirou tais notas. Além disso, calcule e imprima também a soma e a
média de todas as notas.*/
import java.util.Scanner;
public class rafael11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String nome, nomeMenor, nomeMaior, rep;
        double nota, menorNota, maiorNota, soma, media;
        int i;

        nomeMaior = "";
        nomeMenor = "";
        menorNota = 0;
        maiorNota = 0;
        soma = 0;
        i = 0;
        rep = "";

        System.out.println("11. Programa que ler notas de alunos e imprima a menor, a maior, a soma e a media das notas de todos os alunos");
        
        while(!rep.equals("N")){
            i = i + 1;
            System.out.print("Digite o nome do "+i+"° aluno: ");
            nome = teclado.nextLine();
            System.out.print("Digite a nota do "+i+"° aluno: ");
            nota = teclado.nextDouble();

            soma = soma + nota;

            if (i==1){
                menorNota = nota;
                nomeMenor = nome;
            }
            else if (i == 2){
                if (nota < menorNota){
                    maiorNota = menorNota;
                    nomeMaior = nomeMenor;
                    nomeMenor = nome;
                    menorNota = nota;
                } 
                else{
                    maiorNota = nota;
                    nomeMaior = nome;
                }
            }
            else{
                if (nota < menorNota){
                    menorNota = nota;
                    nomeMenor = nome;
                }
                else if (nota > maiorNota){
                    maiorNota = nota;
                    nomeMaior = nome;
                }
            }
            System.out.print("Digite 'S' para adicionar mais um aluno e 'N' para calcular: ");
            teclado.nextLine();
            rep = teclado.nextLine();
        }
        media = soma / i;

        System.out.println("Resultado: ");
        System.out.println("Nome do aluno com a maior nota: "+nomeMaior+"\nMaior nota: "+maiorNota);
        System.out.println("Nome do aluno com a menor nota: "+nomeMenor+"\nMenor nota: "+menorNota);
        System.out.println("Soma de todas as notas: "+soma);
        System.out.println("Média de todas as notas: "+media);

        teclado.close();
    }    
}
