
public class Qa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Results peter,smith;
		peter = new Results();
		smith = new Results();
		peter.phy = 80;
		peter.mat = 42;
		peter.che = 99;
		peter.Calculations();
		peter.ShowResults();
		smith.phy = 88;
		smith.mat= 96;
		smith.che = 105;
		smith.Calculations();
		smith.ShowResults();
	}

}
