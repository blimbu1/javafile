
public class argument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		a = b = c = 0;
		try{
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			c = a/b;
			System.out.println("The Result: " + c);
		}
		catch(NumberFormatException cee){
			System.out.println("Please enter only numeric value");
		}
		catch(ArithmeticException zee){
			System.out.println("Cannot divide any of this by zero");
		}
		catch(ArrayIndexOutOfBoundsException a123){
			System.out.println("Please provide 2 values");
		}
		catch (Exception x1){
			System.out.println("Do it now");
		}

	}

}
