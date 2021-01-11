package ua.ithlillel.dnipro.Cherednychenko.operations;


abstract class GeneralPaymentOperations implements PaymentOperations {
    double expenses;
    double revenue;
    String name;

    public GeneralPaymentOperations(double value, String name) {
        addPaymentOperation(value);
        this.name=name;
    }

    public void addPaymentOperation(double value){
        if (value>0) {revenue = revenue+value;}
        else expenses = expenses +value;
    }

    public double getPaymentOperationResult(){
        return (expenses + revenue);
    }

    public double getExpenses(){
        return expenses;
    }

    public double getRevenue(){
        return revenue;
    }

    public String getName(){
        return name;
    }
}
