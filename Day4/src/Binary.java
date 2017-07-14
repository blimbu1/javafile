
public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5678,digit=0;
		String ans="";
		//String ans_real;
		while (num>0){
			digit = num % 2;
			num /=2;
			ans = digit + ans;
		}
		//ans = ans + '1';
		//ans_real = new StringBuilder(ans).reverse().toString();
		System.out.println(ans);

	}

}
