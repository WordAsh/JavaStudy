import org.junit.Test;

import java.io.File;

public class FileTest {
    @Test
    public void test1(){
        File dir = new File("E:\\coding\\java_learn\\learn\\src\\com\\hit\\oop");
        System.out.println(dir.canExecute());
        System.out.println(dir.isFile());
        System.out.println(dir.isDirectory());
        System.out.println(dir.getParent());

        for (File file:
             dir.listFiles()) {
            System.out.println(file.getName());
        }
    }
}
