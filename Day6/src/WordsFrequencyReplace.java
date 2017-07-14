
public class WordsFrequencyReplace {
	public static void main(String args[]){
		String text = "I am your am Jason Mraz am";
		String search = "am";
		String sub = "Hello";
		String loc= "";
		String newline = "";
		int indexOne = 0,indexLast = text.length();
		System.out.println("String Length:" + indexLast);
		int space = 0;
		int count = 0;
		for (int i = 0;i<text.length()-(search.length()-1);i++){
			System.out.println(i +" "+ text.substring(i,i+1));
			if (text.substring(i,i+1).equals(" ")){
				space++;
			}
			if (text.substring(i, i+1).equals(search.substring(0, 1))){
				if(text.substring(i,(i+search.length())).equals(search)){
					loc = loc + (space+1) + " ";
					count++;
					newline = newline + text.substring(indexOne,i) + sub;
					indexOne = i+search.length();
				}
			}
		}
		System.out.println("The value of indexOne: " + indexOne);
		if(indexOne != (text.length()-(search.length()+1))){
			newline = newline + text.substring(indexOne,indexLast);
		}
		System.out.println("Location is: " + loc);
		System.out.println("Word count:" + count);
		System.out.println(newline);
	}

}
