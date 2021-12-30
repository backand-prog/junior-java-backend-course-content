package raktar;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Delete
 */
@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Connection con = new Db().getCon();
		Statement stmTorol;
		
		try {
			stmTorol = con.createStatement();
			String sql = "UPDATE products SET deleted = 1 WHERE id = '" + request.getParameter("id") + "';";
			stmTorol.executeUpdate(sql);
			response.sendRedirect("Products");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*
		Connection con = new Db().getCon();
		String torolId = request.getParameter("id");
		String header = 
				"<html>"
					+ "<header>"
						+ "<title>Törlés</title>"
					+ "</header>"
					+ "<body>"
					+ "<h1>SIKERES TÖRLÉS</h1>"
					+ "<form action='Products' method='get'>"
					+ "<input type=submit name=modosit value=RENDBEN>"
					+ "</form>";
		PrintWriter out = response.getWriter();
		out.print(header);
		
		try {
			Statement stm = con.createStatement();
			stm.execute("DELETE FROM products WHERE id ='"+torolId+"';");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String footer = "</body></html>";
		out.print(footer);
		
		*/
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
