package Controller;

import Model.Product;
import Service.ProductService;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet ("/get product by id")
public class GetProductByIdController extends GenericServlet {
  @Override
public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        int productId = Integer.parseInt(servletRequest.getParameter("id"));
      Product product;
      try {
          product = ProductService.getProductById(productId);
      }catch (SQLException e){
        throw new RuntimeException(e);
      }
      PrintWriter writer = servletResponse.getWriter();
      writer.println(product);

    }
}
