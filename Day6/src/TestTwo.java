abstract class Math{
	abstract public void add(int x,int y);
}

class Math1 extends Math{
	public void add(int x, int y){
		System.out.println((x+y));
	}
}

class Math22 extends Math{
	public void add(int x,int y){
		System.out.println("1st: " + x);
		System.out.println("2nd: " + y);
		System.out.println("Total: "+ (x+y));
	}
}

class Math3 extends Math{
	public void add(int x, int y){
		System.out.println("The output is: " + (x+y));
	}
}

class ONS_Math
{
	public void Mathematics(Math m, int a,int b){
		m.add(a, b);
	}
}

public class TestTwo{
	public static void main(String args[]){
		Math1 m1 = new Math1();
		Math22 m2 = new Math22();
		Math3 m3 = new Math3();
		ONS_Math m4 = new ONS_Math();
		m4.Mathematics(m1, 2, 7);
		m4.Mathematics(m2, 2, 7);
		m4.Mathematics(m3, 2, 7);
		
	}
}
