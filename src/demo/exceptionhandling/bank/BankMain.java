package demo.exceptionhandling.bank;

public class BankMain {
    public static void main(String[] args) {

        Bank bank = new Bank();
        System.out.println("Initial Balance : "+bank.balance());

        bank.deposit(1000);

        System.out.println("Balance after 1000 deposit :"+bank.balance());

        try {
            bank.withdraw(5000);
        }
        catch (InsufficientBalanceException e){
            e.printStackTrace();
        }
        System.out.println("Balance after 5000 withdraw :"+bank.balance());

    }
}
