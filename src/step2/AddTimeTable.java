package step2;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class AddTimeTable {
    private static final String LINE_SEPARATOR = System.getProperty("line.separator");  //定义LINE_SEPARATOR常量，表示换行符
    public static void start(String time1, String time2) throws IOException {
        /********** Begin *********/

        File file = new File("src/step2/Time_Table.txt");
        FileWriter fileWriter = new FileWriter(file, false);
        fileWriter.write(time1+LINE_SEPARATOR+time2);
        fileWriter.close();
        /********** End *********/
    }
}
