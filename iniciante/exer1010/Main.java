package exer1010;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int codigoP1 = scan.nextInt();
		int numP1 = scan.nextInt();
		double valorP1 = scan.nextDouble();
		
		int codigoP2 = scan.nextInt();
		int numP2 = scan.nextInt();
		double valorP2 = scan.nextDouble();
		
		double valor = numP1 * valorP1 + numP2 * valorP2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor);

	}

}
