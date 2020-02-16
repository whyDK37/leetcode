import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIleMerge {

  public static void main(String[] args) throws IOException {
    //定义输出目录
//        String FileOut="E:\\Mycode\\SBgong\\output\\1.txt";
    File FileOut = new File("d:\\tmp\\1-5.sz");

    FileOutputStream fileOutputStream = new FileOutputStream(FileOut);

    //读取目录下的每个文件或者文件夹，并读取文件的内容写到目标文字中去
    File[] list = new File("D:\\tmp\\001~005视频").listFiles();
    int fileCount = 0;
    int folderConut = 0;
    byte[] buffer = new byte[1024 * 10];
    int read = 0;
    for (File file : list) {
      try {
        if (file.isFile()) {
          fileCount++;
          FileInputStream fileInputStream = new FileInputStream(file);
          while ((read = fileInputStream.read(buffer)) > 0) {
            fileOutputStream.write(buffer, 0, read);
          }

          fileInputStream.close();
        } else {
          folderConut++;
        }
      } catch (IOException e) {
        e.printStackTrace();
      } catch (IndexOutOfBoundsException e) {
        e.printStackTrace();
      }
    }
    fileOutputStream.close();
    System.out.println("输入目录下文件个数为" + fileCount);
    System.out.println("输入目录下文件夹个数为" + folderConut);

  }
}
