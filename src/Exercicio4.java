//import java.util.Scanner;
//
//public class Exercicio4 {
//
//	public static void main(String[] args) {
//		// Um professor quer saber quantos alunos de uma sala de 50 tiveram nota maior
//		// do que a m�dia. Fa�a um programa onde o professor informe a m�dia e as notas
//		// de cada um dos 50 alunos e, ao final, seja exibido quantos alunos tiveram nota
//		// superior � m�dia e quantos tiveram outra inferior � m�dia
//
//		Scanner scanner = new Scanner(System.in);
//		int[] notasAlunos = new int[4];
//		int notasDigitadasPeloProfessor = 0;
//		double media;
//
//		for (int i = 0; i < notasAlunos.length; i++) {
//			notasDigitadasPeloProfessor++;
//
//			System.out.println("Informe a nota do Aluno " + notasDigitadasPeloProfessor + ": ");
//			notasAlunos[i] = scanner.nextInt();
//			
//		}
//
//		Scanner scanner1 = new Scanner(System.in);
//		System.out.println("Informe a m�dia das notas: ");
//		media = scanner1.nextDouble();
//		System.out.println("A media das notas �: " + media);
//
//		if (notasAlunos[0] > media || (notasAlunos[1] > media || (notasAlunos[2] > media ||(notasAlunos[3] > media ||(notasAlunos[] > media) {
//			System.out.println("O aluno 1 tem uma nota superior a m�dia");
//		} else if(notasAlunos[1] > media){
//			System.out.println("O aluno 2 tem uma nota por baixo da m�dia");
//		}else if(notasAlunos[2] > media){
//			System.out.println("O aluno 3 tem uma nota por baixo da m�dia");
//	}else if(notasAlunos[3] > media){
//		System.out.println("O aluno 4 tem uma nota por baixo da m�dia");
//}
