package pesquisa_binaria;
import java.util.Scanner;
import java.util.Arrays;

public class testeComMeusConhecimentosBasicos {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);


        int aux = 0;

        System.out.println("Digite quantos números deseja ordenar no array: ");
        int tamanho = input.nextInt();
        int[] vetor = new int[tamanho];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número para a posição " + i + ": ");
            vetor[i] = input.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length -1 ; j++) {

                if (vetor[j] > vetor[j+1]) {
                    aux = vetor[j+1];
                    vetor[j+1] = vetor[j];
                    vetor [j] = aux;
                }
            }
        }
        System.out.println(Arrays.toString(vetor));

        System.out.println("--------Pesquisa Binária---------");

        System.out.println("Qual número dentro do vetor deseja pesquisar?");
        int numPesquisa = input.nextInt();


        int inicio = 0;
        int fim = vetor.length - 1;
        boolean encontrado = false;


        while (inicio <= fim) {

            int meio = (inicio + fim) / 2;

            if (vetor[meio] == numPesquisa) {
                System.out.println("Número " + numPesquisa + " encontrado no índice: " + meio);
                encontrado = true;
                break;
            }
            else if (vetor[meio] < numPesquisa) {

                inicio = meio + 1;
            }
            else {

                fim = meio - 1;
            }
        }

        if (!encontrado) {
            System.out.println("Número " + numPesquisa + " não encontrado no vetor.");
        }

        input.close();
    }
}
