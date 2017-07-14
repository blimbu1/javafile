
public class OverLoad {
	public OverLoad(int x, int y, int z){
		System.out.println("One");
	}
	public OverLoad(int a){
		this(7,8,0);
		System.out.println("Two");
	}
	public OverLoad(int a, int b){
		this(a);
		System.out.println("Three");
	}
}
