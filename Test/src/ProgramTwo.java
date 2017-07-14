
public class ProgramTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no;
		no = 2152;
		if (no>4000){
			System.out.println("A");
			no = no + 100;
			if (no>5000){
				System.out.println("B");
				System.out.println("C");
			}
			else{
				System.out.println("D");
			}
			System.out.println("E");
		}
		else{
			no = no + 100;
			System.out.println("F");
			System.out.println("G");
			if(no<500){
				System.out.println("J");
			}
			else{
				System.out.println("H");
				System.out.println("I");
			}
			System.out.println("K");
		}
		System.out.println("L");
	}

}
