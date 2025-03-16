package lr2.Example7;

public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("000111", ",Богдан", 30000.0);


        account1.displayAccountInfo();


        account1.deposit(15000.0);


        account1.withdraw(2500.0);


        System.out.println("Текущий баланс: " + account1.getBalance());
    }
}