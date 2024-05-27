
import java.util.Scanner;

public class sequencia_0_3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//Declaracao de variaveis
        int valor = 0;

//Solicitacao do limite da sequencia
        System.out.println("Digite o número limite da sequência: ");
        int XF = scanner.nextInt();

//Visualizacao da sequencia
        System.out.println("Sua sequência numérica é:");

//Calculo da sequencia
        for (int i = 0; i < XF; i++){
            System.out.print(valor + " ");
                    valor += 3;
        }

        scanner.close();
    }
}
//Fim