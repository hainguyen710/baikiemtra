public class Bank {
    private static double balance;
    private static double rate;


    public Bank() {
        this.balance = balance;
        this.rate = rate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double calculateInterest(){
        double interest;
        return interest = balance*(rate/1200);
    }
}
