import java.util.Scanner;

public class vetores {

	public static void main(String[] args) {
		
		Scanner N = new Scanner (System.in); 
		System.out.print("Digite quantos alunos tem na sala: ");
		int numAlunos = N.nextInt();
		
		
		double[] NotasAlunos = new double [numAlunos];
		
		for(int i = 0; i < numAlunos; i++){
			System.out.print("Digite a nota do " +(i+1)+ "º aluno");
			NotasAlunos[i] = N.nextDouble();
	}

		for(int i = 0; i < numAlunos; i++){
			 System.out.println("Essa é a nota do " + (i + 1) + "º aluno: " + NotasAlunos[i]);
		}
		N.close();
	}
}
	
