
public class TestingCustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		ContainsMethods hello = new ContainsMethods();
		try{
			num = Integer.parseInt(args[1]);
			hello.number(num);
			System.out.println("Number bigger than 9 is :"+num);
		}
		catch (CustomException z){
			System.out.println("Enter a number bigger than nine please");
		}
		catch (ArrayIndexOutOfBoundsException y){
			System.out.println("Please enter at least two numbers");
			
		}
		catch (Exception h){
			System.out.println("There is an error that I know not of!!");
		}
		finally{
			System.out.println("I will execute no matter what");
		}
		

	}

}

class CustomException extends Exception{}

class ContainsMethods{
	public int number(int j) throws CustomException{
		if(j<10){
			CustomException b = new CustomException();
			throw b;
		}
		else{
			return j;
		}
	}
}
