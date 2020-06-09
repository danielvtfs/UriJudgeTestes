package Exer1005;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double a = scan.nextDouble() * 3.5;
		double b = scan.nextDouble() * 7.5;
		
		double media = (a + b) / 11;
		
		System.out.printf("MEDIA = %.5f\n", media);
		

	}

}
