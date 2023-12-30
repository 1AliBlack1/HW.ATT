package SolidHW.Exeptions;

import SolidHW.Operation.ComplexCalculatorModel;
import SolidHW.Operation.DivisionByZero;

public class ComplexCalculator implements ComplexCalculatorModel {
    @Override
    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        return new ComplexNumber(num1.getReal() + num2.getReal(), num1.getImaginary() + num2.getImaginary());
    }

    @Override
    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        double realPart = num1.getReal() * num2.getReal() - num1.getImaginary() * num2.getImaginary();
        double imagPart = num1.getReal() * num2.getImaginary() + num1.getImaginary() * num2.getReal();
        return new ComplexNumber(realPart, imagPart);
    }

    @Override
    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) throws DivisionByZero {
        double denominator = num2.getReal() * num2.getReal() + num2.getImaginary() * num2.getImaginary();
        if (denominator == 0) {
            throw new DivisionByZero("Division by zero is not allowed");
        }
        double realPart = (num1.getReal() * num2.getReal() + num1.getImaginary() * num2.getImaginary()) / denominator;
        double imagPart = (num1.getImaginary() * num2.getReal() - num1.getReal() * num2.getImaginary()) / denominator;
        return new ComplexNumber(realPart, imagPart);
    }
}
