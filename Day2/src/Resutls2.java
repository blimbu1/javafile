
public class Resutls2 {
	private int phy,che,mat,total,check=0,sub=0;
	private float per;
	public void ShowResults(){
		if (check == 1){
			System.out.println("Cannot Dispaly the required calculations");
		}
		else{
			if (sub == 0){
				total = phy + che + mat;
				per = (float) total * 100/450;
				System.out.println("Total Score:" + total);
				System.out.println("Percentage:" + per);
			}
			else if (sub == 1){
				System.out.println("Retake the Exam");
			}
			else if (sub == 2){
				System.out.println("Please repeat the course");
			}
			else if (sub == 3){
				System.out.println("Go Home");
			}
		}
	}
	public void Physics(int a){
		if (a>=0 && a<=150){
			phy = a;
			if ( phy < 70){
				sub++;
			}
		}
		else{
			check=1;
			System.out.println("Wrong Value");
		}
	}
	public void Chemistry(int b){
		if (b>=0 && b<=150){
			che = b;
			if(che<70){
				sub++;
			}
		}
		else{
			check=1;
			System.out.println("Wrong Value");
		}
	}
	public void Math(int c){
		if (c>=0 && c<=150){
			mat = c;
			if(mat<70){
				sub++;
			}
		}
		else{
			check = 1;
			System.out.println("Wrong Value");
		}
	}

}
