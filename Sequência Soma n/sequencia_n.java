import java.util.Scanner;

public class sequencia_n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        while (true) {
            System.out.print("Digite um número inteiro e positivo: ");

            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("O número não é positivo. Tente novamente.");
                }
            } else {
                System.out.println("O número não é um número inteiro. Tente novamente.");
                scanner.next();
            }
        }

        double soma = 0.0;

        for (int i = 1; i <= n; i++) {
            soma += 1.0 / i;
        }

        System.out.println("A soma da sequência é: " + soma);

        scanner.close();
    }
}
