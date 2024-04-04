package CalculadoraTeste;

public class Divisao {
	public static double executarDivisao(double num1, double num2) {
		if (num2 == 0) {
			throw new ArithmeticException("Não é possível dividir por zero.");
			// retorna a mensagem associada à exceção ArithmeticException. No entanto, se a exceção não
			//fornecer uma mensagem específica, o método getMessage() retornará null.
		}
		return num1 / num2;
	}
}