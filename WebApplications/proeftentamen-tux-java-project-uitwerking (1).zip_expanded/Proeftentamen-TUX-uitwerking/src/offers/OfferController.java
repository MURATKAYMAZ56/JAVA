package offers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OfferController
 */
@WebServlet("/koopjes/plaats/")
public class OfferController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/offers/create_form.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// haal benodigde parameters van query. Stap 2 zou zijn om validatie in te
		// bouwen foutmeldingen teruggeven
		// uservelden uitlezen
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		double price = Double.parseDouble(request.getParameter("price"));

		// check of titel niet leeg of groter dan 20 karakters is, zo ne sla dan op en forward naar home
		// zo ja dan doorsturen met error message naar formulier
		// check ook nog of de velden niet leeg zijn
		if (!title.isEmpty() && title.length() < 20) {
			// the fat way
			UserDAOHibernateImpl uDao = new UserDAOHibernateImpl();
			
			Offer newOffer = new Offer(title, description, price);
			// Haal de testgebruiker op
			User user = new UserDAOHibernateImpl().getByName("testuser");
			user.addOffer(newOffer);
			uDao.saveUserAndOffer(user, newOffer);
			
			
			// Naar JSP
			request.getRequestDispatcher("/WEB-INF/offers/create_form.jsp").forward(request, response);
		} else {
			// terug naar formulier met errormessage
			request.setAttribute("message", "De titel mag maximaal 20 karakters lang zijn");
			request.getRequestDispatcher("/WEB-INF/offers/create_form.jsp").forward(request, response);
		}

	}

}
