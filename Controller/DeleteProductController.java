package Controller;

import Service.ProductService;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet ("/delete product")
public class DeleteProductController extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        int id = 0;
        try {
            ProductService.deleteProduct(id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        PrintWriter writer = servletResponse.getWriter();
        boolean ProductService = false;
        writer.println(ProductService);

    }
}
