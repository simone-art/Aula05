import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// Um professor quer saber quantos alunos de uma sala de 50 tiveram nota maior
		// do que a m�dia. Fa�a um programa onde o professor informe a m�dia e as notas
		// de cada um dos 50 alunos e, ao final, seja exibido quantos alunos tiveram
		// nota
		// superior � m�dia e quantos tiveram outra inferior � m�dia

		Scanner leitor = new Scanner(System.in);
		double media;
		int i = 0;
		double nota;
		int maiores = 0, menores = 0;
		System.out.println("Por favor, informe a m�dia da turma");
		media = leitor.nextDouble();
		while (i < 5) {
			System.out.println("Informe a nota do aluno");
			nota = leitor.nextDouble();
			i = i + 1;
			if (nota >= media) {
				System.out.println("A nota informada est� acima da m�dia da turma");
				maiores = maiores + 1;
			} else {
				System.out.println("A nota informada est� abaixo da m�dia da turma");
				menores = menores + 1;
			}
		}
		System.out.println("Para a turma informada, existem " + maiores + " notas acima da m�dia");
		System.out.println("Para a turma informada, existem " + menores + " notas abaixo da m�dia");
		leitor.close();
	}
}
