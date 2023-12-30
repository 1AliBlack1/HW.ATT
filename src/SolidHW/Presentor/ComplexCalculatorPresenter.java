package SolidHW.Presentor;

import SolidHW.View.ComplexCalculatorView;
import SolidHW.Exeptions.ComplexNumber;
import SolidHW.LOG.Log;
import SolidHW.Operation.ComplexCalculatorModel;
import SolidHW.Operation.DivisionByZero;

public class ComplexCalculatorPresenter {
    private ComplexCalculatorModel model;
    private ComplexCalculatorView view;
    private Log logger;

    public ComplexCalculatorPresenter(ComplexCalculatorModel model, ComplexCalculatorView view, Log logger) {
        this.model = model;
        this.view = view;
        this.logger = logger;
    }

    public void performCalculation(ComplexNumber num1, ComplexNumber num2, int operation) {
        try {
            ComplexNumber result = null;
            switch (operation) {
                case 1:
                    result = model.add(num1, num2);
                    break;
                case 2:
                    result = model.multiply(num1, num2);
                    break;
                case 3:
                    result = model.divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operation");
                    break;
            }

            if (result != null) {
                view.printResult(result);
                logger.writeFile("Calculation result: " + result.getReal() + " + " + result.getImaginary() + "i", "calculation_log.txt");
            }
        } catch (DivisionByZero e) {
            System.out.println("Error: " + e.getMessage());
            logger.writeFile("Error: " + e.getMessage(), "calculation_log.txt");
        }
    }
}
