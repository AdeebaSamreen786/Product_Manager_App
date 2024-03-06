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
import java.util.List;

@WebServlet ("/get all products")
public class GetAllProductsController extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        List<Product> products = null;
        try {
            products = ProductService.getAllProducts();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        PrintWriter writer = servletResponse.getWriter();
        writer.println(products);

    }
}
