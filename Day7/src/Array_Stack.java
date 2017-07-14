import java.util.Arrays;

public class Array_Stack {
	int[] b ;
	public Array_Stack(int[] a){
		b = a;
	}
	public void show_array(){
		System.out.println(Arrays.toString(b));
	}
	public int[] push(int z){//not add
		int len = b.length;
		int[] new_array = new int[len+1];
		for (int j =0;j<len;j++){
			new_array[j] = b[j];
		}
		new_array[len] = z;
		b = new_array;
		return b;
	}
	public int pop(){//only the first 
		int e,val;
		e = b.length-1;
		int new_array[] = new int[e];
		val = b[e];
		for(int j=0;j<e;j++){
			new_array[j] = b[j];
		}
		b = new_array;
		return val;
			
	}
	public boolean empty(){
		if (b.length == 0){
			return true;
		}else{
			return false;
		}
	}
	public void peek(){
		int d;
		d = b.length - 1;
		System.out.println(b[d]);
		
	}
	public void clear(){
		
	}
	/*public static void arr(){
		int[] array_val = array;
	}*/

}

class Trial{
	public static void main(String[] args){
		int[] array_do;
		array_do = new int[]{1,5,8,12,18,22};
		Array_Stack y;
		y = new Array_Stack(array_do);
		y.peek();
		System.out.println(y.empty());
		y.show_array();
		System.out.println(y.pop());
		y.show_array();
		y.push(8);
		y.show_array();
		
		
	}
}