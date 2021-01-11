package ua.ithlillel.dnipro.Cherednychenko;

import ua.ithlillel.dnipro.Cherednychenko.operations.PaymentOperationAnalyser;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Menu {
    private Scanner scanner;
    PaymentOperationAnalyser paymentOperationAnalyser;

    public Menu(Scanner scanner, PaymentOperationAnalyser paymentOperationAnalyser) {
        this.scanner = scanner;
        this.paymentOperationAnalyser =paymentOperationAnalyser;
    }


    public void run() {
        showProgramTerms();

        while (true) {
                String temp = scanner.nextLine();

                if (temp.equals("END")) {break;}

                if (!executeAction(temp)){
                   System.out.println("Возможно введены неправильные значения.Попробуйте еще раз.");
                   continue;
               }
            }
        showResults();
    }

    private void showResults() {
        System.out.printf("\nОбщий доход : %.2f\n",paymentOperationAnalyser.getOperationTotalResult());
        System.out.printf("\nРасходы составляют %.2f из которых: \n  %s\n",
                paymentOperationAnalyser.getExpensesTotalResult(),
                paymentOperationAnalyser.getExpensesByKinds());

        System.out.printf("\nДоходы составляют %.2f из которых: \n  %s\n",
                paymentOperationAnalyser.getRevenueTotalResult(),
                paymentOperationAnalyser.getRevenueByKinds());
    }

    private void showProgramTerms() {
        System.out.println("Введите сумму  (с минусом - если расход, с плсом - если доход), затем введите название операции " +
                "\nДля завершения ввода - нажмите END");
    }

    private boolean executeAction (String input){
        String inputPattern = "^([+-]*\\d+)[\\s,-]+(\\D+)";
        Pattern pattern = Pattern.compile(inputPattern);
        Matcher matcher = pattern.matcher(input);

        int i=0;
        while (matcher.find()) {
            i++;
            paymentOperationAnalyser.addOperation(Double.valueOf(matcher.group(1)),matcher.group(2));
        }
        if (i>0) return true;
        else return false;
    }

}
