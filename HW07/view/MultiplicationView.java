package view;

import java.util.logging.Logger;

public class MultiplicationView implements CalculatorView{
    Logger logger = Logger.getLogger(MultiplicationView.class.getName());
    @Override
    public void sendOnConsole(double numberFirst, double numberSecond, double res) {
        logger.info(numberFirst + " * " + numberSecond + " = " + res);
    }
}
