package acadgild_Task6;

//Write a program consisting method sum() and demonstrate the concept of method
//overloading using this method.

public class sum_Overloading {

//Sum Method	
	public void sum (int first_num,int sec_num){
	
		int sum;
		sum = first_num + sec_num;
		System.out.println("Sum of Two Numbers:"+sum);
		
	}
	
//Overloaded Sum Method , we have same Method Sum but we are giving different Parameters	
	public void sum (int first_num,int sec_num , int third_num){
		
		int sum;
		sum = first_num+sec_num+third_num;
		
		System.out.println("Sum of three Numbers:"+sum);
	}
	
	public static void main(String[] args) {
	
		int a = 10;
		int b = 20;
		int c = 30;
//Creating Object		
		sum_Overloading ob = new sum_Overloading();
		
//Calling both the sum method , one with 2 parameter other one with 3 		
		ob.sum(a, b);
		ob.sum(a, b, c);

		
	}

}
