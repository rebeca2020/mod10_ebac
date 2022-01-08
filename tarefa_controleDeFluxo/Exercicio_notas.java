//package br.com.exercicio;

//VALIDAR SE A MEDIA DE 4 NOTAS, SE FOR MAIOR OU IGUAL A 7; APROVADO
//VALIDAR SE A NOTA FOR IGUAL OU MAIR QUE 5; RECUPERA��O
//SE FOR MENOR QUE 5 - REPROVADO.

import java.util.Scanner;

public class Exercicio_notas {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n1, n2, n3, n4;
		int media = 0;
		

		for (int i = 0; i <= 10; i++) {

			// recebe a 1� nota
			System.out.println("Digite sua 1� nota");
			n1 = s.nextInt();

			// recebe a 2� nota
			System.out.println("Digite sua 2� nota");
			n2 = s.nextInt();

			// recebe a 3� nota
			System.out.println("Digite sua 3� nota");
			n3 = s.nextInt();

			System.out.println("Digite sua 4� nota");
			n4 = s.nextInt();

			
			// calcula a m�dia
			media = (n1 + n2 + n3 + n4) / 4;
			System.out.println("A m�dia do aluno  � " + media);

			
			
			if (media < 5) {
				System.out.println("REPROVADO ");

			} else if (media >= 5 && media < 7) {
				System.out.println("RECUPERA��O");
			
			} else if (media >= 7) {
				System.out.println("APROVADO ");
			}

		}

	}

}