package estrutura_condicional.Menu_de_jogo;

import  java.util.Scanner;

public class MenuDeJogo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Digite JOGAR para iniciar o jogo");
        System.out.println("Digite CONFIGURACOES para ir ao menu de configurações");
        System.out.println("Digite SAIR para finalizar o jogo");
        System.out.println("------------------------");

        String opcaoMenu = input.nextLine(). toUpperCase();


        switch (opcaoMenu) {
            case "JOGAR": System.out.println("Carregando o mapa do jogo...");
            break;


            case "CONFIGURACOES": System.out.println("Abrindo painel de áudio e vídeo...");
            break;


            case "SAIR": System.out.println("Você saiu do jogo");
                break;

            default:  System.out.println("Opção invalida");

        }

        input.close();
    }
}
