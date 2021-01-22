public class Main {
    public static void main(String[] args) {
        CreditService service = new CreditService();
        long monthlyPaymentForOneYearLoan = service.calculate(1000_000, 12, 9.99);
        System.out.println(monthlyPaymentForOneYearLoan);

        long monthlyPaymentForTwoYearsLoan = service.calculate(1000_000, 24, 9.99);
        System.out.println(monthlyPaymentForTwoYearsLoan);

        long monthlyPaymentForTreeYearsLoan = service.calculate(1000_000, 36, 9.99);
        System.out.println(monthlyPaymentForTreeYearsLoan);
    }
}
