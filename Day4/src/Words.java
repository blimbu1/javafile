
public class Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n = "I am going   to          you        London     bie       bie everybody";
		int counter=0,check=0;
		System.out.println(n.length());
		for (int i =1;i<(n.length()-1);i++){
			//System.out.println(n.substring(i,i+1));
			if(n.substring(i, i+1).equals(" ")){
				//counter++;
				if((!n.substring(i+1,i+2).equals(" "))){
					counter++;
				}
				/*else if((n.substring(i-1,i).equals(" ")) || (n.substring(i+1,i+2).equals(" "))){
					check++;
				}*/
				
			}
		}
		counter++;
		System.out.println(counter + " words!");

	}

}
