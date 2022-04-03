package GroupOne.Week02;

import java.util.Scanner;


public class BookPrintOut {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Book[] arrayOfBooks = new Book[2];

        for (int i = 0; i < arrayOfBooks.length; i++) {
            System.out.println("whats the author? ");
            String author = scanner.nextLine();
            System.out.println("whats the title: ");
            String title = scanner.nextLine();
            System.out.println("whats the price? ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            arrayOfBooks[i] = new Book(author, title, price);
        }

        for (int i = 0; i<arrayOfBooks.length; i++){
            System.out.println("Author: " + arrayOfBooks[i].author);
            System.out.println("Title: " + arrayOfBooks[i].title);
            System.out.println("Price: " + arrayOfBooks[i].price + "zł");

            if (arrayOfBooks[i].price > 500) {
                System.out.println(arrayOfBooks[i].price + "zł - that's hugely expensive!");
            } else if (arrayOfBooks[i].price < 100) {
                System.out.println(arrayOfBooks[i].price + "zł - that's a great price!");
            } else {
                System.out.println(arrayOfBooks[i].price + "zł - that's a reasonable price");
            }

            }
        }
    }