<%@ page import="java.io.*,java.util.*" %>
<%@ page import="javax.servlet.*,java.text.*" %>
<html>
<body>
	
	<%
  out.println("<center>Hello Dikshant Mali To your First JSP Program</center><br>"); 
	out.println("Your IP address is " + request.getRemoteAddr());


	Date d = new Date();
	SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
	out.print( "<h2 align=\"center\">" + ft.format(d) + "</h2>");
	%>
</body>
</html>