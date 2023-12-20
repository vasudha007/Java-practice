package demo.exceptionhandling.bank;

public class Bank {

    double balance;

    public double balance(){
        return balance;
    }

    public double deposit(double deposit){
        balance = deposit + balance;
        return balance;
    }

    public double withdraw(double withdraw) throws InsufficientBalanceException {
        if(balance > withdraw) {
            balance = balance - withdraw;
        }
        else{
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        return balance;
    }
}
