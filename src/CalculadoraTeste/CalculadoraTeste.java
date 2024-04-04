package CalculadoraTeste;

public class CalculadoraTeste {
	public static void main(String[] args) {

		System.out.println("Testes de Soma");
		testSomaValoresPositivos();
		testSomaValoresNegativos();
		testSomaValorZero();
		testSomaOverflow();

		System.out.println("\nTestes de Subtração");
		testSubtracaoValoresPositivos();
		testSubtracaoValoresNegativos();
		testSubtracaoValorZero();
		testSubtracaoOverflow();

		System.out.println("\nTestes de Multiplicação");
		testMultiplicacaoValoresPositivos();
		testMultiplicacaoValoresNegativos();
		testMultiplicacaoValorZero();
		testMultiplicacaoOverflow();

		System.out.println("\nTestes de Divisão");
		testDivisaoDivisaoExata();
		testDivisaoDivisaoComResto();
		testDivisaoDivisaoPorZero();
		testDivisaoOverflow();
	}

	/* ----------------------------------------------------------------------------------------------- */
	/* Testes de Soma
	/* ----------------------------------------------------------------------------------------------- */

	public static void testSomaValoresPositivos() {
		double resultado = Soma.executarSoma(3, 5);
		System.out.println("Teste de Soma de valores positivos: " + (resultado == 8 ? "Passou" : "Falhou"));
	}

	public static void testSomaValoresNegativos() {
		double resultado = Soma.executarSoma(-3, -5);
		System.out.println("Teste de Soma de valores negativos: " + (resultado == -8 ? "Passou" : "Falhou"));
	}

	public static void testSomaValorZero() {
		double resultado1 = Soma.executarSoma(0, 7);
		double resultado2 = Soma.executarSoma(7, 0);
		System.out.println("Teste de Soma com valor zero: " + ((resultado1 == 7 && resultado2 == 7) ? "Passou" : "Falhou"));
	}

	public static void testSomaOverflow() {
		double resultado = Soma.executarSoma(Double.MAX_VALUE, Double.MAX_VALUE);
		if (Double.isInfinite(resultado)) {
			System.out.println("Teste de Soma com overflow: Passou");
		} else {
			System.out.println("Teste de Soma com overflow: Falhou");
		}
	}

	/* ----------------------------------------------------------------------------------------------- */
	/* Testes de Subtração
	/* ----------------------------------------------------------------------------------------------- */

	public static void testSubtracaoValoresPositivos() {
		double resultado = Subtracao.executarSubtracao(5, 3);
		System.out.println("Teste de Subtração de valores positivos: " + (resultado == 2 ? "Passou" : "Falhou"));
	}

	public static void testSubtracaoValoresNegativos() {
		double resultado = Subtracao.executarSubtracao(-3, -5);
		System.out.println("Teste de Subtração de valores negativos: " + (resultado == 2 ? "Passou" : "Falhou"));
	}

	public static void testSubtracaoValorZero() {
		double resultado = Subtracao.executarSubtracao(7, 7);
		System.out.println("Teste de Subtração com valor zero: " + (resultado == 0 ? "Passou" : "Falhou"));
	}

	public static void testSubtracaoOverflow() {
		double resultado = Subtracao.executarSubtracao(-Double.MAX_VALUE, Double.MAX_VALUE);
		if (Double.isInfinite(resultado)) {
			System.out.println("Teste de Subtração com overflow: Passou");
		} else {
			System.out.println("Teste de Subtração com overflow: Falhou");
		}
	}

	/* ----------------------------------------------------------------------------------------------- */
	/* Testes de Multiplicação
	/* ----------------------------------------------------------------------------------------------- */

	public static void testMultiplicacaoValoresPositivos() {
		double resultado = Multiplicacao.executarMultiplicacao(3, 5);
		System.out.println("Teste de Multiplicação de valores positivos: " + (resultado == 15 ? "Passou" : "Falhou"));
	}

	public static void testMultiplicacaoValoresNegativos() {
		double resultado = Multiplicacao.executarMultiplicacao(-3, -5);
		System.out.println("Teste de Multiplicação de valores negativos: " + (resultado == 15 ? "Passou" : "Falhou"));
	}

	public static void testMultiplicacaoValorZero() {
		double resultado1 = Multiplicacao.executarMultiplicacao(0, 7);
		double resultado2 = Multiplicacao.executarMultiplicacao(7, 0);
		System.out.println("Teste de Multiplicação com valor zero: " + ((resultado1 == 0 && resultado2 == 0) ? "Passou" : "Falhou"));
	}

	public static void testMultiplicacaoOverflow() {
		double resultado = Multiplicacao.executarMultiplicacao(Double.MAX_VALUE, Double.MAX_VALUE);
		if (Double.isInfinite(resultado)) {
			System.out.println("Teste de Multiplicação com overflow: Passou");
		} else {
			System.out.println("Teste de Multiplicação com overflow: Falhou");
		}
	}
	/* ----------------------------------------------------------------------------------------------- */
	/* Testes de Divisão
	/* ----------------------------------------------------------------------------------------------- */

	public static void testDivisaoDivisaoExata() {
		double resultado = Divisao.executarDivisao(10, 2);
		System.out.println("Teste de Divisão com divisão exata: " + (resultado == 5 ? "Passou" : "Falhou"));
	}

	public static void testDivisaoDivisaoComResto() {
		double resultado = Divisao.executarDivisao(10, 3);
		System.out.println("Teste de Divisão com resto: " + (resultado == (double) 10 / 3 ? "Passou" : "Falhou"));
	}

	public static void testDivisaoDivisaoPorZero() {
		try {
			Divisao.executarDivisao(10, 0);
			System.out.println("Teste de Divisão por zero: Falhou");
		} catch (ArithmeticException e) {
			System.out.println("Teste de Divisão por zero: Passou");
		}
	}

	public static void testDivisaoOverflow() {
		double resultado = Divisao.executarDivisao(Double.MAX_VALUE, Double.MIN_VALUE);
		if (Double.isInfinite(resultado)) {
			System.out.println("Teste de Divisão com overflow: Passou");
		} else {
			System.out.println("Teste de Divisão com overflow: Falhou");
		}
	}


}
