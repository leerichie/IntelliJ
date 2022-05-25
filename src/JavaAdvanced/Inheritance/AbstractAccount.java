package JavaAdvanced.Inheritance;

abstract class AbstractAccount {
    public final int number;

    protected double balance; // never use double for currencies, use BigDecimal instead}

    AbstractAccount(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public int getNumber() {
        return number;
    }

    abstract void withdraw(double amount);

}

class Account extends AbstractAccount {

    Account(int number) {
        super(number);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException();
        }
        balance -= amount;
    }
}

class DebitAccount extends AbstractAccount {

    private final double maxDebit;

    DebitAccount(int number, double maxDebit) {
        super(number);
        this.maxDebit = maxDebit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance + maxDebit) {
            throw new IllegalArgumentException();
        }
        balance -= amount;
    }
}

class AccountsHierarchy {
    public static void main(String[] args) {
        AbstractAccount account = new DebitAccount(1234, 10);
        account.withdraw(10);
        System.out.println(account.getBalance());
    }
}