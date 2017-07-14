import java.util.Arrays;

public class Maps {
	static String[] key_Two;
	static String[] value_Two;
	static int leng;
	public Maps(String[] x, String[] y){
		assign(x,y);
	}
	/*public void update(){
		key_one = key_Two;
		values_one = value_Two;
	}*/
	public void display(){
		System.out.println(Arrays.toString(key_Two));
		System.out.println(Arrays.toString(value_Two));
	}
	public static void assign(String[] x, String[] y){
		key_Two = x;
		value_Two = y;
		leng = key_Two.length;
	}
	public void add(String x, String y){
		int len1 = key_Two.length;
		//int len2 = value_Two.length;
		String[] key_three = new String[len1+1];
		String[] value_three = new String[len1+1];
		for(int j=0;j<len1;j++){
			key_three[j] = key_Two[j];
			value_three[j] = value_Two[j];
		}
		key_three[len1] = x;
		value_three[len1] = y;
		assign(key_three, value_three);
	}
	public void remove(String kee){
		int index = 0;
		int j = 0;
		String[] new_array_key = new String[leng-1];
		String[] new_array_value = new String[leng-1];
		for (int i = 0;i<leng;i++){
			if(kee.equals(key_Two[i])){
				index = i;
			}
		}
		int i =0;
		while(j<leng-1){
			if(j == index){
				i++;
			}
			new_array_key[j] = key_Two[i];
			new_array_value[j] = value_Two[i];
			j++;
			i++;
			
		}
		assign(new_array_key, new_array_value);
		
	}
	public void findByKey(String kee){
		for(int i=0;i<leng;i++){
			if(kee.equals(key_Two[i])){
				System.out.println(value_Two[i]);
				break;
			}
		}
		
	}
	public void mapKey(String kee, String valee){
		for (int i = 0;i<leng;i++){
			if (kee.equals(key_Two[i])){
				value_Two[i] = valee;
			}
		}
		
	}
	public void containsValue(String value){
		int j = 0;
		for(int i=0;i<leng;i++){
			if(value.equals(value_Two[i])){
				j = 1;
			}
		}
		if (j==1){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
		
	}
}
class doTest{
	public static void main(String[] args){
		String[] key_one;
		key_one = new String[]{"binay","david","nicky","stuart"};
		String[] values_one;
		values_one = new String[]{"limbu","yemm","tudor","luke"};
		Maps z = new Maps(key_one, values_one);
		z.add("rich", "rice");
		z.display();
		z.remove("nicky");
		z.display();
		z.add("Goku", "SAn");
		z.display();
		z.mapKey("Goku", "Takana");
		z.display();
		z.containsValue("Takana");
		key_one = Maps.key_Two;
		//z.update();
		System.out.println(Arrays.toString(key_one));
	}
}


