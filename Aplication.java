public class Aplication {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setBalance(1000);
        bank.setRate(10);
        System.out.println(bank.calculateInterest());
    }
}
