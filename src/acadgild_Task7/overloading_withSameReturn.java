package acadgild_Task7;

public class overloading_withSameReturn {

	//Method with Int Return Type
	public int sum (int first_num,int sec_num){
		
		int sum;
		sum = first_num + sec_num;
		return sum;
		
	}
	
//Overloaded Sum Method , we have same Method Sum but we are giving different Parameters And Same return type .
	public int sum (int first_num,int sec_num , int third_num){
		
		int sum;
		sum = first_num+sec_num+third_num;
		return sum;
	}
	
	public static void main(String[] args) {
	
		int a = 10;
		int b = 20;
		int c = 30;
//Creating Object		
	
		overloading_withSameReturn ob = new overloading_withSameReturn();
		
		System.out.println(ob.sum(a, b));
		System.out.println(ob.sum(a, b,c));
		
}
}