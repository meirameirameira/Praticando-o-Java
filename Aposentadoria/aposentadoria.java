import java.util.Scanner;

public class aposentadoria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê a idade da pessoa
        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        // Solicita e lê o tempo de contribuição em anos
        System.out.print("Digite o tempo de contribuição em anos: ");
        int tempoContribuicao = scanner.nextInt();

        // Verifica se a pessoa atende aos critérios de aposentadoria integral
        if (idade >= 60 && tempoContribuicao >= 15) {
            System.out.println("A pessoa pode se aposentar com benefício integral.");
        } else {
            System.out.println("A pessoa ainda não pode se aposentar com benefício integral.");
        }

        scanner.close();
    }
}