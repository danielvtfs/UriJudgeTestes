package exer1008;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numFunc = scan.nextInt();
		int horasTrab = scan.nextInt();
		double valorPorHora = scan.nextDouble();
		double salario = horasTrab * valorPorHora;
		
		System.out.println("NUMBER = " + numFunc);
		System.out.printf("SALARY = U$ %.2f\n", salario);

	}

}
