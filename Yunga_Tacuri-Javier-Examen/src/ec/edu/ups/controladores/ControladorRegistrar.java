package ec.edu.ups.controladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ec.edu.ups.dao.ClienteDAO;
import ec.edu.ups.modelo.Cliente;

/**
 * Servlet implementation class Registrar
 */
@WebServlet("/ControladorRegistrar")
public class ControladorRegistrar extends HttpServlet {
	private static final long serialVersionUID = 1L;



	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControladorRegistrar() {
		super();
		
		
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = null;
		doGet(request, response);

		
		String url = "";
		url = "/JSPs/Registrar.jsp";
		ClienteDAO clienteDAO = ec.edu.ups.dao.DAOGuia.getGuia().getClienteDAO();

		Cliente usu = null;
		boolean ci = false;
		boolean no = false;
		boolean di = false;
		boolean te = false;
		
		


		String cedula = request.getParameter("cedula");
		String nombre = request.getParameter("nombre");
		String direccion = request.getParameter("direccion");
		String telefono = request.getParameter("telefono");
		
		
				usu = new Cliente(cedula, nombre, direccion, telefono, null);
				clienteDAO.create(usu);
				session = request.getSession(true); 

				session.setAttribute("accesos", 1); 
				session.setAttribute("usuario", usu);

				System.out.println(usu);
				url = "/JSPs/CuentaPrincipal.jsp";
				
				request.setAttribute("cedula", cedula);
				request.setAttribute("nombre", nombre);
				request.setAttribute("direccion", direccion);
				request.setAttribute("telefono", telefono);
				
				request.getRequestDispatcher(url).forward(request, response);

			}


		







	}




