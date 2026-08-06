package arrays.arrays_unidimensionais.pesquisa_linear_com_vetores;

public class PesquisaDeNumerosPares {
    public static void main (String[] args) {

        int[] numVetores = {3,4,5,7,12,20,19,14,32};
        int contadorPares = 0;

        for (int i = 0; i < numVetores.length; i++) {
            if (numVetores[i] %2==0) {
                System.out.println(numVetores[i]);
                contadorPares++;
            }

        }
        System.out.println("Existem " +contadorPares + " números pares");
    }
}
