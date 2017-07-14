
public class Except {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		try{
			//c = 4/0;
			int[] arrayOne = new int[4];
			for(int i=0;i<6;i++){
			arrayOne[i] = i;
			}
		}
		catch (ArithmeticException d){
			System.out.println("hello world!");
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("The array is too small");
		}
		//System.out.println(arrayOne.length);
	}

}
