package repeticao;

import java.util.Scanner;

public class Exercicio_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double nota;
		double maiorN = Integer.MIN_VALUE;
        double menorN = Integer.MAX_VALUE;
        
		for(int i = 1; i < 6; i++) {
			System.out.printf("%dº aluno informe sua nota: ", i);
			nota = sc.nextDouble();
			
			if(nota > maiorN) {
				maiorN = nota;
			}
			if(nota < menorN) {
				menorN = nota;
			}
		}
		
		System.out.print("A maior nota foi: " + maiorN + " e a menor nota foi: " + menorN);
		
		
	sc.close();	
	}

}
