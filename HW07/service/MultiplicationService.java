package service;

public class MultiplicationService implements CalculatorService{

    @Override
    public double computationalAction(double numberFirst, double numberSecond) {
        return numberFirst*numberSecond;
    }
}
