package week7;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		
		//get the value form the text from HTML
		String uname=request.getParameter("username");
		String upass=request.getParameter("upass");
		
		//Create HttpSeesion object
		
		HttpSession session=request.getSession();
		
		//set the username in the session
		
		session.setAttribute("uname", uname);
		if(uname.equals("wipro") && upass.equals("password"))
		{
			//response.getWriter().println("Login Success");
			RequestDispatcher rd=request.getRequestDispatcher("Demo");
		rd.forward(request, response);
		}
			
		else
		{
			//response.getWriter().println("Login Fail");
			response.getWriter().println("Sorry username or password is incorrect");
			RequestDispatcher rd=request.getRequestDispatcher("/index.html");
			rd.include(request, response);
			
		}
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
