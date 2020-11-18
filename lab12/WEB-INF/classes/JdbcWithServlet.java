import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*; 
import java.sql.*;
public class JdbcWithServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException,
	IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>Dikshant</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<h1>***Below is the database content***</h1>"); 
		try { 
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			Connection con=DriverManager.getConnection("jdbc:ucanaccess://D:/College Data/adv java/lab 7/Database1.accdb");
			Statement st=con.createStatement();
			String sql="select * from result";
			ResultSet rs=st.executeQuery(sql);
			out.println("<table border=1 width=50% height=50%>");
			out.println("<tr><th>FirstName</th><th>LastName</th><th>Marks</th><tr>");
			while(rs.next())
			{
				out.println("<tr><td>"+rs.getString(2)+"</td><td>"+"\t"+rs.getString(3)+"</td><td>"+"\t"+rs.getString(4)+"</td></tr>");
			} 

			out.println("</table>");  
			out.println("</html></body>");  
			con.close(); 
		}
		catch(Exception e) {
			out.println(e); }

		}
	}