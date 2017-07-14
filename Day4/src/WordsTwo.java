
public class WordsTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test= "I am     going to London";
		for(int i = 0;i<test.length();i++){
			if(!test.substring(i,i+1).equals(" ")){
				System.out.print(test.substring(i,i+1));
			}
			else{
				System.out.println();
			}
			
		}

	}

}
