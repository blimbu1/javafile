
public class BiggestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int compare = 0,compare1 = 0;
		int biggest_value = Integer.MIN_VALUE;
		int third_biggest = Integer.MIN_VALUE;
		int second_biggest = Integer.MIN_VALUE;
		int[] arrayOne = {101,101,101};
		//for(int i= 0;i<2;i++){
			for (int j=0;j<arrayOne.length;j++){
				if(arrayOne[j]>third_biggest){
					if (arrayOne[j]!=second_biggest && arrayOne[j]!=biggest_value){
						third_biggest = arrayOne[j];
					}
					if((arrayOne[j]>second_biggest) && arrayOne[j]!=biggest_value){
						third_biggest = second_biggest;
						second_biggest = arrayOne[j];
						if(arrayOne[j]>biggest_value){
							second_biggest = biggest_value;
							biggest_value = arrayOne[j];
						}
					}
				}
				
			}
//			biggest_value = compare;
//		}
		System.out.println(third_biggest);
		System.out.println(second_biggest);
		System.out.println(biggest_value);

	}
	
}
