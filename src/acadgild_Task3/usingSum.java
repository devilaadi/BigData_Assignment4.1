package acadgild_Task3;

import java.util.Scanner;

/* Write a program with method name sum() that accepts two parameters from user and print
the sum of two numbers. Output format should be as: */

public class usingSum {

	public void sum(int first_no , int sec_no)
	{

//Sum logic
	int sum = first_no + sec_no;	
	
	System.out.println("First number is:"+first_no);
	System.out.println("Second number is:"+sec_no);
	System.out.println("Sum is:"+sum);
	
	}
	
	public static void main(String[] args) {

//Taking input from user
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter First Number");
	int first_num = sc.nextInt();
	
	System.out.println("Enter Second Number");
	int sec_num = sc.nextInt();

//Creating object for using Sum method and passing user input
	
	usingSum obj = new usingSum();
	obj.sum(first_num, sec_num);
	
	sc.close();
	}

}
