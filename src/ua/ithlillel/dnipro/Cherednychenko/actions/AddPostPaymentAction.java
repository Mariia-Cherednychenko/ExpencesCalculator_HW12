package ua.ithlillel.dnipro.Cherednychenko.actions;
import ua.ithlillel.dnipro.Cherednychenko.operations.PostOperationsGeneral;
import ua.ithlillel.dnipro.Cherednychenko.operations.RevenueAndExpensesCalculations;


public class AddPostPaymentAction implements MenuActions {

    private RevenueAndExpensesCalculations revenueAndExpensesCalculations;

    public AddPostPaymentAction(RevenueAndExpensesCalculations revenueAndExpensesCalculations) {
         this.revenueAndExpensesCalculations = revenueAndExpensesCalculations;
    }

    @Override
    public void execute(int value) {
        revenueAndExpensesCalculations.addExchangeValue(new PostOperationsGeneral(value));
    }


    @Override
    public String getName() {
        return "POST amount (with '-' expenses OR with '+' revenue)";
    }
}
