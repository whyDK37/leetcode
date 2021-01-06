package ali;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ReadBigFile {

  public static void main(String[] args) throws IOException {
//    File file = new File("D:/file1.txt");
    File file = new File("D:/10G.txt");
    BufferedInputStream fis = new BufferedInputStream(new FileInputStream(file));
    BufferedReader reader = new BufferedReader(new InputStreamReader(fis, StandardCharsets.UTF_8),
        5 * 1024 * 1024);// 用5M的缓冲读取文本文件

    String line = "";
    while ((line = reader.readLine()) != null) {
      System.out.println(line);
      System.out.println(1);
    }
  }

}
