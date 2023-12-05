public class Main {
    public static void main(String[] args) {
       int ano =  2023;
        System.out.println("Ano de lancamento: " + ano);

        double media = (8.2 + 5 + 10) / 3;
        System.out.println(media);

        String sinopse;
        sinopse = """
                Filmes
                Livros
                Novelas
                """ + ano;
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) media/2;
        System.out.println(classificacao);
 }
}