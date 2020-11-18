<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>

<html>
<head>
   <title>JSP With Access</title>
</head>
<body>
   <%
   try { 
   Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
   Connection con=DriverManager.getConnection("jdbc:ucanaccess://D:/College Data/adv java/lab 7/Database1.accdb");
   Statement st=con.createStatement();
   String sql="select * from result";
   out.println(" FirstName \t LastName \t Marks <br/><br/>");
   ResultSet rs=st.executeQuery(sql);
         while(rs.next())
         {
            out.println(rs.getString(2)+"&nbsp"+rs.getString(3)+"&nbsp"+rs.getString(4)+"<br/>");
         } 
 
      out.println("</html></body>");  
      con.close(); 
   }
   catch(Exception e) {
   out.println(e); }
   %>
</body>
</html>