package repeticao;

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);	
		int n1, n2, result = 1;
		
		System.out.print("Informe o primeiro numero: ");
		n1 = sc.nextInt();
		System.out.print("Informe o segundo numero: ");
		n2 = sc.nextInt();
		
		for (int i = 0; i < n2; i++) {
			result = result * n1;
		}
		System.out.println(n1 + " elevado a " + n2 + " = " + result);
	sc.close();	
	}

}
