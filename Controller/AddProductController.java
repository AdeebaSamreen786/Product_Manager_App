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

@WebServlet ("/add product")

public class AddProductController extends GenericServlet {

    ProductService productService = new ProductService();
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        try {
            ProductService.addProduct(new Product());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        PrintWriter writer = servletResponse.getWriter();
        writer.println(productService);
    }
}
