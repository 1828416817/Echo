package step3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DeleteFiles {
    public static void start() throws IOException {
        StringBuilder data = new StringBuilder("");
        /********** Begin *********/
        //读取readme.txt文件
        FileReader fileReader = new FileReader("src/step3/readme.txt");

        //写入readmeCopy.txt文件
        File file = new File("src/step3/readmeCopy.txt");
        if(!file.exists()){
            System.out.println(file.createNewFile());
        }
        FileWriter fileWriter  = new FileWriter("src/step3/readmeCopy.txt");
        int read = fileReader.read();
        while(read!=-1){
            System.out.print((char)read);
            data.append((char)read);
            read=fileReader.read();
        }
        fileWriter.write(data.toString());


        //删除readme.txt文件
        File file1 = new File("src/step3/readme.txt");
        if (file.exists()){
            System.out.println(file.delete());
        }
        /********** End *********/
    }
}
