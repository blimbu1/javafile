
public class BoardTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonalInfo binay = new PersonalInfo();
		binay.contact.email = "binay@gmail.com";
		binay.contact.tele = 9797439;
		binay.contact.home.street = "St. Arvans road";
		binay.off.work.street = "Government Building";
	}

}

class PersonalInfo{
	ContactDetails contact = new ContactDetails();
	Exams eggsjam = new Exams();
	Office off = new Office();
}

class Address{
	String street;
	String postcode;
	String city;
}

class ContactDetails{
	String email;
	long tele;
	Address home = new Address();
}

class Exams{
	int phy,che,mat;
	int total;
	float per;
	public void calcualate(){
		total = phy+che+mat;
		per = (float)total/3;
	}
	public void Result(){
		System.out.println("The total is: " +total);
		System.out.println("The percentage is: "+ per);
	}
}

class Office{
	String ni;
	long salary;
	char grade;
	Address work = new Address();
}