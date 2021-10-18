import java.util.Scanner;

public class ExercicioLoop1 {

	public static void main(String[] args) {
		// Faça um programa que receba 100 valores digitados pelo usuário e,
		// ao final, informe qual é a soma deles.

		Scanner leitor = new Scanner(System.in);
		int numeros;
		int quantidadeNumerosDigitados = 0;
		double soma = 0;

		while (quantidadeNumerosDigitados < 5) {
			quantidadeNumerosDigitados++;
			System.out.println("Por favor, digite o número " + quantidadeNumerosDigitados + ": ");
			numeros = leitor.nextInt();
			soma = numeros + numeros +numeros + numeros + numeros;
		}
		System.out.println("A soma dos números é: " + soma);
		leitor.close();
	}
}

