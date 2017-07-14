//This program tests the inheritance concepts
public class abc {
	int j;
	private int x;
	public void something(){
		x =15;
		System.out.println(x);
	}

}

class xyz extends abc{
	public void go(){
		//x = 20;
		j = 22;
		//System.out.println(x);
		System.out.println(j);
	}
}

class TestThree{
	public static void main(String args[]){
		xyz c;
		c= new xyz();
		c.go();
		c.something();
	}
}