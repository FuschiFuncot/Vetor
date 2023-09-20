
import java.util.Scanner;


public class Médias {

	public static void main(String[] args) {
		
		Scanner A = new Scanner(System.in);
		
		System.out.print("Digite o nome do aluno: ");
		String nome = A.nextLine();
		
		System.out.print("Quantos matéria ele tem: ");
		int numMaterias = A.nextInt();
		
		double [] notasAluno = new double[numMaterias];
		double somaNotas = 0.0; //variavel para guardar as somas das notas
			
		for(int i = 0; i < numMaterias; i++) {
			System.out.print("Digite as notas dele: " +(i+1)+ ":");
			notasAluno[i] = A.nextDouble();
			somaNotas += notasAluno[i]; //adiciona a nota a soma
		}
		
		double media = somaNotas / numMaterias; 
		System.out.println("Médias das notas: " + media);
	
	}
}


