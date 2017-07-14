
public class StringEncryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "ABdif24*,219Abz17//";
		char ch;
		int check;
		for(int i=0;i<text.length();i++){
			ch = text.charAt(i);
			check = ch;
			if (check>=65 && check<=90){
				check += 32;
				System.out.print((char)check);
			}
			else if(check>=97 && check<=122){
				check-=32;
				System.out.print((char)check);
			}
			else if(check>=49 && check<=57){
				System.out.print((Integer.parseInt(text.substring(i, i+1))*2));
			}
			else{
				System.out.print(ch);
			}
		}

	}

}
