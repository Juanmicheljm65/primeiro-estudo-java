import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double notaDoFilme = 0;
        double media = 0;
        int totalDeNotas = 0;

        while (notaDoFilme != -1) {
            System.out.println("Dê sua nota para o filme ou digite -1 para encerrar");
            notaDoFilme = leitura.nextDouble();

            if(notaDoFilme != -1) {
                media += notaDoFilme;
                totalDeNotas++;
            }
        }
        System.out.println("A média da nota desse filme é: " + media/totalDeNotas);
    }
}
