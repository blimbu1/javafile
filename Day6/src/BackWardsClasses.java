
class ONE{
	int a;
	public void message(){
		System.out.println("Hello I am from the Original Class");
	}
	public void message3(){
		System.out.println("This should run fine");
	}
}

class Two extends ONE{
	public void message2(){
		System.out.println("Hello I am from the inherited class");
	}
}
public class BackWardsClasses 
{
	public static void main(String args[]){
		ONE y;
		y = new Two();
		y.message();
//		y.message2();
		y.message3();
	}

}
