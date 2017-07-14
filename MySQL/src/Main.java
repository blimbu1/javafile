import java.sql.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/ons",
					"root",
					"pass");
			Statement stm = con.createStatement();
			
			stm.executeUpdate("insert into qa values(3,'max')");
			ResultSet rs = stm.executeQuery("select * from qa");
			while (rs.next()){
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
			}
		}
			
		catch(Exception E){
			System.out.println(E);
		}
		
	}

}
