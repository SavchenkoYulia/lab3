import static org.junit.jupiter.api.Assertions.*;

import org.example.Product;
import org.junit.jupiter.api.Test;

import java.util.Objects;

class AddProductTest {
    String name;
    float price;
    Product product;

    @Test
    void addEggToProducts() {
        name = "Tomato";
        price = 5.4f;
        product = new Product(name, price);
        assertTrue(Objects.equals(name, product.getName()) && Objects.equals(price, product.getPrice()));
    }

    @Test
    void addMilkToProducts() {
        name = "Onion";
        price = 0.5f;
        product = new Product(name, price);
        assertTrue(Objects.equals(name, product.getName()) && Objects.equals(price, product.getPrice()));
    }

    @Test
    void addBreadToProducts() {
        name = "Salt";
        price = 3f;
        product = new Product(name, price);
        assertTrue(Objects.equals(name, product.getName()) && Objects.equals(price, product.getPrice()));
    }


}