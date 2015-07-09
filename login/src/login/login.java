package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class login extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String user=req.getParameter("username");
		String pass=req.getParameter("password");
		if(user.equals("Midhuna")&&pass.equals("1234"))  
			pw.println("Login Success!!!!!!!!!!!!");     
		else              
			pw.println("Login Failed!!!!!!!!!!!!!");		
		pw.close();
	}
	
}
