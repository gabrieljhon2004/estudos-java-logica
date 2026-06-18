package operacoes_basicas;

import java.util.Scanner;

public class CalculadoraSimples {
    public CalculadoraSimples() {
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("digite qualquer número decimal: ");

        double n1 = input.nextDouble();
        System.out.println("Agora digite outro número decimal: ");

        double n2 = input.nextDouble();
        System.out.println("Escolha um operador matemático");

        switch (input.next()) {
            case "+" -> System.out.println("O resultado é: " + (n1 + n2));
            case "-" -> System.out.println("O resultado é: " + (n1 - n2));
            case "*" -> System.out.println("O resultado é: " + n1 * n2);
            case "/" -> System.out.println("O resultado é: " + n1 / n2);
            default -> System.out.println("Digite um operador valido (+, -, *, /)");
        }

        input.close();
    }
}
