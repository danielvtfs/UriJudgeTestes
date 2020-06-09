package exer1009;


import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		String nome = scan.nextLine();
		double salario = scan.nextDouble();
		double vendas = scan.nextDouble();
		
		double total = ((vendas * 15) / 100) + salario;
		
		System.out.printf("TOTAL = R$ %.2f\n", total);
	}
}
