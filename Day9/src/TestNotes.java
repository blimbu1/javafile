
public class TestNotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		One x = new One();
		qa y = new qa(2,7);
		x.what();
		x.data();
		x.initialise();
		x.what();
		x.data();

	}

}

class One{
	int a;
	public void data(){
		int a = 15;
		System.out.println(a*a);
	}
	public void what(){
		System.out.println(a);
	}
	public void initialise(){
		this.a = 121;
	}
}


class qa{
	public qa(int x, int y, int z){
		System.out.println("A");
	}
	public qa(int x){
		this(7, 8, 9);
		System.out.println("B");
	}
	public qa(int a, int b){
		this(a);
		System.out.println("C");
	}
}