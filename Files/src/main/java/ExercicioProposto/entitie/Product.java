package ExercicioProposto.entitie;

import java.math.BigDecimal;

public class Product {
    private String product;
    private BigDecimal price;
    private Integer quantity;

    public Product(String product, BigDecimal price, Integer quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal total(){
        return price.multiply(BigDecimal.valueOf(Double.parseDouble(quantity.toString())));
    }
}
