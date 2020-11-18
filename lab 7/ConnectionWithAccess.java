import java.sql.*;
public class ConnectionWithAccess
{
public static void main(String args[])
{
	
try
{
	Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
	Connection con=DriverManager.getConnection("jdbc:ucanaccess://D:/College Data/adv java/lab 7/Database1.accdb");
	Statement st=con.createStatement();
	String sql="select * from result";
	ResultSet rs=st.executeQuery(sql);
	System.out.println("\n Firstname \t Lastname\t Marks");
	while(rs.next())
	{
		System.out.println(rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
	}

	String query="update result set FirstName = 'Ramesh' where Marks = 5 ";
	st.execute(query);
	ResultSet rs1=st.executeQuery("select * from result");
	System.out.println("\n\n---------The updated tale is given below----------");
	System.out.println("\n Firstname \t Lastname \t Marks");
	while(rs1.next())
	{
		System.out.println(rs1.getString(2)+"\t"+rs1.getString(3)+"\t"+rs1.getString(4));
	}
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}