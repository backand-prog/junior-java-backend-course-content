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
 * Servlet implementation class Products
 */
@WebServlet("/Products")
public class Products extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Products() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Db dbObj = new Db();
		Connection con = dbObj.getCon();
		
		String id = request.getParameter("id");
		//ha nem üres, akkor elvégezzük az update-t
		if (id!=null) {
			String nev = request.getParameter("nev");
			String ar = request.getParameter("ar");
			String mennyiseg = request.getParameter("mennyiseg");
			String allapot = request.getParameter("allapot");
			
			try {
				Statement stm = con.createStatement();
				stm.execute("UPDATE products SET name = '"+nev+"', "
					+ "price = '"+ar+"', "
					+ "stock_amount = '"+mennyiseg+"',"
					+ "status = '"+allapot+"' "
					+ "WHERE id = '"+id+"';");
				response.sendRedirect("Products");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		
		
		PrintWriter out = response.getWriter();
		String header = "<html>"
				+ "<head>"
					+ "<title>Termékek</title>"
				+ "</head>"
				+ "<body>"
					+ "<h1> Termék lista </h1>"
					+ "<table border=\"1\">"
						+ "<tr>"
							+ "<th> ID </th>"
							+ "<th> Név </th>"
							+ "<th> Ár </th>"
							+ "<th> Raktármennyiség </th>"
							+ "<th> Állapot </th>"
							+ "<th> Módosítás </th>"
							+ "<th> Törlés </th>"
						+ "</tr>";
		out.print(header);
		
		//sorok betöltése DB-bõl
		String sql = "SELECT * FROM products WHERE deleted = 0;";
		ResultSet rs = dbObj.lekerdez(sql);
		
		try {
			while (rs.next()) {
				String aktivE = Integer.parseInt(rs.getString("status"))== 1 ? ("aktív") :("inaktív");
				out.print("<tr>"
						+ "<td>"+rs.getString("id")+"</td>"
						+ "<td>"+rs.getString("name")+"</td>"
						+ "<td>"+rs.getString("price")+"</td>"
						+ "<td>"+rs.getString("stock_amount")+"</td>"
						+ "<td>"+aktivE+"</td>"
						+ "<td><a href=\"Update?id="+rs.getString("id")+"\">Módosít</a></td>"
						+ "<td><a href=\"Delete?id="+rs.getString("id")+"\">Töröl</a></td>"
						+ "</tr>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String footer = "</table><br> <a href=\"NewProduct.html\">Új termék felvitel</a> </body></html>";
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
