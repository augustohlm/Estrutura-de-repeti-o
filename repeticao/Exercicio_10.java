package repeticao;
import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int valor, fatorial;
		
		System.out.print("Informe um valor para ser fatorado: ");
		valor = sc.nextInt();
		
		fatorial = valor;
		
		for (int i = valor; i > 1; i--) {
			fatorial = fatorial * (i-1);
			System.out.println(fatorial);
		}
		
		
	sc.close();	
	}

}
