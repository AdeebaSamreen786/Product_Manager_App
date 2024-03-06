package Dao;

import Model.Product;
import util.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    public void addProduct(Product product) throws SQLException {
        String query1 = "insert into product(id, name,price, quantity, review, customer_ratings, discount, brand) values (?,?,?,?,?,?,?,?)";

        Connection connection = ConnectionUtil.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(query1);
        preparedStatement.setInt(1, product.getId());
        preparedStatement.setString(2, product.getName());
        preparedStatement.setDouble(3, product.getPrice());
        preparedStatement.setInt(4, product.getQuantity());
        preparedStatement.setString(5, product.getReview());
        preparedStatement.setString(6, product.getCustomer_ratings());
        preparedStatement.setInt(7, product.getDiscount());
        preparedStatement.setString(8, product.getBrand());

        preparedStatement.executeUpdate();
    }


    public void editProduct(Product product) throws SQLException {
        String query2 = "update product set id=?, name=?, price=?, quantity=?, review=?, customer_ratings=?, discount=?, brand=?";

        Connection connection = ConnectionUtil.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(query2);
        preparedStatement.setInt(1, product.getId());
        preparedStatement.setString(2, product.getName());
        preparedStatement.setDouble(3, product.getPrice());
        preparedStatement.setInt(4, product.getQuantity());
        preparedStatement.setString(5, product.getReview());
        preparedStatement.setString(6, product.getCustomer_ratings());
        preparedStatement.setInt(7, product.getDiscount());
        preparedStatement.setString(8, product.getBrand());

        preparedStatement.executeUpdate();
    }

    public void deleteProduct(int product) throws SQLException {
        String query3 = "delete product where id=?";

        Connection connection = ConnectionUtil.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(query3);
        int id = 0;
        preparedStatement.setInt(1, id);


        preparedStatement.executeUpdate();
    }

    public Product getProductById(int id) throws SQLException {
     String query4 = "select * from product where id=? limit 1";

      Connection connection = ConnectionUtil.getConnection();
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery(query4);
    Object product;
    while (resultSet.next()) {
      product = Product.builder()
            .productId(resultSet.getInt("id"))
           .productName(resultSet.getString("name"))
                     .productprice(resultSet.getDouble("price"))
                    .productQuantity(resultSet.getInt("quantity"))
                    .productReview(resultSet.getString("review"))
                    .productCustomer_ratings(resultSet.getString("customer_ratings"))
                    .productDiscount(resultSet.getInt("discount"))
                    .productBrand(resultSet.getString("brand"))

                    .build();
        }
        return new Product();

    }


    public List<Product> getAllProducts() throws SQLException {
        String query5 = "select * from product";
        Connection connection = ConnectionUtil.getConnection();
        List<Product> studentList = new ArrayList<>();

            PreparedStatement preparedStatement = connection.prepareStatement(query5);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Product> productList = null;
            while (resultSet.next()) {
                Product product = new Product();
                product.setId(resultSet.getInt("id"));
                product.setName(resultSet.getString("name"));
                product.setPrice(resultSet.getDouble("price"));
                product.setQuantity(resultSet.getInt("quantity"));
                product.setReview(resultSet.getString("review"));
                product.setCustomer_ratings(resultSet.getString("customer_ratings"));
                product.setDiscount(resultSet.getInt("discount"));
                product.setBrand(resultSet.getString("brand"));
                productList.add(product);

            }

            return productList;
        }


}

        





