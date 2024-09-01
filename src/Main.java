public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(1000);
        bankAccount.withdraw(500);
        bankAccount.checkBalance();
        bankAccount.withdraw(1000);
        bankAccount.checkBalance();
        bankAccount.withdraw(500);
        bankAccount.checkBalance();
    }
}