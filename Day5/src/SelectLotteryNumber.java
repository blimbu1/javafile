import java.util.Random;
public class SelectLotteryNumber {

	 public void generator(){
		 
		 int x = 1;
		 int y = 50;
		 Random rand;
		 int counter = 0;
		 while(counter <6){
			 int random = rand.nextInt((y - x) + 1) + x;
			 System.out.println(random); 
			 counter++;
		 }
		
		
	 }

}
