import controller.AdditionController;
import controller.DivisionController;
import controller.MultiplicationController;
import data.Number;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Number number1 = new Number(25.5d);
        Number number2 = new Number(25.567457d);

        AdditionController additionController = new AdditionController();
        DivisionController divisionController = new DivisionController();
        MultiplicationController multiplicationController = new MultiplicationController();
        additionController.computationalAction(number1.getNumber(),number2.getNumber());
        divisionController.computationalAction(number1.getNumber(),number2.getNumber());
        multiplicationController.computationalAction(number1.getNumber(),number2.getNumber());

    }
}