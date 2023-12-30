package SolidHW.View;

import SolidHW.Exeptions.ComplexNumber;

public class ComplexCalculatorView {
    public void printResult(ComplexNumber result) {
        System.out.println("Result: " + result.getReal() + " + " + result.getImaginary() + "i");
    }
}
