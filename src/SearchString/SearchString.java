package SearchString;

import java.util.Scanner;

public class SearchString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Solicita o comprimento da cadeia de caracteres
		int length;
		while (true) {
			System.out.print("Digite um inteiro positivo entre 1 e 20: ");
			length = scanner.nextInt();
			if (length >= 1 && length <= 20) {
				break;
			} else {
				System.out.println("Número inválido. Por favor, digite um número entre 1 e 20.");
			}
		}

		// Solicita a cadeia de caracteres com o comprimento especificado
		String str;
		while (true) {
			System.out.print("Digite uma cadeia de caracteres de comprimento " + length + ": ");
			str = scanner.next();
			if (str.length() == length) {
				break;
			} else {
				System.out.println("Cadeia inválida. Por favor, digite uma cadeia de comprimento " + length + ".");
			}
		}

		// Solicita caracteres para procurar na cadeia
		while (true) {
			System.out.print("Digite um caractere para procurar na cadeia (ou 'sair' para encerrar): ");
			String input = scanner.next();
			if (input.equalsIgnoreCase("sair")) {
				break;
			}
			char ch = input.charAt(0);
			int index = str.indexOf(ch);
			if (index != -1) {
				System.out.println("O caractere '" + ch + "' foi encontrado na posição " + index + ".");
			} else {
				System.out.println("O caractere '" + ch + "' não foi encontrado na cadeia.");
			}
		}

		scanner.close();
	}
}