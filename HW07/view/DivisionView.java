package view;

import java.util.logging.Logger;

public class DivisionView implements CalculatorView{
    Logger logger = Logger.getLogger(DivisionView.class.getName());
    @Override
    public void sendOnConsole(double numberFirst, double numberSecond, double res) {
        logger.info(numberFirst + " : " + numberSecond + " = " + res);
    }
}
