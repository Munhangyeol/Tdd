package tdd.tdd;

import org.springframework.stereotype.Service;

@Service
public class CalculateService {

    public double calculate(double x1,double x2,String operater){
        if(operater.equals("+"))
            return x1+x2;
        return 0;
    }
}
