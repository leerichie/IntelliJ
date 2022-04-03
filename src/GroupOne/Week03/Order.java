package GroupOne.Week03;

import java.util.Scanner;

public class Order {

    private Product[] listOfOrders;
    private Scanner scanner;
    public static int currentNumberOfPositionsInOrder;

    public Order() {
        scanner = new Scanner(System.in);
        System.out.println("-----------------------" +
                         "\n      Welcome to" +
                        "\nRichards Supermarket" +
                        "\n-----------------------" +
                         "\n\nHow many items would you like to order?");
        int numberOfPositions = scanner.nextInt();
        scanner.nextLine();
        this.listOfOrders = new Product[numberOfPositions];
    }

    public void addItem() {
        if (currentNumberOfPositionsInOrder < listOfOrders.length) {
            Product product = createProduct();
            putProductOnSpecificIndex(product);
        } else {
            System.out.println("No more space available, please remove an item");
        }
    }

    public double getValue() {
        double sumOfAllOrder = 0;
        for (int i = 0; i < listOfOrders.length; i++) {
            if (listOfOrders[i] != null) {
                sumOfAllOrder += (listOfOrders[i].getPriceOfProduct() * listOfOrders[i].getAmountOfProduct());
            }
        }
        return sumOfAllOrder;
    }

    public int getItemsCount() {
        int totalAmountOfAllProducts = 0;
        for (int i = 0; i < listOfOrders.length; i++) {
            if (listOfOrders[i] != null) {
                totalAmountOfAllProducts += listOfOrders[i].getAmountOfProduct();
            }
        }
        return totalAmountOfAllProducts;
    }

    public void printProducts() {
        for (int i = 0; i < listOfOrders.length; i++) {
            if (listOfOrders[i] != null) {
                System.out.println("Product: " + listOfOrders[i].getProductName()
                        + "\nPrice: " + listOfOrders[i].getPriceOfProduct() + " zł"
                        + "\nQuantity: " + listOfOrders[i].getAmountOfProduct() + " item(s)"
                        + "\nTotal Price: " + (listOfOrders[i].getAmountOfProduct() * listOfOrders[i].getPriceOfProduct() + " zł"));
            }
        }
    }

    private Product createProduct() {
        System.out.println("Enter product name: ");
        String productName = scanner.nextLine();
        System.out.println("Enter price of product: ");
        double priceOfProduct = scanner.nextDouble();
        System.out.println("Enter amount of items: ");
        int amountOfProduct = scanner.nextInt();
        scanner.nextLine();
        return new Product(productName, amountOfProduct, priceOfProduct);
    }

    private void putProductOnSpecificIndex(Product product) {
        System.out.println("At which index no. would you like to add the product? ");
        int indexOfArray = scanner.nextInt();
        scanner.nextLine();
        if (indexOfArray < 0 || indexOfArray >= listOfOrders.length) {
            System.out.println("No such index no.");
        } else if (listOfOrders[indexOfArray] != null) {
            System.out.println("Index no. already has a product");
        } else {
            listOfOrders[indexOfArray] = product;
            currentNumberOfPositionsInOrder++;
            System.out.println("Item added to order!\nYou currently have " + currentNumberOfPositionsInOrder + " item(s) in your basket.");
        }
    }

}