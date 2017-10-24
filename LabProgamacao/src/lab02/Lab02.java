package lab02;

/**
 * Aluna: Suelene Sa
 *
 */
import java.util.Scanner;
import java.util.Random;

public class Lab02 {

    public static void main(String[] args) {
        Scanner aluno = new Scanner(System.in);
        int i = 0;
        do {
            System.out.print(" Pedra (1), Papel (2), Tesoura (3)? ");
            i = aluno.nextInt();
        } while (i <= 0 || i > 3);
        System.out.println("Aluno:" + i);
        final int n = 3;
        int res;

        Random computador = new Random();
        int j = computador.nextInt(3) + 1;

        res = ((n + i - j) % n);
        System.out.println("Computador:" + j);

        if (res > 0 && res < n / 2 || res == n / 2) {
            System.out.println("Aluno ganhou!");

        } else {
            if (res > n / 2) {
                System.out.println("Computador ganhou!");
            } else {
                if (res == 0) {
                    System.out.println("Houve empate!");
                }
            }
        }
    }
}