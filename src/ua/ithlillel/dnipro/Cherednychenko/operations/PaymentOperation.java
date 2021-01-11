package ua.ithlillel.dnipro.Cherednychenko.operations;

class PaymentOperation {
    double expenses;
    double revenue;

    public PaymentOperation(double value) {
        addPaymentOperation(value);
    }

    public void addPaymentOperation(double value) {
        if (value > 0) {
            revenue = revenue + value;
        } else expenses = expenses + value;
    }

    public double getPaymentOperationResult() {
        return (expenses + revenue);
    }

    public double getExpenses() {
        return expenses;
    }

    public double getRevenue() {
        return revenue;
    }


}
