package exercicios030322;
import java.util.Scanner;
public class questao4 {
	static Scanner ler = new Scanner(System.in);
	public static void main(String[] args) {
//Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero
//� par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o
//n�mero elevado ao quadrado.
		int numero, elevado;
		double raiz=0;
		System.out.println("Digite um n�mero: ");
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
