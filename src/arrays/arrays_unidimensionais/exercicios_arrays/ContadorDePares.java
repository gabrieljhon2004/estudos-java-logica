package arrays.arrays_unidimensionais.exercicios_arrays;

import java.util.Scanner;

public class ContadorDePares {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length ; i++) {
            System.out.println("Fale um número ");
            numeros[i] = input.nextInt();
        }

        for (int i = 0; i < numeros.length ; i++) {

            if (numeros[i]%2==0) {
                System.out.println(numeros[i] + " é par");
            }

        }

    }
}
