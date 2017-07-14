
public class WordsFrequency {
	public static void main(String args[]){
		String text = "I am am";
		String search = "am";
		String loc= "";
		int space = 0;
		int count = 0;
		for (int i = 0;i<text.length()-(search.length()-1);i++){
			if (text.substring(i,i+1).equals(" ")){
				space++;
			}
			if (text.substring(i, i+1).equals(search.substring(0, 1))){
				if(text.substring(i,(i+search.length())).equals(search)){
					loc = loc + (space+1) + " ";
					count++;
				}
			}
		}
		System.out.println("Location is: " + loc);
		System.out.println("Word count:" + count);
	}
}
