class BankAccount {
    String owner;
    double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void display() {
        System.out.println("Owner: " + owner + ", Balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Eishita", 1000);
        acc.deposit(500);
        acc.withdraw(200);
        acc.display();
    }
}
