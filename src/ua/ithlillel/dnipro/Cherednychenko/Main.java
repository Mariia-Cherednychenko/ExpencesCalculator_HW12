package ua.ithlillel.dnipro.Cherednychenko;


import ua.ithlillel.dnipro.Cherednychenko.operations.PaymentOperationAnalyser;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PaymentOperationAnalyser paymentOperationAnalyser = new PaymentOperationAnalyser();

        /*paymentOperationAnalyser.addOperation(-700, "закупка аппаратуры");
        paymentOperationAnalyser.addOperation(-150, "услуги почты");
        paymentOperationAnalyser.addOperation(+2000, "продажа товара");
        paymentOperationAnalyser.addOperation(-200, "услуги почты");
        paymentOperationAnalyser.addOperation(-100, "неплановые расходы");
        paymentOperationAnalyser.addOperation(+7525, "продажа товара");*/

        Menu menu = new Menu(scanner,paymentOperationAnalyser);
        menu.run();



    }
}
