package ch01.fileinoutstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileCopyByteEx1 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream(
                    "/Users/jongkwonkim/Documents/streamtest/testfile.txt");
            out = new FileOutputStream(
                    "/Users/jongkwonkim/Documents/streamtest/copy_testfile.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
