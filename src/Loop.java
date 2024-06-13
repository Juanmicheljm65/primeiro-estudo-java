import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double notaDoFilme = 0;
        double media = 0;
        for(int i = 0; i < 3; i++) {
            System.out.println("Dê sua nota para o filme: ");
            notaDoFilme = leitura.nextDouble();
            media += notaDoFilme;
        }
        System.out.println("A média da nota desse filme é: " + media/3);
    }
}
