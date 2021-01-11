package ua.ithlillel.dnipro.Cherednychenko.actions;
import ua.ithlillel.dnipro.Cherednychenko.operations.EquipmentOperationsGeneral;
import ua.ithlillel.dnipro.Cherednychenko.operations.RevenueAndExpensesCalculations;

public class AddEquipmentPaymentAction implements MenuActions {

    private RevenueAndExpensesCalculations revenueAndExpensesCalculations;

    public AddEquipmentPaymentAction(RevenueAndExpensesCalculations revenueAndExpensesCalculations) {
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
