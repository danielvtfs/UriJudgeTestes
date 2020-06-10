package exer1013;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		double y = scan.nextDouble();
		
		double totalGasto = x / y;
		
		System.out.printf("%.3f km/l%n", totalGasto);
	}

}
