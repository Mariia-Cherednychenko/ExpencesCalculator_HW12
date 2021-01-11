package ua.ithlillel.dnipro.Cherednychenko.operations;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class RevenueAndExpensesCalculations {
    List<GeneralPaymentOperations> paymentOperations = new LinkedList<>();

    public void addExchangeValue (GeneralPaymentOperations operation){
        paymentOperations.add(operation);
    }

    public double getOperationTotalResult(){
       double result =  paymentOperations.stream()
               .map (paymentOperation -> paymentOperation.getPaymentOperationResult())
               .reduce((paymentOperationsPrev,paymentOperationsNext)->paymentOperationsPrev+paymentOperationsNext)
               .get();
       return result;
    }

    public double getExpensesTotalResult(){
        double result =  paymentOperations.stream()
                .map (paymentOperation -> paymentOperation.getExpenses())
                .reduce((paymentOperationsPrev,paymentOperationsNext)->paymentOperationsPrev+paymentOperationsNext)
                .get();
        return result;
    }

    public String getExpensesByKinds(){
        String result = paymentOperations.stream()
                .filter (paymentOperation -> paymentOperation.getExpenses()<0)
                .map(paymentOperation ->
                        String.format("expenses on %s: %.2f",
                        paymentOperation.getName(),
                        paymentOperation.getExpenses()))
                .collect(Collectors.joining("\n  "));
        return result;
    }

    public double getRevenueTotalResult (){
        double result =  paymentOperations.stream()
                .map (paymentOperation -> paymentOperation.getRevenue())
                .reduce((paymentOperationsPrev,paymentOperationsNext)->paymentOperationsPrev+paymentOperationsNext)
                .get();
        return result;
    }

    public String getRevenueByKinds (){
        String result = paymentOperations.stream()
                .filter (paymentOperation -> paymentOperation.getRevenue()>0)
                .map(paymentOperation ->
                        String.format("revenue on %s: %.2f",
                                paymentOperation.getName(),
                                paymentOperation.getExpenses()))
                .collect(Collectors.joining("\n  "));
        return result;
    }


}


