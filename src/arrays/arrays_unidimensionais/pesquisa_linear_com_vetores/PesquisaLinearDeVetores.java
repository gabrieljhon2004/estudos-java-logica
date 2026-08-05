package arrays.arrays_unidimensionais.pesquisa_linear_com_vetores;

public class PesquisaLinearDeVetores {
    public static void main (String[] args){

        int[] vetores = {6,2,14,28,5,16};
        int numMaior = vetores[0];
        int indice = 0;

        for (int i = 0; i < vetores.length; i++) {
            if (vetores[i] > numMaior) {
                numMaior = vetores[i] ;
                indice = i;
            }
        }
        System.out.println("O numero maior é " + numMaior +" indice " + indice);
    }
}
