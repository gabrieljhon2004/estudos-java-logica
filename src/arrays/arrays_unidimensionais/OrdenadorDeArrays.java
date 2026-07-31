package arrays.arrays_unidimensionais;
import java.util.Arrays;

public class OrdenadorDeArrays {
    public static void main(String[] args) {
     int[] temperaturas = {30,18,25,12,22,92,39,40,1,2,3,4,777,21314,3};

        for (int i = 0; i < temperaturas.length ; i++) {
            for (int j = 0; j < temperaturas.length -1 ; j++) {
                if (temperaturas[j] > temperaturas [j + 1]) {

                    int aux = temperaturas[j];
                    temperaturas[j] = temperaturas [j + 1];
                    temperaturas [j + 1] = aux;

                }
            }
        }
        System.out.println(Arrays.toString(temperaturas));
    }
}
