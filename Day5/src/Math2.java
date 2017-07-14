
public class Math2 extends Math	{
	public void division(int a,int b){
		System.out.println(a/b);
	}
	public void multiplication(int a, int b){
		System.out.println(a*b);
	}
	public void addition(int a,int b){
		System.out.println("The sum of two number is:" + (a +b));
		
	}
	
}

class TestOne{
	public static void main(String args[]){
		Math2 trial;
		trial = new Math2();
		trial.addition(8, 9);
		trial.subtraction(9, -15);
	}
}
