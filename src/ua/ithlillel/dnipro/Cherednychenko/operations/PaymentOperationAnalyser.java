package ua.ithlillel.dnipro.Cherednychenko.operations;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class PaymentOperationAnalyser {
    Map<String, PaymentOperation> operations = new HashMap<>();

    public void addOperation (double value, String description){
        if (operations.containsKey(description)){operations.get(description).addPaymentOperation(value);}
        else operations.put(description,new PaymentOperation(value));
    }

    public double getOperationTotalResult(){
        double result =  operations.entrySet().stream()
                .map (paymentOperation -> paymentOperation.getValue().getPaymentOperationResult())
                .reduce((paymentOperationsPrev,paymentOperationsNext)->
                        paymentOperationsPrev+paymentOperationsNext)
                .get();
        return result;
    }

    public double getExpensesTotalResult(){
        double result =  operations.entrySet().stream()
                .map (paymentOperation -> paymentOperation.getValue().getExpenses())
                .reduce((paymentOperationsPrev,paymentOperationsNext)->paymentOperationsPrev+paymentOperationsNext)
                .get();
        return Math.abs(result);
    }

    public String getExpensesByKinds(){
        String result =  operations.entrySet().stream()
                .filter (paymentOperation -> paymentOperation.getValue().getExpenses()<0)
                .map(paymentOperation ->
                        String.format("%s: %.2f",
                                paymentOperation.getKey(),
                                Math.abs(paymentOperation.getValue().getExpenses())))
                .collect(Collectors.joining("\n  "));
        return result;
    }

    public double getRevenueTotalResult (){
        double result =   operations.entrySet().stream()
                .map (paymentOperation -> paymentOperation.getValue().getRevenue())
                .reduce((paymentOperationsPrev,paymentOperationsNext)->paymentOperationsPrev+paymentOperationsNext)
                .get();
        return result;
    }

    public String getRevenueByKinds (){
        String result =  operations.entrySet().stream()
                .filter (paymentOperation -> paymentOperation.getValue().getRevenue()>0)
                .map(paymentOperation ->
                        String.format("%s: %.2f",
                                paymentOperation.getKey(),
                                paymentOperation.getValue().getRevenue()))
                .collect(Collectors.joining("\n  "));
        return result;
    }

 }
