package project.curd.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.curd.model.Products;
import project.curd.service.ProductServiceImpl;
import project.curd.service.ProductService;

/**
 * Servlet implementation class DisplayProductServlet
 */
@WebServlet("/DisplayProductServlet")
public class DisplayProductServlet extends HttpServlet {
	ProductService service = new ProductServiceImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Products> products = service.displayProducts();
		request.setAttribute("products", products);
		RequestDispatcher rd = request.getRequestDispatcher("displayproduct.jsp");
		rd.forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
