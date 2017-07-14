
public class TestTwo_Second {
	public static void main(String args[]){
		Math1 m1 = new Math1();
		Math22 m2 = new Math22();
		Math3 m3 = new Math3();
//		ONS_Math m4 = new ONS_Math();
//		m4.Mathematics(m1, 2, 7);
//		m4.Mathematics(m2, 2, 7);
//		m4.Mathematics(m3, 2, 7);
		ONS_Math2(m1,8,9);
		ONS_Math2(m2,8,9);
		ONS_Math2(m3,8,9);
	}
	
	public static void ONS_Math2(Math m, int a,int b){
		m.add(a,b);
	}
}
