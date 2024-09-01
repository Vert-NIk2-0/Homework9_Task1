import MyExeption.InsufficientFundsException;

public class BankAccount {
    private double balance;

    public void withdraw(double amount) {
        if (amount > balance) {
            try {
                throw new InsufficientFundsException("У вас недостаточно средств!");
            }catch (InsufficientFundsException e) {
                System.out.println(e.getMessage());
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
