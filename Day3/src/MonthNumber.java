
public class MonthNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String month = "April";
		int returnedMonthNumber;
		//int returnedMonthNumber = StringSwitchDemo.getMonthNumber(month);
		StringSwitchDemo y;
		y = new StringSwitchDemo();
		returnedMonthNumber = y.getMonthNumber(month);
		if (returnedMonthNumber == 0){
			System.out.println("Invalid Month");			
		}else{
			System.out.println(returnedMonthNumber);
		}
		
	}

}
