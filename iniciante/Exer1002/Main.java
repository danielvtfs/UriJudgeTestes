package Exer1002;


import java.util.Scanner;

/*A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:

- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.*/

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double r = scan.nextDouble();
		double area = 3.14159 * r * r;

		System.out.printf("A=%.4f\n", area);

	}

}
