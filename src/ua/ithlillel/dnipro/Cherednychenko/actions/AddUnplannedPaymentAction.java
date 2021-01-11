package ua.ithlillel.dnipro.Cherednychenko.actions;
import ua.ithlillel.dnipro.Cherednychenko.operations.RevenueAndExpensesCalculations;
import ua.ithlillel.dnipro.Cherednychenko.operations.UnplannedOperationsGeneral;


public class AddUnplannedPaymentAction implements MenuActions {

    private RevenueAndExpensesCalculations revenueAndExpensesCalculations;

    public AddUnplannedPaymentAction( RevenueAndExpensesCalculations revenueAndExpensesCalculations) {
        this.revenueAndExpensesCalculations = revenueAndExpensesCalculations;
    }

    @Override
    public void execute(int value) {
        revenueAndExpensesCalculations.addExchangeValue(new UnplannedOperationsGeneral(value));
    }


    @Override
    public String getName() {
        return "UNPLANNED amount (with '-' expenses OR with '+' revenue)";
    }
}
