package RecToFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Rec {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("testFile");
        PrintWriter pw = new PrintWriter(file);

        pw.println("Test row 1");
        pw.println("Test row 22");

        pw.close();
    }
}
