package step3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DeleteFilesTest {
    public static void main(String[] args) throws IOException{
        initialization();
        DeleteFiles.start();

        File readmeCopy = new File("src/step3/readmeCopy.txt");
        if (readmeCopy.exists()) {
            System.out.println("true");
        }
        FileReader readmeCopyReader = new FileReader("src/step3/readmeCopy.txt");
        int read = readmeCopyReader.read();
        while (read != -1) {
            System.out.print((char) read);
            read = readmeCopyReader.read();
        }
        readmeCopyReader.close();

        File readme = new File("src/step3/readme.txt");
        if (!readme.exists()) {
            System.out.println("true");
        }


    }

    private static void initialization() throws IOException{
        File readme = new File("src/step3/readme.txt");
        if (!readme.exists()) {
            readme.createNewFile();
            FileWriter fileWriter = new FileWriter(readme, false);
            String string1 = "Hello World";
            String string2 = "Java is great";
            fileWriter.write(string1 + LINE_SEPARATOR + string2 + LINE_SEPARATOR);
            fileWriter.close();
        }

        File readmeCopy = new File("src/step3/readmeCopy.txt");
        if (readmeCopy.exists()) {
            readmeCopy.delete();
        }
    }

    private static final String LINE_SEPARATOR = System.getProperty("line.separator");
}
