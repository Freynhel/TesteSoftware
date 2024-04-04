package CalculadoraTeste;
import java.util.Scanner;
import java.util.Locale;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que escolha a operação desejada
        System.out.println("Escolha a operação desejada:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Digite o número da operação: ");
        int escolha = scanner.nextInt();

        // Solicita os números necessários para a operação
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Executa a operação escolhida e exibe o resultado
        switch (escolha) {
            case 1:
                System.out.println("Resultado: " + Soma.executarSoma(num1, num2));
                break; // sai do switch
            case 2:
                System.out.println("Resultado: " + Subtracao.executarSubtracao(num1, num2));
                break;
            case 3:
                System.out.println("Resultado: " + Multiplicacao.executarMultiplicacao(num1, num2));
                break;
            case 4:
                try {
                    System.out.println("Resultado: " + Divisao.executarDivisao(num1, num2));
                } catch (ArithmeticException e) {
                    /* captura exceção do tipo ArithmeticException e imprime uma mensagem de erro no console */
                    System.out.println("Erro: " + e.getMessage());
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }
        scanner.close();
    }
}
