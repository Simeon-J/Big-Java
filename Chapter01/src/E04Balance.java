public class E04Balance {

    public static void main(String[] args) {
        double balance = 1000.00;
        int month = 1;
        double interest = 0.05;

        while (month < 4) {

            if (month == 1) {
                System.out.println("Balance for month " + month + " is $" + balance);
            } else {
                balance = balance + (balance * interest);
                System.out.println("Balance for month " + month + " is $" + balance);}
            month++;
        }
    }
}
