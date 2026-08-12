package arrays.pesquisa_binaria;
import java.util.Scanner;


public class ValidadorDeIngressoVip {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int[] ingressoVip = {1018,2030,3070,4060,5018,6059,7010,8100,9200,10800,};

        System.out.println("Informe qual o número do seu ingresso: ");
        int ingressoConvite = input.nextInt();

        boolean ingressoExistente = false;

        int inicio = 0;
        int fim = ingressoVip.length - 1;
        int meio = -1;

        while (inicio <= fim) {

             meio = (inicio + fim) / 2;

            if (ingressoConvite == ingressoVip[meio]) {
                System.out.println("Acesso liberado! Ingresso vip verificado na posição " + meio);
                ingressoExistente = true;
                break;

            } else if (ingressoConvite > ingressoVip[meio]) {
                inicio = meio + 1;

            } else {
                fim = meio - 1;
            }
        }

        if (ingressoExistente) {
            System.out.println("Acesso liberado! Encontrado no índice " + meio);
        } else {
            System.out.println("Acessoo negado! Índice não encontrado.");
        }

      input.close();
    }
}
