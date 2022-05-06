package GroupTwo.PodstawyB1.PodstawyB3;

import java.time.LocalDateTime;
import java.util.Arrays;

public class MyOrder {
    private MyProduct [] listOfProducts = new MyProduct [10];
    private LocalDateTime creationDate = LocalDateTime.now();
    private MyClientType clientType;
    private double summaryPrice;

    public MyOrder(MyClientType clientType) {
        this.clientType = clientType;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public MyClientType getClientType() {
        return clientType;
    }

    public double getSummaryPrice() {
        return summaryPrice;
    }
    public void addProduct(MyProduct product){
        boolean added = false;
        for (int i = 0; i < listOfProducts.length; i++) {
            if (listOfProducts[i] == null){     // null for String
                listOfProducts[i] = product;
                summaryPrice += product.getPriceOfItem() * product.getAmountOfItem();
                added = true;
                break;
            }
        }
        if (!added)
            System.out.println("No more space for products!");
    }

    @Override
    public String toString() {
        return "MyOrder{" +
                "listOfProducts:" + Arrays.toString(listOfProducts) +
                ", creationDate:" + creationDate +
                ", clientType=" + clientType +
                ", summaryPrice=" + summaryPrice +
                '}';
    }
}
