
public class Bank {
	static int dollarOne;
	int x;
	public void SetDollar(int a){
		dollarOne = a;
	}
	public void ConvertMoney(int m){
		System.out.println(m*dollarOne);
	}
	public void DollarRate(){
		System.out.println("Dollar:" + dollarOne);
	}
}
