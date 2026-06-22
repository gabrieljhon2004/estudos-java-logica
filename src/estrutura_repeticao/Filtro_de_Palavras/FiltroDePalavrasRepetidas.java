package estrutura_repeticao.Filtro_de_Palavras;

public class FiltroDePalavrasRepetidas {
    public static void main(String[] args) {

        String palavraChave = "Java";
        String p1 = "Python";
        String p2 = "Java";
        String p3 = "C#";

        int repeticoes = 0;

        for (int i = 1; i <= 3; i++) {
            if ( i == 1 && palavraChave.equals(p1)){
                repeticoes++;
            }
            else if (i == 2 && palavraChave.equals(p2)){
                repeticoes++;
            }
            else if (i == 3 && palavraChave.equals(p3)){
                repeticoes++;
            }
        }

        System.out.println("O número de vezes que apareceu a palavra chave foi " + repeticoes);

    }

}

