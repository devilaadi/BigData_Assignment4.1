package acadgild_Task8;

import java.util.Arrays;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {

//Array Declaration 		
		Integer Arr[] = {10,1,2,4,11,100,20,134,6};
		
		System.out.println("Arrays Before Sorting");
		for(int number : Arr)
		{
			System.out.print(number+" ");
		}
//Sorting thr Array		
		Arrays.sort(Arr,Collections.reverseOrder());
		System.out.println("");
//Printing the Sorted Array
		System.out.println("Array After Sorting in Descending order");
		for(int number : Arr)
		{
			System.out.print(number+" ");
		}
		
		
	}

}
