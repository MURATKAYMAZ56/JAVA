package greetingsgenerator;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/greetings" })
public class GreetingServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public GreetingServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher //
				= this.getServletContext().getRequestDispatcher("/WEB-INF/greetings/create.jsp");

		dispatcher.forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String text = request.getParameter("text");
		String recipient = request.getParameter("recipient");
		String sender = request.getParameter("sender");
		
		GreetingValidator validator = new GreetingValidator();
		
		if(validator.isValid(text)) {
			
			Greeting greeting = new Greeting(text, recipient, sender);
			
			GreetingDAO dao = new GreetingDAO();
			dao.save(greeting);
			
		} else {
			
			request.setAttribute("message", validator.getErrorMessage());
		}

        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/greetings/create.jsp");
        dispatcher.forward(request, response);
	}

}
