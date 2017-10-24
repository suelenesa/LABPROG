package lab01;
import java.util.Scanner; //importa a classe Scanner para obter dados a partir da janela de comando
/**
 *
 * @author suele
 */
public class Lab01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Digite três números:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int menor;
        int maior;

        maior = Math.max(b, Math.max(c, a));
        menor = Math.min(b, Math.min(c, a));

        System.out.println("Maior Numero: " +maior + " Menor Numero: " +menor);
    }
}