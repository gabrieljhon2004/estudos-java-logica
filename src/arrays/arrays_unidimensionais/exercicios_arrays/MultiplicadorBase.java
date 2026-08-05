package arrays.arrays_unidimensionais.exercicios_arrays;
import java.util.Scanner;

public class MultiplicadorBase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = input.nextInt();
        }

        System.out.println("Digite um número multiplicador: ");
        int numMultiplicador = input.nextInt();

        System.out.println("-----Resultado-----");

        for (int i = 0; i < numeros.length; i++) {
            int resultado = numeros[i] * numMultiplicador;
            System.out.println(numeros[i] + " x " + numMultiplicador + " = "+ resultado);
        }

    }

}