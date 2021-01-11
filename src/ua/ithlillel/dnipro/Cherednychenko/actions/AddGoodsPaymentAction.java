package ua.ithlillel.dnipro.Cherednychenko.actions;
import ua.ithlillel.dnipro.Cherednychenko.operations.GoodsOperationsGeneral;
import ua.ithlillel.dnipro.Cherednychenko.operations.RevenueAndExpensesCalculations;

public class AddGoodsPaymentAction implements MenuActions {

    private RevenueAndExpensesCalculations revenueAndExpensesCalculations;

    public AddGoodsPaymentAction(RevenueAndExpensesCalculations revenueAndExpensesCalculations) {
        this.revenueAndExpensesCalculations = revenueAndExpensesCalculations;
    }

    @Override
    public void execute(int value) {
       revenueAndExpensesCalculations.addExchangeValue(new GoodsOperationsGeneral(value));
    }


    @Override
    public String getName() {
        return "GOODS amount (with '-' expenses OR with '+' revenue)";
    }
}
