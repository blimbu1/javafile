import java.util.Arrays;

interface Description{
	void sayHello();
	void myJob();
}

public class arrayOne implements Description {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int[] array_one = new int[5];
		array_one[0] = 5;
		array_one[1] = 19;
		array_one[2] = 35;
		array_one[3] = 99;
		array_one[4] = 255;
		Arrays.sort(array_one);
		System.out.println(Arrays.toString(array_one));
		System.out.println(array_one[0]);
		System.out.println(array_one[4]);
	}
	
	public void sayHello(){
		//This method says Hello
		System.out.println("Hello");
	}

	public void myJob(){
		//This methods gives the description of array One
		System.out.println("My job is to sort arrays in ascending order");
	}
}
