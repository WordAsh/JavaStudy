import org.junit.Assert;
import org.junit.Test;

public class StringTest {
    @Test
    public void StringBuilderTest(){
        StringBuilder stringBuilder = new StringBuilder(10);
        stringBuilder.append("Hello");
        stringBuilder.append(" World!");
        stringBuilder.insert(0,"Yo! ");
        Assert.assertEquals("Yo! Hello World!",stringBuilder.toString());
    }

    @Test
    public void StringBufferTest(){
        StringBuffer stringBuffer = new StringBuffer(10);
        stringBuffer.append("abc");
        stringBuffer.reverse();
        Assert.assertEquals("cba",stringBuffer.toString());
    }
}
