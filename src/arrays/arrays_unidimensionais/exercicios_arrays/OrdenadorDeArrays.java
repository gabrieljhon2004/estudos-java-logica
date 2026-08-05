package arrays.arrays_unidimensionais.exercicios_arrays;
import java.util.Arrays;
import java.util.Scanner;

public class OrdenadorDeArrays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números deseja ordenar: ");
        int tamanho = input.nextInt();
        int[] temperaturas = new int[tamanho];


        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Digite um número: ");
            temperaturas[i] = input.nextInt();

        }

        for (int i = 0; i < temperaturas.length ; i++) {
            for (int j = 0; j < temperaturas.length -1 ; j++) {
                if ( temperaturas[j] > temperaturas [j + 1]) {

                    int aux = temperaturas[j];
                    temperaturas[j] = temperaturas [j + 1];
                    temperaturas [j + 1] = aux;

                }
            }
        }
        System.out.println(Arrays.toString(temperaturas));

        input.close();
    }
}
