class Abc{
	public Abc(){
		System.out.println("x");
	}
}

class One extends Abc{
	public One(){
//		this(2);
		System.out.println("1");
	}
	public One(int a){
		System.out.println("2");
	}
}

class Two extends One{
	public Two(){
		System.out.println("A");
	}
	public Two(int a){
		System.out.println("B");
	}
}


public class TestOne {
	public static void main(String[] args){
		Two t = new Two();
		
	}

}
