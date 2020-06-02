package ec.edu.ups.controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.ClienteDAO;
import ec.edu.ups.dao.DAOGuia;
import ec.edu.ups.modelo.Cliente;


/**
 * Servlet implementation class ControladorListarPorCedula
 */
@WebServlet("/ControladorListarPorCedula")
public class ControladorListarPorCedula extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorListarPorCedula() {
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
		
	
		String name = request.getParameter("opcion");
		String parametro = request.getParameter("parametro");

		ClienteDAO clienteDAO = DAOGuia.getGuia().getClienteDAO();
		boolean bandera = true;
		Cliente usuario = null;
		if (parametro == "") {
			String error = " Ingresar un dato";
			request.setAttribute("error", error);
			bandera = false;
		}

		if (name.equals("cedula") && bandera) {
			System.out.println("Correcto");
			// metodo para listar una busqueda por la cedula
			usuario = clienteDAO.readByAddress(parametro);
			request.setAttribute("usuario", usuario);

			request.setAttribute("Cedula", "Informacion del Cliente a buscar:");
			request.setAttribute("nn", "Nombre: ");
			request.setAttribute("cc", "Cedula: ");
			request.setAttribute("crr", "Direccion: ");

			String error = "Cedula incorrecta";
			request.setAttribute("error", error);

			request.setAttribute("parInval", parametro);

			request.getRequestDispatcher("JSPs/BuscarTicket.jsp").forward(request, response);
		}

	}

}
