import java.util.Random;
import java.util.Scanner;

public class JogadorXMaquina {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int jogador1 = 0;

        int jogador2 = 0;

        int fosforos = 21;

        while(true){

            System.out.println("Jogador 1 - Informe o número que se deseja jogar(1, 2, 3 ou 4)");
            jogador1 = in.nextInt();

            while (jogador1 < 1 || jogador1 > 4){
                System.out.println("Número inválido! Informe o número que se deseja jogar(1, 2, 3 ou 4)");
                jogador1 = in.nextInt();
            }
            System.out.println("JOGADOR 1 escolheu Nº: " + jogador1);
            fosforos -= jogador1;
            System.out.println("Placar => " + fosforos);
            System.out.println("===================================================================");

            if(fosforos <=1 ){
                System.out.println("Jogador 2 Perdeu!!!");
                System.out.println("===================================================================");
                break;
            }

            jogador2 = new Random().nextInt(4)+1;
            System.out.println("Jogador 2, escolheu: " + jogador2);

            fosforos -= jogador2;
            System.out.println("Placar => " + fosforos);
            System.out.println("===================================================================");

            if(fosforos <=1 ) {
                System.out.println("Jogador 1 Perdeu!!!");
                System.out.println("===================================================================");
                break;
            }

        }
    }
}


