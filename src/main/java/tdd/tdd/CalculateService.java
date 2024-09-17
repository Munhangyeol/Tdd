package tdd.tdd;

import org.springframework.stereotype.Service;

@Service
public class CalculateService {

    public double calculate(double x1,double x2,String operater){
        return switch (operater) {
            case "+" -> x1 + x2;
            case "-" -> x1 - x2;
            case "x" -> x1 * x2;
            default -> 0;
        };
    }
}
