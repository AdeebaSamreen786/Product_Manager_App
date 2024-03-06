package Service;

import Dao.ProductDao;
import Model.Product;

import java.sql.SQLException;
import java.util.List;

public class ProductService {
    static ProductDao productDao = new ProductDao();
    public static void addProduct(Product product) throws SQLException {
        productDao.addProduct(product);
    }

    public static void editproduct(Product product) throws SQLException {
        productDao.editProduct(product);
    }




    public static void deleteProduct(int id) throws SQLException {
        productDao.deleteProduct(id);
    }



    public static Product getProductById(int id) throws SQLException {
      return productDao.getProductById(id);
   }

    public static List<Product> getAllProducts() throws SQLException {
        return productDao.getAllProducts();
    }


}
