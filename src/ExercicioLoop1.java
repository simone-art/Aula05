import java.util.Scanner;

public class ExercicioLoop1 {

	public static void main(String[] args) {
		// Fa�a um programa que receba 100 valores digitados pelo usu�rio e,
		// ao final, informe qual � a soma deles.

		Scanner leitor = new Scanner(System.in);
		int numeros;
		int quantidadeNumerosDigitados = 0;
		double soma = 0;

		while (quantidadeNumerosDigitados < 5) {
			quantidadeNumerosDigitados++;
			System.out.println("Por favor, digite o n�mero " + quantidadeNumerosDigitados + ": ");
			numeros = leitor.nextInt();
			soma = numeros + numeros +numeros + numeros + numeros;
		}
		System.out.println("A soma dos n�meros �: " + soma);
		leitor.close();
	}
}

