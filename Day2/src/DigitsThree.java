
public class DigitsThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 789,sum = 0;
		while(num>0){
			sum += num%10;
			num /= 10;
		}
		System.out.println(sum);

	}

}
