package demo;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {


		
		
		Scanner sc = new Scanner (System.in) ;
		
		System.out.println("Please enter your name :");
		
		String name = sc.nextLine() ;
		
		System.out.println("Please enter your age :");
		
		int age = sc.nextInt() ;
		
		System.out.println("Please enter your salary :");
		
		double salary = sc.nextDouble() ;
		
		System.out.printf("My name is %s age is %d and my salary is £%.2f", name, age, salary);

	}

}
