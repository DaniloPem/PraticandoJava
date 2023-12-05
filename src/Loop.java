import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota;

        for (int i = 0; i < 3; i++) {
            System.out.println("Qual é a sua nota para esse filme? ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("A media é: " + mediaAvaliacao/3);
    }
}
