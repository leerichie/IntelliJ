package JavaAdvanced;

class Account {
    public final int number;
    public Account(int number) {
        this.number = number;
    }

    private double balance; // never use double for currencies, use -> BigDecimal

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException();
        }
        this.balance = balance;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Account a = new Account(121212);
        a.setBalance(1234);
//        a.number = 7;

//        a.setBalance(-1234);
        System.out.println(a.getBalance());

    }

}