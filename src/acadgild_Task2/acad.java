package acadgild_Task2;

import java.util.Scanner;

/*1) Write a java code with the class named ‘acad’ and a method ‘main’. Hard Code the program
with two integers and print the sum of those two.
2) Rewrite the above code, where, inputs are provided by the user at runtime and the output is
printed. */

public class acad {

	public static void main(String[] args) {

//Using Scanner Class for Getting input from user		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter First Number");
	
	int a = sc.nextInt();
	
	System.out.println("Enter Second Number");	
		
	int b = sc.nextInt();
//Summing the Input from the user
	
	int sum;
	sum = a+b;
	System.out.println(sum);
	
	sc.close();
	}

}
