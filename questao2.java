package exercicios030322;
import java.util.Scanner;
public class questao2 {
	static Scanner ler = new Scanner(System.in);
	public static void main(String[] args) {
//Faça um programa que entre com três números e coloque em ordem crescente.
		
		int n1, n2, n3;
		
		System.out.println("Digite 3 números: ");
		n1 = ler.nextInt();
		n2 = ler.nextInt();
		n3 = ler.nextInt();
		
		if(n1 <= n2 && n2 <= n3) {
			System.out.println("1- A ordem crescente é: " + n1 + n2 + n3);
		}
		else if(n1<=n3 && n3<=n2) {
			System.out.println("2- A ordem crescente é: " + n1 + n3 + n2);
		}
		else if(n2<=n1 && n1<=n3) {
			System.out.println("3- A ordem crescente é: " + n2 + n1 + n3);
		}
		else if(n2<=n3 && n3<=n1) {
			System.out.println("4- A ordem crescente é: " + n2 + n3 + n1);
		}
		else if(n3<=n1 && n1<=n2) {
			System.out.println("5- A ordem crescente é: " + n3 + n1 + n2);
		}
		else {
			System.out.println("6- A ordem crescente é: " + n3 +" "+ n2 + n1);
		}
		}
		
	
}
