import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1){
            System.out.println("Qual é a sua nota para esse filme? Para encerrar digite -1 ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;

            totalDeNotas = nota != -1 ? totalDeNotas + 1 : totalDeNotas;
        }

        System.out.println("A media é: " + mediaAvaliacao/totalDeNotas);
    }
}
