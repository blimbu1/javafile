
public class Flowchart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		for(;a<10;){
			System.out.println(a);
			if(a%2==0){
				System.out.println("EVEN");
				if (a>5){
					System.out.println("-");
				}
				else{
					System.out.println("*");
				}
			}
			else{
				System.out.println("Odd");
				if(a>5){
					System.out.println("!");
				}
				else{
					System.out.println("?");
				}
			}
			a = a + 1;
		}
	}
}
