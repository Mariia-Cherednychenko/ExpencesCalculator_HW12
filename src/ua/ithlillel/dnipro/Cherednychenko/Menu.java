package ua.ithlillel.dnipro.Cherednychenko;
import ua.ithlillel.dnipro.Cherednychenko.actions.MenuActions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Menu {
    private MenuActions[] actions;
    private Scanner scanner;
    ArrayList<PaymentOperations> paymentOperation;

    public Menu(Scanner scanner,ArrayList<PaymentOperations> paymentOperation) {
        this.actions = new MenuActions[0];
        this.scanner = scanner;
        this.paymentOperation =paymentOperation;
    }

    public void addAction(MenuActions action)  {
        actions = Arrays.copyOf(actions, actions.length+1);
        actions[actions.length-1]=action;
    }

    public void run() {
        showMenu();

        while (true) {

            while (true) {
                String temp = scanner.nextLine();

                if (checkMenuActionIndex(temp)) {

                }


                if (temp.equals("END")) {
                    break;
                }
                executeAction(temp);
            }

            if (actions.length == 0) {
                System.out.println("Incorrect input");
                continue;
            }
            break;
        }
    }

    private boolean checkMenuActionIndex(String temp) {
        boolean result=true;
        int actionNumber = Integer.valueOf(temp);
        if (actionNumber>0 && actionNumber<5){
            actionNumber.
        }

    }


    private void showMenu() {
        for (int i=0; i<actions.length; i++){
            System.out.printf("%s - %d\n", paymentOperation.get(i).getName(),i+1);

        System.out.println("Введите порядковый номер, затем нажмите ENTER, затем сумму  (с минусом - если расход, с плсом - если доход). " +
                "\nДля завершения ввода - нажмите END");
    }

    private void executeAction (String input){
        String inputPattern = "^([+-]*\\d+)\\s*-\\s*([1-4])+";
        Pattern pattern = Pattern.compile(inputPattern);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            actions[Integer.valueOf(matcher.group(2))-1].execute(Integer.valueOf(matcher.group(1)));
        }
    }

}
