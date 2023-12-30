package SolidHW.Operation;

import SolidHW.Exeptions.ComplexNumber;

public interface ComplexCalculatorModel {
    ComplexNumber add(ComplexNumber num1, ComplexNumber num2);
    ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2);
    ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) throws DivisionByZero;
}
