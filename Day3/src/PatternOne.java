
public class PatternOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("1");
		for(int i = 1;i<=10;i++){
			if((i%2)!= 0){
				for(int a=1;a<=i;a++){
					System.out.print(a);
				}
				System.out.println();
			}
			else{
				System.out.println(i);
			}
		}

	}

}
