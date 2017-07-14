
public class ChangeMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double temp_val,fifty, twenty, ten,five,two, one , fiftyp, twentyp,fivep, twop , onep,tenp;
		double bill = 87.97;
		if (bill >= 50.0){
			System.out.println(bill);
			fifty = (int) bill/50;
			bill = (bill % 50.0);
			System.out.println("fifty:" + fifty);
		}
		if (bill >= 20.0 && bill<50.0){
			System.out.println(bill);
			twenty =(int) bill/20;
			bill = bill % 20.0;
			System.out.println("twenty:" + twenty);
		}
		if (bill >= 10.0 && bill < 20.0){
			System.out.println(bill);
			ten = (int)bill/10;
			bill = bill % 10.0;
			bill = Math.round(bill * 100.0) /100.0;
			System.out.println("Ten:" + ten);
		}
		if (bill >= 5.0 && bill < 10.0){
			System.out.println(bill);
			five = (int)bill/5;
			bill = bill % 5.0;
			bill = Math.round(bill * 100.0) /100.0;
			System.out.println("five:" + five);
		}
		if ( bill >=2.0 && bill < 5.0){
			System.out.println(bill);
			two = (int)bill / 2;
			bill= bill%2.0;
			bill = Math.round(bill * 100.0) /100.0;
			System.out.println("Two:" + two);
		}
		if (bill >=1.0 && bill < 2.0){
			//bill = bill*100.0;
			System.out.println(bill);
			one = (int)bill /1;
			bill = bill % 1.0;
			bill = Math.round(bill * 100.0) /100.0;
			System.out.println("One:" + one);
		}
		if (bill >=0.5 && bill < 1.0){
			System.out.println(bill);
			temp_val = bill * 100.0;
			fiftyp = (int)temp_val/50;
			bill = bill % 0.5;
			bill = Math.round(bill * 100.0) /100.0;
			System.out.println("fiftyp:" + fiftyp);
		}
		if ( bill >=0.2 &&  bill < 0.5){
			System.out.println(bill);
			temp_val = bill * 100;
			twentyp = (int)temp_val/20;
			bill = bill % 0.2;
			bill = Math.round(bill * 100.0) /100.0;
			System.out.println("twentyp:" + twentyp);
		}
		if ( bill >=0.1 && bill<0.2){
			System.out.println(bill);
			temp_val = bill * 100;
			tenp = (int)temp_val/ 10;
			bill = bill % 0.1;
			bill = Math.round(bill * 100.0) /100.0;
			System.out.println("tenp:" + tenp);
		}
		if (bill >=0.05 && bill<0.1){
			System.out.println(bill);
			temp_val = bill * 100;
			fivep = (int)temp_val/ 5;
			bill = bill % 0.05;
			bill = Math.round(bill * 100.0) /100.0;
			System.out.println("fivep:" + fivep);
		}
		if (bill >=0.02 && bill<0.05){
			System.out.println(bill);
			temp_val = bill * 100.0;
			twop = (int)temp_val/2;
			bill = bill/0.02;
			bill = Math.round(bill * 100.0) /100.0;
			System.out.println("twop:" + twop);
		}
		if (bill>=0.01 && bill<0.02){
			System.out.println(bill);
			temp_val = bill * 100;
			onep = (int)temp_val/1;
			bill = Math.round(bill * 100.0) /100.0;
			System.out.println("onep:"+onep);
		}
	}

}


