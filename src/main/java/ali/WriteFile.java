package ali;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class WriteFile {

  public static void main(String[] args) throws IOException {
    String fileName = "D:/10G.txt";

    File file = new File(fileName);
    FileUtils.write(file, "", false);
    while (true) {
      FileUtils.write(file,
          "file1.txt  sdf a b c d e f g file1.txt  sdf a b c d e f gfile1.txt  sdf a b c d e f gfile1.txt  sdf a b c d e f gfile1.txt  sdf a b c d e f gfile1.txt  sdf a b c d e f gfile1.txt  sdf a b c d e f gfile1.txt  sdf a b c d e f gfile1.txt  sdf a b c d e f gfile1.txt  sdf a b c d e f gfile1.txt  sdf a b c d e f gfile1.txt  sdf a b c d e f gfile1.txt  sdf a b c d e f gfile1.txt  sdf a b c d e f gfile1.txt  sdf a b c d e f gfile1.txt  sdf a b c d e f gfile1.txt  sdf a b c d e f gfile1.txt  sdf a b c d e f g",
          true);
      FileUtils.write(file, "\r\n", true);
    }
  }

}
