package DataStructures_and_Alogorithm.Codes;
public class InvestmentGrowth {

    public static double projectFutureValue(double startingAmount, double annualGrowthRate, int durationYears) {

        if (durationYears == 0) {
            return startingAmount;
        }

        return projectFutureValue(
                startingAmount * (1 + annualGrowthRate),
                annualGrowthRate,
                durationYears - 1);
    }

    public static void main(String[] args) {

        double initialAmount = 10000;
        double annualGrowthRate = 0.10;
        int durationYears = 5;

        double projectedValue = projectFutureValue(initialAmount, annualGrowthRate, durationYears);

        System.out.println("Present Value: " + initialAmount);
        System.out.println("Growth Rate: " + (annualGrowthRate * 100) + "%");
        System.out.println("Years: " + durationYears);
        System.out.println("Predicted Future Value: " + projectedValue);
    }
}