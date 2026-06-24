package estrutura_condicional;

public class SomaDeIntervalo {
    public static void main(String[] args) {

        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma = soma + i;
        }
        System.out.println("O valor da soma dos números de 1 a 100 é : " +soma);

    }
}
