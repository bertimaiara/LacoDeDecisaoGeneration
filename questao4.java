package exercicios030322;
import java.util.Scanner;
public class questao4 {
	static Scanner ler = new Scanner(System.in);
	public static void main(String[] args) {
//Faça um programa em que permita a entrada de um número qualquer e exiba se este número
//é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o
//número elevado ao quadrado.
		int numero, elevado;
		double raiz=0;
		System.out.println("Digite um número: ");
		numero = ler.nextInt();

		if((numero%2) == 0){
			if(numero>=0){
				raiz = Math.sqrt(numero);
				System.out.println(raiz);
				}
		}else{
				elevado = numero*numero;
				System.out.println(elevado);
		}		
	}
}
