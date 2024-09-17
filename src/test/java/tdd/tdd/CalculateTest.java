package tdd.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static java.lang.Math.random;

@SpringBootTest
public class CalculateTest {
    @Autowired
    public CalculateService calculateService;
    private double x1;
    private double x2;
    @Test
    public void plusTest(){
        //given
        x1=random();
        x2=random();
        //when,then
       Assertions.assertEquals(calculateService.calculate(x1, x2, "+"),x1+x2);
    }
    @Test
    public void minusTest(){
       //given
        x1=random();
        x2=random();
        //when,then
        Assertions.assertEquals(calculateService.calculate(x1, x2, "-"),x1-x2);
    }
}
