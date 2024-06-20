package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public Double getTotalPrice() {
        return  products.stream()
                .map(this::calculatePrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .doubleValue();
    }

    private BigDecimal calculatePrice(Product product) {
        if (product.getNumberOfLegs() != null && product.getColor() == null) {
            return BigDecimal.valueOf(4.2 * product.getNumberOfLegs());
        } else if (product.getNumberOfLegs() != null && product.getColor() != null) {
           return switch (product.getColor()) {
            case "red" -> (product.isStinky() == true) ? BigDecimal.valueOf(0.6 * product.getNumberOfLegs() + 1) : BigDecimal.valueOf(1.2 * product.getNumberOfLegs() + 2);
            default -> (product.isStinky()) ? BigDecimal.valueOf(0.6 * product.getNumberOfLegs() + 1) : BigDecimal.valueOf(1.2 * product.getNumberOfLegs() + 2);
           };
        } else if (product.getAge() != null && product.getColor() == null) {
            if (product.isStinky()) {
                return BigDecimal.valueOf(10.0* product.getAge());
            } else {
                return BigDecimal.valueOf(20.0 * product.getAge());
            }
        } else if (product.getColor() != null && product.getBasePrice() != null) {
            return switch (product.getColor()) {
                case "blue" -> product.getBasePrice().add(BigDecimal.valueOf(0.1));
                case "gold" -> product.getBasePrice().multiply(BigDecimal.valueOf(100.0));
                default -> product.getBasePrice();
            };
        } else if (product.getName().equals("Magic: The Gathering - Black Lotus")) {
            return BigDecimal.valueOf(40000.0);
        } else if (product.getName().startsWith("Magic: The Gathering")) {
            return switch (product.getColor()) {
                case "blue" -> (product.getAge() > 10) ? BigDecimal.valueOf(2.5) : BigDecimal.valueOf(5.0);
                case "red" -> (product.getAge() > 10) ? BigDecimal.valueOf(1.75) : BigDecimal.valueOf(3.5);
                case "green" -> (product.getAge() > 20) ? BigDecimal.valueOf(5.28) : BigDecimal.valueOf(4.40);
                case "black" -> (product.getAge() > 20) ? BigDecimal.valueOf(8.16) : BigDecimal.valueOf(6.80);
                default -> BigDecimal.valueOf(2.0);
            };
        

        }    
         else { 
            return product.getSellPrice();
        }

    }

}
