import java.util.Scanner;

public class JogadorXIA {

    public static void main(String[] args) throws InterruptedException {

        int jogador1 = 0;
        int jogadorIa = 0;

        int fosforos = 21;
        Scanner in = new Scanner(System.in);



        while (true){

            System.out.println("JOGADOR 1 - Informe o número que deseja jogar (1, 2, 3 ou 4) ");
            jogador1 =  in.nextInt();


            while (jogador1 < 1 || jogador1 > 4){
                System.out.println("Número inválido! Informe o número que deseja jogar (1, 2, 3 ou 4) ");
                jogador1 = in.nextInt();
            }
            System.out.println("JOGADOR 1 escolheu Nº: " + jogador1);
            fosforos -= jogador1;
            System.out.println(" Placar => " + fosforos);
            System.out.println("=======================================================");

            if (fosforos <= 1 ){
                System.out.println("JOGADOR IA PERDEU!!");
                break;
            }


            Thread.sleep(1000);

            if(fosforos == 21){
                jogadorIa =2;
            }

            if (fosforos == 20) {
                jogadorIa = 4;
            }
            if (fosforos == 19) {
                jogadorIa = 3;
            }
            if (fosforos == 18) {
                jogadorIa = 2;
            }
            if (fosforos == 17) {
                jogadorIa = 1;
            }

            if (fosforos == 16) {
                jogadorIa = 1;
            }

            if(fosforos == 15){
                jogadorIa = 3;
            }

            if(fosforos == 14){
                jogadorIa = 3;
            }

            if(fosforos == 13){
                jogadorIa = 1;
            }

            if(fosforos == 12){
                jogadorIa = 1;
            }

            if(fosforos == 11){
                jogadorIa = 2;
            }

            if(fosforos == 10){
                jogadorIa = 4;
            }

            if(fosforos == 9){
                jogadorIa = 3;
            }

            if(fosforos == 8){
                jogadorIa = 2;
            }

            if(fosforos == 7){
                jogadorIa = 1;
            }

            if(fosforos == 6){
                jogadorIa = 1;
            }

            if(fosforos == 5){
                jogadorIa = 2;
            }

            if(fosforos == 4){
                jogadorIa = 1;
            }

            if(fosforos == 3){
                jogadorIa = 2;
            }

            if(fosforos == 2){
                jogadorIa = 1;
            }


            System.out.println("JOGADOR IA escolheu Nº: " + jogadorIa);

            fosforos -= jogadorIa;
            System.out.println("Placar => " + fosforos);
            System.out.println("=======================================================");

            if(fosforos <= 1){
                System.out.println(" JOGADOR 1 PERDEU!!");
                break;
            }


        }
    }

}
