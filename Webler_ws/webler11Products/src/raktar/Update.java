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
 * Servlet implementation class Update
 */
@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update() {
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
		String header = "<html>"
				+ "<head>"
					+ "<title>Termék módosítás</title>"
				+ "</head>"
				+ "<body>"
					+ "<h1>Termék módosítás</h1>"
					+ "<table border=\"1\">"
						+ "<tr>"
							+ "<th>Megnevezés</th>"
							+ "<th>Ár</th>"
							+ "<th>Mennyiség</th>"
							+ "<th>Állapot</th>"
							+ "<th>Módosítás</th>"
						+ "</tr>";
		PrintWriter out = response.getWriter();
		out.print(header);
		String modositId = request.getParameter("id");
		try {
			Statement stm = con.createStatement();
			String sql = "SELECT * FROM products WHERE id ='"+modositId+"';";
			ResultSet rs = stm.executeQuery(sql);
			if (rs.next()) {
				String statusSelected = Integer.parseInt(rs.getString("status")) ==1 ? "selected":"";
				out.print("<tr>"
						+ "<form action='Products?id="+rs.getString("id")+"' method='POST'>"
						+ "<td><input type=text name=nev value='"+rs.getString("name")+"'></td>"
						+ "<td><input type=number name=ar value='"+rs.getString("price")+"'></td>"
						+ "<td><input type=number name=mennyiseg value='"+rs.getString("stock_amount")+"'></td>"
						+ "<td>"
						+ "<select name=allapot>"
							+ "<option value=0>Inaktív</option>"
							+ "<option value=1 "+statusSelected+">Aktív</option>"
						+ "</select>"
						+ "</td>"
						+ "<td><input type=submit name=modosit value=\"Módosít\"></td>"
						+ "</form>"
						+ "</tr>");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String footer = "</table></body></html>";
		out.print(footer);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
