package step2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class AddTimeTableTest {
    public static void main(String[] args) throws IOException{
        String time1 = "长沙 北京 G502 07:36 14:24";
        String time2 = "长沙 北京 G488 10:51 17:06";
        AddTimeTable.start(time1, time2);
        File file = new File("src/step2/Time_Table.txt");
        FileReader fileReader = new FileReader(file);
        int read = fileReader.read();
        while (read != -1) {
            System.out.print((char)read);
            read = fileReader.read();
        }
        fileReader.close();
    }
}
