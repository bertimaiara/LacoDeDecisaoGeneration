package exercicios030322;

import java.util.Scanner;

public class questao1 {
	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		int n1, n2, n3, maiorNumero = 0;

		System.out.println("Digite 3 n�meros: ");
		n1 = ler.nextInt();
		n2 = ler.nextInt();
		n3 = ler.nextInt();

		if (n1 > maiorNumero) {
			maiorNumero = n1;
		} 
		if (n2 > maiorNumero) {
			maiorNumero = n2;
		}
		if (n3 > maiorNumero) {
			maiorNumero = n3;
		}
		System.out.print("O maior n�mero �: "  + maiorNumero);
		}
}
