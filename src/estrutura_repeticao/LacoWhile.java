package estrutura_repeticao;

import java.util.Scanner;

public class LacoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Digite um nome: (Caso deseje sair, Digite 'x') ");
            String nome = input.nextLine();
            System.out.println("Digite outro nome: (Caso deseje sair, Digite 'x')");
            String nome2 = input.nextLine();
            if (nome.equals("x")){
                break;
            }
            else if (nome2.equals("x")){
                break;
            }

        }
            System.out.println("O programa foi encerrado");

    }
}
