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

    public static class CalculadoraSimples {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

           System.out.println("digite qualquer número decimal: ");
           double n1 = input.nextDouble();


           System.out.println("Agora digite outro número decimal: ");
           double n2 = input.nextDouble();

            System.out.println("Escolha um operador matemático");
            String operador = input.next();

           switch (operador) {
               case "+":
                   System.out.println("O resultado é: " + (n1 + n2));
                   break;
               case "-":
                   System.out.println("O resultado é: " + (n1 - n2));
                   break;
               case "*":
                   System.out.println("O resultado é: " + (n1 * n2));
                   break;
                   case "/":
                   System.out.println("O resultado é: " + (n1 / n2));
                   break;

               default: System.out.println("Digite um operador valido (+, -, *, /)");

           }
            input.close();
        }
    }
}
