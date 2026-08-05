package arrays.arrays_unidimensionais.pesquisa_linear_com_vetores;
import java.util.Scanner;

public class CalculadorDeMedia {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);


        int[] numInteiros = new int[5];
        int somaElementos = 0;
        int media = 0;
        int contador = 0;

        for (int i = 0; i < numInteiros.length ; i++) {
            System.out.println("Digite o número para a posição " + i +" :" );
            numInteiros[i] = input.nextInt();
        }
        for (int i = 0; i < numInteiros.length; i++) {
            somaElementos += numInteiros[i];

        }
        System.out.println("A média total desses números é de =  " + (media = somaElementos / numInteiros.length));

        System.out.println("------------------------");

        for (int i = 0; i < numInteiros.length ; i++) {
            if (numInteiros[i] > media) {
                System.out.println("Os números maiores que a média são: " + numInteiros[i]);
                contador++;
            }

        }
        System.out.println("Temos " + contador + " número(s) maior(es) que a média.");

        input.close();
    }
}
