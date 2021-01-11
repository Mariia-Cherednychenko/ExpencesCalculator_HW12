package ua.ithlillel.dnipro.Cherednychenko.operations;

public interface PaymentOperations {

    void addPaymentOperation(double value);

    double getPaymentOperationResult();

    double getExpenses();

    double getRevenue();

    String getName();
}
