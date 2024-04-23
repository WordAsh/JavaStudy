import org.junit.Test;

import java.io.*;

public class IOStreamTest {
    @Test
    public void test1() throws IOException {
        File file = new File("file\\1.txt");
        FileInputStream fileInputStream = new FileInputStream(file);

        int fileRead = 0;
        while(fileRead != -1){
            fileRead = fileInputStream.read();
            System.out.print((char)fileRead);
        }
        fileInputStream.close();
    }

    @Test
    public void test2() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(new File("file/2.txt"));
        byte[] bytes = "Hello World!".getBytes();
        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }

    @Test
    public void test3() throws IOException{
        FileInputStream fileInputStream = new FileInputStream(new File("file/pic1.jpg"));
        FileOutputStream fileOutputStream = new FileOutputStream(new File("file/pic2.jpg"));

        byte[] buff = new byte[1024];
        int copyTrans;

        while((copyTrans = fileInputStream.read(buff)) != -1){
            fileOutputStream.write(buff);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

    @Test
    public void test4() throws IOException{
        FileInputStream fileInputStream = new FileInputStream(new File("file/1.txt"));
        FileOutputStream fileOutputStream = new FileOutputStream(new File("file/3.txt"));

        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        int by;
        while((by = bufferedInputStream.read()) != -1){
            bufferedOutputStream.write(by);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }

    @Test
    public void test5() throws IOException{
        FileReader fileReader = new FileReader("file/1.txt");
        int by;
        while((by = fileReader.read()) != -1){
            System.out.print((char)by);
        }
        fileReader.close();
    }

    @Test
    public void test6() throws IOException{
        FileWriter fileWriter = new FileWriter("file/4.txt");
        fileWriter.write("Go ahead!");
        fileWriter.close();
    }

    @Test
    public void test7() throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new FileReader("file/1.txt"));
        String str;
        while((str = bufferedReader.readLine()) != null){
            System.out.println(str);
        }
    }

    @Test
    public void test8() throws IOException{
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file/5.txt"));
        bufferedWriter.write("Nice to meet you!");
        bufferedWriter.newLine();
        bufferedWriter.write("I am your fans!");
        bufferedWriter.close();
    }
}
