import static org.junit.jupiter.api.Assertions.*;

import org.example.*;
import org.junit.jupiter.api.Test;

class AddAndRemoveProductsFromCart {
    Cart testCart = new Cart();

    @Test
    void addTomatoToCart() {
        Product test = new Product("Tomato", 5.4f);
        testCart.AddProductToCart(test);

        assertTrue(testCart.getListOfProducts().contains(test));
    }

    @Test
    void removeTomatoFromCart() {
        Product test = new Product("Tomato", 3.8f);

        testCart.AddProductToCart(test);
        testCart.RemoveProductFromCart(test);

        assertFalse(testCart.getListOfProducts().contains(test));
    }
}