package exercicios030322;
import java.util.Scanner;
public class questao3 {
	static Scanner ler = new Scanner(System.in);
	public static void main(String[] args) {
//Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual
//categoria ela se encontra:
//10-14 infantil
//15-17 juvenil
//18-25 adulto
		int idade;
		
		System.out.println("Qual a sua idade? ");
		idade = ler.nextInt();

		if (idade >= 10 && idade <=14)
		{
			System.out.println("Voc� � da categoria Infantil");
		}
		else if (idade >= 15 && idade <=17)
		{
			System.out.println("Voc� � da categoria Juvenil");
		}
		else
		{
			System.out.println("Voc� � da categoria Adultos");
		}
	}
}