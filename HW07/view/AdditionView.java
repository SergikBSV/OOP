package view;

import java.util.logging.Logger;

public class AdditionView implements CalculatorView{
    Logger logger = Logger.getLogger(AdditionView.class.getName());
    @Override
    public void sendOnConsole(double numberFirst, double numberSecond, double res) {
        logger.info(numberFirst + " + " + numberSecond + " = " + res);
    }
}
