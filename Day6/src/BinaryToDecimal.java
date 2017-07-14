
public class BinaryToDecimal {
	public BinaryToDecimal(int x){
		int sum = 0;
		int pow =0;
		int power = 0;
		int val = x % 10;
		while (x > 0){
			if (val == 1){
//				sum +=  java.lang.Math.pow(2,power); //Math.pow(2,power);
				pow =1;
				for(int j=1;j<=power;j++){
					pow *=2;					
				}
				//System.out.println("Power is: " + pow);
				sum += pow;
			}
			//System.out.println("Sum is: " + sum);
			power++;
			x = x/10;
			val = x%10;
		}
		System.out.println("The decimal equivalent using integer is: " + sum);
	}
	
	public BinaryToDecimal(String x){
		int sum =0,pow,power = 0;
		for(int i = (x.length()-1);i>=0;i--){
			if((int)x.charAt(i)==49){
				pow =1;
				for(int j=1;j<=power;j++){
					pow *=2;					
				}
				//System.out.println("Power is: " + pow);
				sum += pow;
//				pow =0;
			}
			power++;
		}
		System.out.println("The decimal equivalent using string method is: "+ sum);
	}

}

class TestNew{
	public static void main(String args[]){
		BinaryToDecimal y = new BinaryToDecimal("101");
		BinaryToDecimal z = new BinaryToDecimal(1010);
	}
}
