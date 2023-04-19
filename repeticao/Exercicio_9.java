package repeticao;
import java.util.Scanner;

public class Exercicio_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		int maiorN = Integer.MIN_VALUE;
        int menorN = Integer.MAX_VALUE;
		
		for (int i = 0; i < 3; i++) {
			System.out.print("\n Informe o " + i + "º numero: ");
			n = sc.nextInt();
			
			if(n > maiorN) {
				maiorN = n;
			}
			if(n < menorN) {
				menorN = n;
			}	
		}
		System.out.print("O maior numero digitado foi: " + maiorN + " e o menor numero digitado foi: " + menorN);
	sc.close();
	}

}
