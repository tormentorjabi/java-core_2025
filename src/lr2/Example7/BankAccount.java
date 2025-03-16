package lr2.Example7;

public class BankAccount implements BankOperations {
    private String accountNumber;
    private String accountHolder;
    private double balance;


    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Пополнение: " + amount);
        } else {
            System.out.println("Пополнение не может быть 0 или меньше!");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Снятие: " + amount);
        } else {
            System.out.println("Неверная сумма вывода или недостаточно средств!");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    // Дополнительный метод для вывода информации о счёте
    public void displayAccountInfo() {
        System.out.println("Номер аккаунта: " + accountNumber);
        System.out.println("Владелец аккаунта: " + accountHolder);
        System.out.println("Текущий баланс: " + balance);
    }
}