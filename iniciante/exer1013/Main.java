package exer1013;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int maiorAB = (a+b+Math.abs(a-b))/2;
		int maiorBC = (maiorAB+c+Math.abs(maiorAB-c))/2;
		
		System.out.println(maiorBC + " eh o maior");
	}

}
