import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// Um professor quer saber quantos alunos de uma sala de 50 tiveram nota maior
		// do que a média. Faça um programa onde o professor informe a média e as notas
		// de cada um dos 50 alunos e, ao final, seja exibido quantos alunos tiveram
		// nota
		// superior à média e quantos tiveram outra inferior à média

		Scanner leitor = new Scanner(System.in);
		double media;
		int i = 0;
		double nota;
		int maiores = 0, menores = 0;
		System.out.println("Por favor, informe a média da turma");
		media = leitor.nextDouble();
		while (i < 5) {
			System.out.println("Informe a nota do aluno");
			nota = leitor.nextDouble();
			i = i + 1;
			if (nota >= media) {
				System.out.println("A nota informada está acima da média da turma");
				maiores = maiores + 1;
			} else {
				System.out.println("A nota informada está abaixo da média da turma");
				menores = menores + 1;
			}
		}
		System.out.println("Para a turma informada, existem " + maiores + " notas acima da média");
		System.out.println("Para a turma informada, existem " + menores + " notas abaixo da média");
		leitor.close();
	}
}
