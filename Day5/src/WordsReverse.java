
public class WordsReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "I am going to London now everybody bie bie";
		int index = text.length();
		for(int i = (text.length()-1);i>=0;i--){
			if(text.substring(i, i+1).equals(" ")){
				System.out.println(text.substring(i+1,index));
				index = i;
			}
		}
		System.out.println(text.substring(0,index));

	}

	
}
