package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    @Test
    void calculatePriceForMagicCards_red() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "red", null, "Magic: The Gathering - Lightning Bolt", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 3.5);

    }

    @Test
    void calculatePriceForMagicCards_blue() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "blue", null, "Magic: The Gathering - Maga Eternal", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 5.0);

    }

    @Test
    void calculatePriceForWine() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, false, null, null, "el tio juanillo", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 100.0);

    }

    @Test
    void calculatePriceForCheese() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, true, null, null, "French Camembert", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 50.0);
    }
    
    @Test
    void calculatePriceForMagicCards_green() {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, null, false, "green", null, "Magic: The Gathering - Elder Gargaroht", null);
        shoppingCart.addProduct(product);
        assertEquals(shoppingCart.getTotalPrice(), 4.4);
    }

    @Test
    void calculatePriceForMagicCards_black() {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, null, false, "Black", null, "Magic: The Gathering - Bad Ass", null);
        shoppingCart.addProduct(product);
        assertEquals(shoppingCart.getTotalPrice(), 6.8);
    }

    @Test
    void calculatePriceForBlueFish() {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, null, false, "Purple", null, null, null);
        shoppingCart.addProduct(product);
        assertEquals(shoppingCart.getTotalPrice(), 1.0);
    }

    


}
