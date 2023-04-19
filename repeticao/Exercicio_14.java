package repeticao;

import java.util.Scanner;

public class Exercicio_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	
		double peso;
		int contM = 0, contF = 0;
		char sexo;
		
		for (int i = 1; i < 10; i++) {
			System.out.printf("Informe o %dº  sexo(somente F ou M): ", i);
			sexo = sc.next(".").charAt(0); 
			System.out.printf("Informe o %dº peso em KG: ", i);
			peso = sc.nextDouble();
			
			if(sexo == 'M'&(peso >= 60 & peso <= 80)) {
				contM++;
				System.out.println("Sexo e peso Masculino recebido");
			}
			if(sexo == 'F'&(peso >= 50 & peso <= 70)) {
				contF++;
				System.out.println("Sexo e peso Feminino recebido");
			}
		}
		
		System.out.printf("Do sexo Masculino entre 60KG e 80KG, foram encontradas " + contM + " pessoas. \n"
				+ "Do sexo Feminino entre 50KG e 70KG, foram encontradas " + contF + " pessoas.");	
		
	sc.close();
	}

}
