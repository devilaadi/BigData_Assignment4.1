package acadgild_Task4;

/*Write a program to accepts two numbers from stdin and find all the odd as well as even
numbers present in between them.*/

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class odd_even_prog {

	public static void main(String[] args) {
	 
	Scanner sc = new Scanner(System.in);
//Creating two list for storing the Two even and odd list	
	LinkedList<Integer> evenList = new LinkedList<>();
	LinkedList<Integer> oddList = new LinkedList<>();

//Input two number  between which we have to find odd or even values	
	System.out.println("Enter First Number");
	int first_num  = sc.nextInt();
	System.out.println("Enter Second Number");
	int sec_num = sc.nextInt();

//Logic for caluclating Even and odd Numbers	
	if(first_num < sec_num)
	{
		while(first_num <=sec_num)
		{
			if(first_num%2==0){
			evenList.add(first_num);
				}
				else
			if(first_num%2!=0){
			oddList.add(first_num);
			}
				first_num++;
		}
	}
	else
	{
		System.out.println("Print Input in Right Format");
	}
	
//Printing the Even and Odd Values 	
	System.out.print("Even Values :");
	for (int evenListValues : evenList) {
		System.out.print(" "+evenListValues);
	}
	System.out.println();
	System.out.print("Odd Values :");
	for (int oddListValues : oddList){
		System.out.print(" "+oddListValues);
	}
		
	}

}
