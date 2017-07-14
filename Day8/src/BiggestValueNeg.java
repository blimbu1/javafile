
public class BiggestValueNeg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int compare = 0,compare1 = 0;
		int biggest_value = 0;
		int biggest_value_neg = Integer.MIN_VALUE;
		int third_biggest = 0;
		int third_biggest_neg = Integer.MIN_VALUE;
		int second_biggest = 0;
		int second_biggest_neg = Integer.MIN_VALUE;
		int[] arrayOne = {101,99,99,99,99,101,99,87,25,-2,-5,-9,-11,-15,18};
		//for(int i= 0;i<2;i++){
			for (int j=0;j<arrayOne.length;j++){
				if(arrayOne[j]>0){
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
				else{
					if(arrayOne[j]>third_biggest_neg){
						if (arrayOne[j]!=second_biggest && arrayOne[j]!=biggest_value){
							third_biggest_neg = arrayOne[j];
						}
						if((arrayOne[j]>second_biggest_neg) && arrayOne[j]!=biggest_value_neg){
							third_biggest_neg = second_biggest_neg;
							second_biggest_neg = arrayOne[j];
							if(arrayOne[j]>biggest_value_neg){
								second_biggest_neg = biggest_value_neg;
								biggest_value_neg = arrayOne[j];
							}
						}
					}
				}
			}
//			biggest_value = compare;
//		}
		System.out.println(third_biggest);
		System.out.println(second_biggest);
		System.out.println(biggest_value);
		System.out.println(third_biggest_neg);
		System.out.println(second_biggest_neg);
		System.out.println(biggest_value_neg);
		
		

	}

}
