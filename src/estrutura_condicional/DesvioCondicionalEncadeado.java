package estrutura_condicional;

import java.util.Scanner;

public class DesvioCondicionalEncadeado {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);




        System.out.print("Entre com a primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.print("Entre com a segunda nota: ");
        double nota2 = input.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("Quantas Faltas:");
        int faltas = input.nextInt();

        if (faltas >= 10) {
            System.out.println("Reprovado pelo excesso de faltas");
        }

        else if (media >= 7) {
            System.out.println("Aprovado");
        }

        else if (media >= 5){
            System.out.println("Recuperação");
        }


        else {
            System.out.println("Reprovado por nota");
        }


        System.out.println("-------Resultado-------");
        System.out.println("Média da prova: " + media);
        System.out.println("Total de faltas: " + faltas);



        input.close();


    }
    }
