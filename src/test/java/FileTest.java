import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.concurrent.TimeUnit;

public class FileTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        File source = new File("D:\\tmp\\bandicam.mp4");
        FileInputStream fi = new FileInputStream(source);
        FileChannel sc = fi.getChannel();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            File file = new File("d:\\tmp\\" + i + "");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            FileChannel channel = fileOutputStream.getChannel();

            channel.transferFrom(sc, 0, source.length());
            fileOutputStream.close();
            System.out.println(i + "-" + file.delete());
            sc.position(0);
//            TimeUnit.MILLISECONDS.sleep(200L);
        }
    }
}
