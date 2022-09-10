import java.util.Scanner;

public class JogadorXJogador {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        int jogador1 = 0;

        int jogador2 = 0;

        int fosforos = 21;


        while (true) {


            System.out.println("Jogador 1- Informe o valor que deseja jogar (1, 2, 3 ou 4)");
            jogador1 = in.nextInt();


            while (jogador1 < 1 || jogador1 > 4) {
                System.out.println("Número inválido! Informe o valor que deseja jogar (1, 2, 3 ou 4)");
                jogador1 = in.nextInt();
            }


            System.out.println("JOGADOR 1 escolheu Nº: " + jogador1);
            fosforos -= jogador1;
            System.out.println("Placar => " + fosforos);
            System.out.println("===================================================================");

            if (fosforos <= 1) {
                System.out.println("Jogador 2 PERDEU!");
                break;
            }
            System.out.println("Jogador 2- Informe o valor que deseja jogar (1, 2, 3 ou 4)");
            jogador2 = in.nextInt();

            while (jogador2 < 1 || jogador2 > 4) {
                System.out.println("Número inválido! Informe o valor que deseja jogar (1, 2, 3 ou 4)");
                jogador2 = in.nextInt();
            }

            System.out.println("JOGADOR 2 escolheu Nº: " + jogador2);
            fosforos -= jogador2;
            System.out.println("Placar => " + fosforos);
            System.out.println("===================================================================");

            if (fosforos <= 1) {
                System.out.println("Jogador 1 PERDEU");
                break;
            }

        }

    }
}


