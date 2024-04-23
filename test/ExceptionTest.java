import com.hit.api.MyCodeEnum;
import com.hit.api.MyException;
import org.junit.Test;

import java.io.FileNotFoundException;

public class ExceptionTest {
    @Test
    public void demo1() {
        try {
            System.out.println(1 / 0);
        } catch (Exception e) {
            System.out.println("Try divide by zero!");
        } finally {
            System.out.println("Running successfully.");
        }
    }

    @Test
    public void demo2() {
        int[] arr = null;
        System.out.println(arr[0]);
    }

    @Test
    public void demo3() throws FileNotFoundException {
        if (1 != 0) {
            throw new FileNotFoundException("Exception test occur！");
        }
        System.out.println("Exception test pass!");
    }

    public int sum(int a, int b) throws MyException {
        if (a > 10 || b > 10 || a < 10 || b < 10) {
            throw new MyException(MyCodeEnum.NOT_FOUND_FILE);
        }
        return a + b;
    }

    @Test
    public void demo4(){
       try{
          int result = sum(10,12);
       }catch (MyException e){
           e.printStackTrace();
       }finally {
           System.out.println("Finish sum.");
       }
    }
}
