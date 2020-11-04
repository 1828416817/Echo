package JAVAIO;

import java.io.FileOutputStream;

public class DemoOutputStream {
    public static void main(String[] args) throws Exception {
        //1创建一个FileOutStream对象，构造方法中传递写入数据的目的地
        FileOutputStream fos = new FileOutputStream("D:\\workspace\\project01\\src\\JAVAIO\\a.txt");
        //2调用FileOutStream对象中的方法write，把数据写入到文件中
        fos.write(97);
        //3释放资源
        fos.close();


    }
}
