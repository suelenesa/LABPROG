package lab3;

import java.util.Scanner;

public class JogoDaVelhaModularizado {

    static char tabuleiro[][] = new char[3][3];
    static char jogadores[] = new char[]{'X', 'O'};
    static int jogada = 0;

    static void inicializaTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    static void imprimirTabuleiro() {

        System.out.print("JOGO DA VELHA \n");
        for (int i = 0; i < 3; i++) {
            System.out.print(tabuleiro[i][0] + "|" + tabuleiro[i][1] + "|" + tabuleiro[i][2]);
            if (i < 3 - 1) {
                System.out.print("\n------\n");
            }
        }

    }

    static void entrada() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nINSIRA AS COORDENADAS");
        if ((jogada % 2) == 1) {
            System.out.print("PLAYER 2\nLINHA: ");
        } else {
            System.out.print("PLAYER 1\nLINHA: ");
        }

        int i = sc.nextInt();
        System.out.print("COLUNA: ");
        int j = sc.nextInt();
        if (tabuleiro[i - 1][j - 1] == ' ') {
            int vez = jogada % 2;
            tabuleiro[i - 1][j - 1] = jogadores[vez];
        }
    }

    static boolean verificaVencedor(char jogador) {
        return ((tabuleiro[0][0] == jogador && tabuleiro[0][1] == jogador && tabuleiro[0][2] == jogador)
                || (tabuleiro[1][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[1][2] == jogador)
                || (tabuleiro[2][0] == jogador && tabuleiro[2][1] == jogador && tabuleiro[2][2] == jogador)
                || (tabuleiro[0][0] == jogador && tabuleiro[1][0] == jogador && tabuleiro[2][0] == jogador)
                || (tabuleiro[0][1] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][1] == jogador)
                || (tabuleiro[0][2] == jogador && tabuleiro[1][2] == jogador && tabuleiro[2][2] == jogador)
                || (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador)
                || (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador));
    }

    public static void main(String args[]) {

        inicializaTabuleiro();
        imprimirTabuleiro();
        while (jogada <= 9) {

            entrada();
            int vez = jogada % 2;
            if (jogada >= 4) {
                boolean ver = verificaVencedor(jogadores[vez]);
                if (ver) {
                    imprimirTabuleiro();
                    String vencedor = vez == 0 ? "PLAYER 1" : "PLAYER 2";
                    System.out.printf("VENCEDOR: %s\n", vencedor);
                                        break;
                }
                
              if (jogada==9)
	        {
	            imprimirTabuleiro();	
                    System.out.print("\nPARTIDA EMPATADA!");
                    break;
	        }

            }

            imprimirTabuleiro();
            jogada++;

        }
        
        System.out.println("\nFIM DE PARTIDA!");
                
    }
}
