package GroupTwo.PodstawyB1.PodstawyB3;

public class MyProduct {
    private String nameOfItem;
    private int amountOfItem;
    private double priceOfItem;
    private Country country;

    public MyProduct(String nameOfItem, int amountOfItem, double priceOfItem, Country country) {
        this.nameOfItem = nameOfItem;
        this.amountOfItem = amountOfItem;
        this.priceOfItem = amountOfItem;
        this.country = country;
    }

    public String getNameOfItem() {
        return nameOfItem;
    }

    public int getAmountOfItem() {
        return amountOfItem;
    }

    public double getPriceOfItem() {
        return priceOfItem;
    }

    public Country getCountry() {
        return country;
    }
}