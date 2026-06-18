package estrutura_repeticao.contador_de_votos;

public class ContadordeVotos {
    public static void main(String[] args) {

        int votoSim = 0;
        int totalVotos = 0;

        String resposta = "SIM";

        while(resposta.equals("SIM")) {

            votoSim++;
            totalVotos++;
            System.out.println("Votos Sim: " + votoSim + " | Total votos: " + totalVotos);

            resposta = "NAO";

        }

        System.out.println("Total votos: " + totalVotos);
    }
}
