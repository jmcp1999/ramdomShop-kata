package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

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
        Product product = new Product(null, null, false, "black", null, "Magic: The Gathering - Bad Ass", null);
        shoppingCart.addProduct(product);
        assertEquals(shoppingCart.getTotalPrice(), 6.8);
    }

    @Test
    void calculatePriceForMagicCards_brown() {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, null, false, "brown", null, "Magic: The Gathering - ", null);
        shoppingCart.addProduct(product);
        assertEquals(shoppingCart.getTotalPrice(), 2.0);
    }

    @Test
    void calculatePriceForMagicCards_blacklotus() {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, null, false, null, null, "Magic: The Gathering - Black Lotus", null);
        shoppingCart.addProduct(product);
        assertEquals(shoppingCart.getTotalPrice(), 40000.0);
    }

    @Test
    void calculatePriceForBlueFish() {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, null, false, "blue", BigDecimal.valueOf(0), null, null);
        shoppingCart.addProduct(product);
        assertEquals(shoppingCart.getTotalPrice(), 0.1);
    }


    @Test
    void calculatePriceForGoldFish() {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, null, false, "gold", BigDecimal.valueOf(1), null, null);
        shoppingCart.addProduct(product);
        assertEquals(shoppingCart.getTotalPrice(), 100.0);
    }
    
    @Test
    void calculatePriceForFish() {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(null, null, false, "green", BigDecimal.valueOf(1), null, null);
        shoppingCart.addProduct(product);
        assertEquals(shoppingCart.getTotalPrice(), 1.0);
    }

    @Test
    void calculatePriceForDog() {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product = new Product(4, null, false, null, null, null, null);
        shoppingCart.addProduct(product);
        assertEquals(shoppingCart.getTotalPrice(), 16.8);
    }

    @Test
    void calculatePriceForMagicCards_blue2() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 12, false, "blue", null, "Magic: The Gathering - Maga Eternal", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 2.5);
    }

    @Test
    void calculatePriceForMagicCards_red2() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 23, false, "red", null, "Magic: The Gathering - Maga Eternal", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 1.75);
    }

    @Test
    void calculatePriceForMagicCards_green2() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 25, false, "green", null, "Magic: The Gathering - Maga Eternal", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 5.28);
    }

    @Test
    void calculatePriceForMagicCards_black2() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 23, false, "black", null, "Magic: The Gathering - Maga Eternal", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 8.16);
    }


}
