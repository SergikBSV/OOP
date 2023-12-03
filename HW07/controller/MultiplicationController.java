package controller;

import service.MultiplicationService;
import view.MultiplicationView;

public class MultiplicationController implements CalculatorController{
    private double res;
    private final MultiplicationService multiplicationService = new MultiplicationService();
    private final MultiplicationView multiplicationView = new MultiplicationView();
    @Override
    public void computationalAction(double numberFirst, double nuberSecond) {
        this.res = multiplicationService.computationalAction(numberFirst,nuberSecond);
        multiplicationView.sendOnConsole(numberFirst,nuberSecond,res);
    }
}
