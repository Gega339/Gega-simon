import ge.edu.btu.service.CalculatorService;
import ge.edu.btu.service.impl.CalculatorServiceImpl;

public class Junit {

    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorServiceImpl();
        System.out.println(calculatorService.sum(4.5, 3.5));
        System.out.println(calculatorService.prod(4.5, 4.0));
    }
}
