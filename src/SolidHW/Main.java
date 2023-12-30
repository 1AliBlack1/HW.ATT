package SolidHW;

import SolidHW.Exeptions.ComplexCalculator;
import SolidHW.Exeptions.ComplexNumber;
import SolidHW.LOG.Log;
import SolidHW.LOG.LogTXT;
import SolidHW.Operation.ComplexCalculatorModel;
import SolidHW.Presentor.ComplexCalculatorPresenter;
import SolidHW.View.ComplexCalculatorView;

public class Main {
    public static void main(String[] args) {
        ComplexCalculatorModel model = new ComplexCalculator();
        ComplexCalculatorView view = new ComplexCalculatorView();
        Log logger = new LogTXT();

        ComplexCalculatorPresenter presenter = new ComplexCalculatorPresenter(model, view, logger);

        ComplexNumber num1 = new ComplexNumber(2, 3);
        ComplexNumber num2 = new ComplexNumber(1, -2);
    }
}
