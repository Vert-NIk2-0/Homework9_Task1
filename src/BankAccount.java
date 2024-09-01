import MyExeption.InsufficientFundsException;

public class BankAccount {
    private double balance;

    public void withdraw(double amount) {
        if (amount > balance) {
            try {
                throw new InsufficientFundsException();
            }catch (InsufficientFundsException e) {
                System.out.println("У вас недостаточно средств!");
            }
        }else {
            balance -= amount;
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void checkBalance() {
        System.out.printf("Ваш баланс = $%.2f\n", balance);
    }
}
