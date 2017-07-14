
public class Results {
	int phy,che,mat;
	float total,per;
	
	public void Calculations()
	{
		total = phy+che+mat;
		per = total*100/450;
	}
	public void ShowResults()
	{
		System.out.println("Total score = " + total);
		System.out.println("Percentage = " + per);
	}

}
