package DesignPrinciples.DependencyInversionPrinciple;

// Client Class

public class Main {
    public static void main(String[] args) {
        // Using MySQL Implementation
        Database mysqlDatabase = new MySQL();
        BudgetReport budgetReportWithMySQL = new BudgetReport(mysqlDatabase);
        System.out.println("--- Budget Report with MySQL ---");
        budgetReportWithMySQL.save();

        System.out.println("\n--- Switching to MongoDB ---");

        // Using MongoDB Implementation
        Database mongodbDatabase = new MongoDB();
        BudgetReport budgetReportWithMongoDB = new BudgetReport(mongodbDatabase);
        System.out.println("--- Budget Report with MongoDB ---");
        budgetReportWithMongoDB.save();
    }
}
