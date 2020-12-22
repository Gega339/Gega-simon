package ge.edu.btu.service.impl;

import ge.edu.btu.service.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public double sum(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    public double prod(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }
}
