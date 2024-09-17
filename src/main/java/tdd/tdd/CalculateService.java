package tdd.tdd;

import org.springframework.stereotype.Service;

@Service
public class CalculateService {

    public double calculate(double x1,double x2,String operater){
        switch (operater) {
            case "+":
                return x1+x2;
            case "-":
                return x1-x2;
            default:
                return 0;
        }

    }
}
