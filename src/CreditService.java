public class CreditService {
    public long calculate(double amount, double months, double percent) {
        double monthlyPercent = percent / 100 / 12;
        double monthlyPayment = amount * ((monthlyPercent) * (Math.pow(1 + monthlyPercent, months)) /
                ((Math.pow(1 + monthlyPercent, months)) - 1));
        long monthlyPaymentRound = Math.round(monthlyPayment);
        return monthlyPaymentRound;
    }
}