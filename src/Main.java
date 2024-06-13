public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Vingadores");

        int anoDeLancamento = 2020;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        double media = (9.8 + 6.3) / 2;
        int classificacao = (int) (media / 2);
        String sinopse = """ 
                   Filme Vingadores
                   Filme de ação e aventura
                   Muito bom!
                   Ano de lançamento 
                """ + anoDeLancamento;
        System.out.println("Sinopse: " + sinopse);
        System.out.println("Classsificação: " + classificacao);
    }
}

