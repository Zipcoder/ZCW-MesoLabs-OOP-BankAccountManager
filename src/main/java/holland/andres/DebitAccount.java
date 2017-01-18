package holland.andres;

public class DebitAccount {

    public boolean debit (Account account, double amount) {
        String status = account.getAccountStatus();
        boolean overdraft = account.getOverdraftProtection();
        double balance = account.getAccountBalance();
        if (status.equalsIgnoreCase("open") &&
                !overdraft) {
            account.setAccountBalance(balance - amount);
            return true;
        }
        else if (status.equalsIgnoreCase("open") && amount < balance) {
            account.setAccountBalance(balance - amount);
            return true;
        }
        return false;
    }
}
