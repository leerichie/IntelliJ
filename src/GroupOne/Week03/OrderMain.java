package GroupOne.Week03;


import java.util.Scanner;

public class OrderMain {
    public static void main(String[] args) {
        runApp();

    }
    private static void runApp(){
        Order order = new Order();
        Scanner scanner = new Scanner(System.in);
        int chosenOption;
        System.out.println("Choose an option:");
        do {
            System.out.println("0 - Finish order");
            System.out.println("1 - Add item");
            System.out.println("2 - Display total price of order");
            System.out.println("3 - Display amount of items in your order");
            System.out.println("4 - Display order\n");
            chosenOption = scanner.nextInt();
            scanner.nextLine();
            switch (chosenOption){
                case 1:
                    order.addItem();
                    break;
                case 2:
                    System.out.println(order.getValue());
                    break;
                case 3:
                    System.out.println(order.getItemsCount());
                    break;
                case 4:
                    order.printProducts();
                    break;
                default:
                    if(chosenOption != 0){
                        System.out.println("Invalid choice");
                    }
                    break;
            }
        }while (chosenOption != 0);
    }
}