import java.util.Scanner;

public class ExercicioLoop2 {

	public static void main(String[] args) {

		// Faça um programa que receba 100 valores digitados pelo usuário e, ao final,
		// informe qual é o maior deles.

		// Para fazer este programa é melhor usar o while ao invés do for

		double numeros;
		double numeroMaior; 
		int contador = 2;
		Scanner leitor = new Scanner(System.in);

		System.out.print("Numero 1: ");
		numeros = leitor.nextDouble();
		numeroMaior = numeros;

		while (contador <= 10) {
			System.out.print("Numero " + contador + ": ");
			numeros = leitor.nextDouble();

			if (numeros > numeroMaior) {
				numeroMaior = numeros;
			}

			contador++;
		}

		System.out.println("O maior numero digitado é: " + numeroMaior);

	}
}
