package controller;

import service.AdditionService;
import view.AdditionView;

public class AdditionController implements CalculatorController{
    private double res;

    private final AdditionService additionService = new AdditionService();
    private final AdditionView additionView = new AdditionView();

    public double getRes() {
        return res;
    }

    @Override
    public void computationalAction(double numberFirst, double nuberSecond) {
        this.res = additionService.computationalAction(numberFirst,nuberSecond);
        additionView.sendOnConsole(numberFirst,nuberSecond,res);
    }
}
