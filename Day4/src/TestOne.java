
public class TestOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank HSBC,Natwest;
		HSBC = new Bank();
		Natwest = new Bank();
		HSBC.SetDollar(46);
		Natwest.DollarRate();
		Natwest.SetDollar(99);
		HSBC.ConvertMoney(100);
		Natwest.ConvertMoney(200);
	}
}
