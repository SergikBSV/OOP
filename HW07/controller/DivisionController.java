package controller;

import service.DivisionService;
import view.DivisionView;

public class DivisionController implements CalculatorController{
    private double res;
    private final DivisionService divisionService = new DivisionService();
    private final DivisionView divisionView = new DivisionView();

    public double getRes() {
        return res;
    }

    @Override
    public void computationalAction(double numberFirst, double nuberSecond) {
        this.res = divisionService.computationalAction(numberFirst,nuberSecond);
        divisionView.sendOnConsole(numberFirst,nuberSecond,res);
    }
}
