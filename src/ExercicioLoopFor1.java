import java.util.Scanner;

public class ExercicioLoopFor1 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int quantidadeNumerosDigitados = 0;
		double soma = 0;
		
		for(int i = 0; i<100; i++) {
			System.out.print("Por favor, digite o n�mero " + quantidadeNumerosDigitados + ": ");
			quantidadeNumerosDigitados = leitor.nextInt();
			soma = soma + quantidadeNumerosDigitados;
		}
		System.out.println("A soma dos n�meros �: " + soma);
		leitor.close();
	}

}
