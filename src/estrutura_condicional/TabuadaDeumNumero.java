package estrutura_condicional;

public class TabuadaDeumNumero {
    public static void main(String[] args) {

        System.out.println("Tabuado de multiplicação do 10");

        int tabuadaDeumNumero=10;

        for (int i = 0; i <= 10; i++) {
            int resultado=tabuadaDeumNumero*i;
            System.out.println(i + " x " + tabuadaDeumNumero + " = " + resultado );

        }
    }
}
