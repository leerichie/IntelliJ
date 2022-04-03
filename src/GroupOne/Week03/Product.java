package GroupOne.Week03;

public class Product {
    private String productName;
    private int amountOfProduct;
    private double priceOfProduct;

    public Product(String productName, int amountOfProduct, double priceOfProduct) {
        this.productName = productName;
        this.amountOfProduct = amountOfProduct;
        this.priceOfProduct = priceOfProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getAmountOfProduct() {
        return amountOfProduct;
    }

    public void setAmountOfProduct(int amountOfProduct) {
        this.amountOfProduct = amountOfProduct;
    }

    public double getPriceOfProduct() {
        return priceOfProduct;
    }

    public void setPriceOfProduct(double priceOfProduct) {
        this.priceOfProduct = priceOfProduct;
    }

}
