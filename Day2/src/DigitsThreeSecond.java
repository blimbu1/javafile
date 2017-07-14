
public class DigitsThreeSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 786, sum = 0;
		sum = (num%10) + (num/10%10) + (num/100); 
		System.out.println(sum);
	}

}
