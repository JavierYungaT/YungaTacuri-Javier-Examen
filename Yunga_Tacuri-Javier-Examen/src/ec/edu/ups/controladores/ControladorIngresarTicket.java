package ec.edu.ups.controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ec.edu.ups.dao.TicketDAO;
import ec.edu.ups.modelo.Ticket;


/**
 * Servlet implementation class ControladorIngresarTicket
 */
@WebServlet("/ControladorIngresarTicket")
public class ControladorIngresarTicket extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorIngresarTicket() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = null;
		doGet(request, response);
		
		
		String url = "";
		url = "/JSPs/RegistrarTicket.jsp";
		TicketDAO ticketDAO = ec.edu.ups.dao.DAOGuia.getGuia().getTicketDAO();
		

		Ticket usu = null;
		boolean nu = false;
		boolean fI = false;
		boolean hI = false;
		boolean fS = false;
		boolean hS = false;
		
		


		String numero = request.getParameter("numero");
		String fechaIngreso = request.getParameter("fechaIngreso");
		String horaIngreso = request.getParameter("horaIngreso");
		String fechaSalida = request.getParameter("fechaSalida");
		String horaSalida = request.getParameter("fechaIngreso");
		
		usu = new Ticket();
		ticketDAO.create(usu);
		session = request.getSession(true); 

		session.setAttribute("accesos", 1); 
		session.setAttribute("usuario", usu);

		System.out.println(usu);
		url = "/JSPs/CuentaPrincipal.jsp";



		request.setAttribute("numero",numero);
		request.setAttribute("fechaIngreso",fechaIngreso);
		request.setAttribute("horaIngreso",horaIngreso);
		request.setAttribute("fechaIngreso",fechaIngreso);
		request.setAttribute("horaIngreso",horaIngreso);
		

}
}
