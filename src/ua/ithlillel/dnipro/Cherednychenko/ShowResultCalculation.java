package ua.ithlillel.dnipro.Cherednychenko;

import ua.ithlillel.dnipro.Cherednychenko.operations.RevenueAndExpensesCalculations;


public class ShowResultCalculation {

    private RevenueAndExpensesCalculations revenueAndExpensesCalculations;

    public ShowResultCalculation(RevenueAndExpensesCalculations revenueAndExpensesCalculations) {
        this.revenueAndExpensesCalculations = revenueAndExpensesCalculations;
    }


    public void showTotalResults() {
        System.out.printf("Total income is %.2f \n",
                revenueAndExpensesCalculations.getOperationTotalResult());

        showTotalExpenses();

        showTotalRevenue();



    }

    private void showTotalRevenue() {
        double totalRevenue = revenueAndExpensesCalculations.getRevenueTotalResult();
        if(totalRevenue!=0) {
            System.out.printf("Total revenue is %.2f of which \n  %s\n",
                    totalRevenue,
                    revenueAndExpensesCalculations.getRevenueByKinds());
        }
        else {
            System.out.println("Total revenue is 0");
        }
    }

    private void showTotalExpenses() {
        double totalExpenses = revenueAndExpensesCalculations.getExpensesTotalResult();
        if (totalExpenses!=0){
            System.out.printf("Total exchanges is %.2f of which \n  %s\n",
                    totalExpenses,
                    revenueAndExpensesCalculations.getExpensesByKinds());
        }
        else {
            System.out.println("Total exchanges is 0");
        }
    }

}
