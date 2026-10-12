public class InvestmentTracker {

    // Task 3 The Financial Calculator

    // Task 3.1 Define variables

    double principal;
    double interestRate;
    int years;

    // Constructor

    public InvestmentTracker(double p, double r, int y) {
        principal = p;
        interestRate = r;
        years = y;

    }

    // Task 3.2

    public double calculateTotal() {

        double total = principal *
                Math.pow(1 + interestRate / 100, years);

        return total;
    }

    // Task 3.3 JavaDoc Comment

    /**
     * Calculates the future value of an investment
     * using the compound interest formula.
     *
     * Total = Principal * (1 + Rate / 100)^Years
     *
     * Author: Левківський Микола
     *
     * @return the future investment value
     */

    // Task 3.4 Main Method

    public static void main(String[] args) {

        InvestmentTracker investment =
                new InvestmentTracker(1000, 5, 10);

        double result = investment.calculateTotal();

        System.out.printf("Final Amount: $%.2f%n", result);
    }

}
