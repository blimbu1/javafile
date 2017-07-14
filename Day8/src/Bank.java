
public class Bank {
	int a;
	static int b = 0;
	static Bank r;
	public void msg(){System.out.println("hello");}
	private Bank(){}
	public static Bank xyz(){
		if(b<3){
			b++;
			r = new Bank();	
			return r;
		}
		else{
			System.out.println("You are trying to create more than three objects");
			return null;
		}
		//return r;
	}

}

class Testers{
	public static void main(String[] args){
		Bank HSBC,Natwest,Couts,Barclays;
		HSBC = Bank.xyz();
		Natwest = Bank.xyz();
		Barclays = Bank.xyz();
		HSBC.a = 756;
		Couts = Bank.xyz();
		System.out.println(HSBC);
		System.out.println(Natwest.a);
		System.out.println(Barclays.a);
	}
}
