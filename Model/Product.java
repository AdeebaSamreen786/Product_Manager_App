package Model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private String review;
    private String customer_ratings;
    private int discount;
    private String brand;

    public void add(Product product) {
    }
}
