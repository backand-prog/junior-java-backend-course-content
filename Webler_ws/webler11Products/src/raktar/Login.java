package raktar;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
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
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		Connection con = new Db().getCon();
	
		//System.out.println(con);
		
		PrintWriter out = response.getWriter();
		String felhasznaloNev = request.getParameter("felhasznaloNev");
		String jelszo = request.getParameter("jelszo");
		
		try {
			Statement stm = con.createStatement();
			String sql = "SELECT * FROM users WHERE user_name ='"+felhasznaloNev+"' AND pwd='"+jelszo+"';";
			ResultSet rs = stm.executeQuery(sql);
			
			if (rs.next()) {
				//helyesen adta meg a felhasználónév/jelszó párost
				//System.out.println("BELÉPHET");
				//átirányítás belsõ oldalra
				response.sendRedirect("Products");
			} else {
				//hibás felhasználónév/jelszó páros....
				//System.out.println("Nem léphet be");
				out.println("<script>");
				out.println("alert('Hibás felhasználónév/jelszó!!!')");
				out.println("location='';");
				out.println("</script>");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
