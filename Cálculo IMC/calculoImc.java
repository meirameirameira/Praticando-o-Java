import java.util.Scanner;

public class calculoImc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar e armazenar o peso do usuário em quilogramas
        System.out.print("Digite o peso em quilogramas: ");
        double peso = scanner.nextDouble();
        
        // Solicitar e armazenar a altura do usuário em metros
        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble();
        
        // Calcular o IMC
        double imc = calcularIMC(peso, altura);
        
        // Exibir o IMC
        System.out.printf("O IMC é: %.2f\n", imc);
        
        // Determinar a classificação do IMC
        String classificacao = getClassificacaoIMC(imc);
        
        // Exibir a classificação
        System.out.println("Classificação: " + classificacao);
        
        scanner.close();
    }
    
    // Método para calcular o IMC
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
    
    // Método para obter a classificação do IMC
    public static String getClassificacaoIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 25) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 30) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc < 35) {
            return "Obesidade Grau I";
        } else if (imc >= 35 && imc < 40) {
            return "Obesidade Grau II (severa)";
        } else {
            return "Obesidade Grau III (mórbida)";
        }
    }
}