package acadgild_Task5;

import java.util.Scanner;

/*Joe is scared to go to school. When her dad asked the reason, joe said she is unable to
complete the task given by her teacher. The task was to find the “first 10 multiples” of the
number entered from stdin */

public class multiPlication {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
//Taking value of the multiple	
	System.out.println("Enter the value of the Multiple");
	int num = sc.nextInt();
	
//How many multiples 	
	System.out.println("Enter how many Multiples you want");
	int mul = sc.nextInt();
	
//Logic for the multiplication	
	for(int i =1 ; i<=mul;i++){
		int value = num * i;
		System.out.println(num +" X "+i+" = "+value);
	}	
	}

}
