import java.sql.*;
public class OperationOnAccess {

public static void main(String args[])
{
	
try
{
	Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
	Connection con=DriverManager.getConnection("jdbc:ucanaccess://D:/College Data/adv java/lab 8/Database2.accdb");
	Statement st=con.createStatement();
	String sql="select * from data";
	ResultSet rs=st.executeQuery(sql);
	System.out.println("\n Name \t FatherName \t Age \t Gender");
	while(rs.next())
	{
		System.out.println(rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
	}
	
	
	System.out.println("\n\n---------Performing Insertion operation----------");
	
	String query="insert into data values ('4','Kunal','Dhruv','18','M')";
	st.execute(query);
	ResultSet rs1=st.executeQuery("select * from data");
	System.out.println("\n Name \t FatherName \t Age \t Gender");
	while(rs1.next())
	{
		System.out.println(rs1.getString(2)+"\t"+rs1.getString(3)+"\t"+rs1.getString(4)+"\t"+rs1.getString(5));
	}
	
	

	System.out.println("\n\n---------Performing Updation----------");
	
	String query1="update data set Name = 'Bharat' where FatherName='Ashok Kumar' ";
	st.execute(query1);
	ResultSet rs2=st.executeQuery("select * from data");
	System.out.println("\n Name \t FatherName \t Age \t Gender");
	while(rs2.next())
	{
		System.out.println(rs2.getString(2)+"\t"+rs2.getString(3)+"\t"+rs2.getString(4)+"\t"+rs2.getString(5));
	}
	
	
	
System.out.println("\n\n---------Performing Deletion----------");
	
	String query2="delete from data where Name='Kunal' " ;
	st.execute(query2);
	ResultSet rs3=st.executeQuery("select * from data");
	System.out.println("\n Name \t FatherName \t Age \t Gender");
	while(rs3.next())
	{
		System.out.println(rs3.getString(2)+"\t"+rs3.getString(3)+"\t"+rs3.getString(4)+"\t"+rs3.getString(5));
	}
	
	
	
	


}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}
