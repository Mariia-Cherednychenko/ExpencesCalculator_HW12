package ua.ithlillel.dnipro.Cherednychenko.actions;

public class PaymentAction implements MenuActions {

    private RevenueAndExpensesCalculations revenueAndExpensesCalculations;

    public PaymentAction(RevenueAndExpensesCalculations revenueAndExpensesCalculations) {
        this.revenueAndExpensesCalculations = revenueAndExpensesCalculations;
    }

    @Override
    public void execute(int value) {
        revenueAndExpensesCalculations.addExchangeValue(new EquipmentOperationsGeneral(value));
    }


    @Override
    public String getName() {
        return "EQUIPMENT amount (with '-' expenses OR with '+' revenue)";
    }

}
