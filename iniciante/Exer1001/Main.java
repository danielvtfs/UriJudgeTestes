package Exer1001;

import java.util.Scanner;
 
public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int fn = scan.nextInt();
		int sn = scan.nextInt();
		
		int answer = fn + sn;
		System.out.println("X = " + answer);
	}
}