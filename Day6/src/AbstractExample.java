
abstract public class AbstractExample {
	public AbstractExample(){
		System.out.println("Do you know? that I can't take in any values:");
	}
	abstract public void addition();
	abstract public void subtraction();
	public void division(){
		int a = 6;
		int b = 4;
		System.out.println("The value of division is:"+(a/b));
	}
	final public void multiply(){
		int a = 11;
		int b = 13;
		System.out.println("The value of multiplication is:" +(a*b));
	}

}

class Math2 extends AbstractExample{
	public void addition(){//I am overriding the abstract functions
		int y = 67;
		int z = 189;
		System.out.println("The total value of addition is:" + (y+z));
	}
	public void subtraction(){// I am overriding the abstract functions
		int b = 111;
		int d= 87;
		System.out.println("The subtraction is:" + (b-d));
	}
//	public void multiply(){
//		System.out.println("Hello World");
//	}
	
}

class TrialOne{
	public static void main(String args[]){
		Math2 doing;
		doing = new Math2();// Is the constructor from AbstractExample inherited as well. Can't pass in values though??
		doing.addition();
		doing.division();
		doing.subtraction();
		doing.multiply();
	}
}
