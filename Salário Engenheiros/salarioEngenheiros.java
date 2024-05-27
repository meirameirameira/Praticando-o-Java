import java.util.Scanner;

public class salarioEngenheiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//Solicitacao do salario
        System.out.print("Digite o salário: ");
                float salario = scanner.nextFloat();

//Calculo imposto
                double imposto = (salario * 0.15);
                    System.out.println("15% de impostos: R$"+ imposto);

//Calculo gratificacao
                double grati = (salario * 0.05);
                    System.out.println("5% de gratificação: R$"+ grati);

//Calculo novo salario
                double novoSalario = (salario - imposto + grati);
                    System.out.println("Seu novo salário é: R$"+ novoSalario);

                scanner.close();
    }
}
//Fim