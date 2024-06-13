import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Adivinhe {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int tentativas = 0;
        int numeroDigitado = 0;
        System.out.println("Tente adivinhar um número entre 0 e 100, você tem 5 tentativas. Digite o número desejado entre 0 e 100: ");

        for(int i = 0; i < 6; i++) {
            numeroDigitado = scanner.nextInt();
            tentativas++;
            if(numeroDigitado == numeroAleatorio) {
                System.out.println(String.format("Você acertou. O número era: " + numeroDigitado));
                break;
            }
            else if( tentativas < 5) {
                System.out.println(String.format("Você ainda tem %d tentativas. Digite um número: ", (5 - tentativas)));
            } else {
                System.out.println("Suas tentativas acabaram, o número era: " + numeroAleatorio);
                break;
            }
        }
    }
}
