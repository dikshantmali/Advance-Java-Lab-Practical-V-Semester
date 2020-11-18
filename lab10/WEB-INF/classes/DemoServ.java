import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class DemoServ extends HttpServlet{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter pw=res.getWriter();

//implimenting any 2 methods
// implimenting getParameter
String name=req.getParameter("name");
pw.println("Welcome To This Servlet Program : "+name);

//returning the port number
int portNumber = req.getServerPort();
pw.println("req.getServerPort() : " + portNumber);



}}
