package ua.ithlillel.dnipro.Cherednychenko;

import ua.ithlillel.dnipro.Cherednychenko.actions.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RevenueAndExpensesCalculations revenueAndExpensesCalculations = new RevenueAndExpensesCalculations();

        ArrayList<PaymentOperations> paymentOperation = new ArrayList<>();
        paymentOperation.add(new EquipmentOperationsGeneral(0, "аппаратура"));
        paymentOperation.add(new PostOperations(0, "почта"));
        paymentOperation.add(new GoodsOperationsGeneral(0, "товары"));
        paymentOperation.add(new UnplannedOperations(0, "неплановые услуги"));

        Menu menu = new Menu(scanner, paymentOperation);
        menu.addAction(new PaymentAction(revenueAndExpensesCalculations));
        menu.addAction(new AddPostPaymentAction(revenueAndExpensesCalculations));
        menu.addAction(new AddGoodsPaymentAction(revenueAndExpensesCalculations));
        menu.addAction(new AddUnplannedPaymentAction(revenueAndExpensesCalculations));

        menu.run();
        new ShowResultCalculation(revenueAndExpensesCalculations).showTotalResults();

    }
}
