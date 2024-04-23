import org.junit.Assert;
import org.junit.Test;
import com.hit.api.Calc;

import java.util.concurrent.ThreadLocalRandom;

public class CalcTest {
    @Test
    public void add_test(){
        int num1 = ThreadLocalRandom.current().nextInt(0,100);
        int num2 = ThreadLocalRandom.current().nextInt(0,100);
        int result = Calc.add(num1,num2);

        Assert.assertEquals(num1+num2,result);
    }

    @Test
    public void sub_test(){
        int num1 = ThreadLocalRandom.current().nextInt(0,100);
        int num2 = ThreadLocalRandom.current().nextInt(0,100);
        int result = Calc.sub(num1,num2);

        Assert.assertEquals(num1-num2,result);
    }

    @Test
    public void mul_test(){
        int num1 = ThreadLocalRandom.current().nextInt(0,100);
        int num2 = ThreadLocalRandom.current().nextInt(0,100);
        int result = Calc.mul(num1,num2);

        Assert.assertEquals(num1 * num2,result);
    }

    @Test
    public void div_test(){
        int num1 = ThreadLocalRandom.current().nextInt(0,100);
        int num2 = ThreadLocalRandom.current().nextInt(0,100);
        int result = Calc.div(num1,num2);

        Assert.assertEquals(num1 / num2,result);
    }
}
