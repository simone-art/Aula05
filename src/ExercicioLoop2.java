import java.util.Scanner;

public class ExercicioLoop2 {

	public static void main(String[] args) {

		// Fa�a um programa que receba 100 valores digitados pelo usu�rio e, ao final,
		// informe qual � o maior deles.
		
		//Para fazer este programa � necess�rio usar arrays com o for

		int[] numeros = new int[2];
		Scanner leitor = new Scanner(System.in);
		int numerosDigitadosPeloUsuario = 0;

		for (int i = 0; i < numeros.length; i++) {
			numerosDigitadosPeloUsuario++;
			System.out.println("Por favor, digite um n�mero " + numerosDigitadosPeloUsuario + ": ");
			numeros[i] = leitor.nextInt();
			}
		if (numeros[0] > numeros[1]) {
			System.out.println("o n�mero maior �: " + numeros[0]);
		}else {
			System.out.println("o n�mero maior �: " + numeros[1]);
		}
		leitor.close();
	}
}




