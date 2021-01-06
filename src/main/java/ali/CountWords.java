package ali;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map.Entry;

public class CountWords {

  public static void main(String[] args) throws IOException {
    CountWords sw = new CountWords(10 * 1024 * 1024);// 用10M的缓冲读取文本文件
    sw.count("D:/10G.txt");
    sw.print();
  }

  public CountWords(int sz) {
    this.sz = sz;
  }

  final HashMap<String, Long> hashMap = new HashMap<>(1024);
  final int sz;


  public void count(String src) throws IOException {
    File file = new File(src);
    if (!file.exists()) {
      System.out.println("文件不存在");
      return;
    }

    BufferedInputStream fis = new BufferedInputStream(new FileInputStream(file));
    BufferedReader reader = new BufferedReader(new InputStreamReader(fis, StandardCharsets.UTF_8),
        sz);//

    String line;
    while ((line = reader.readLine()) != null) {
      String[] lineWords = line.split(" ");

      for (String lineWord : lineWords) {
        lineWord = lineWord.trim();
        if ("".equals(lineWord)) {
          continue;
        }
        //如果已经有这个单词了，
        if (hashMap.containsKey(lineWord)) {
          long number = hashMap.get(lineWord);
          hashMap.put(lineWord, number + 1);
        } else {
          hashMap.put(lineWord, 1L);
        }
      }

    }
    System.out.println("文件统计结束");
  }

  public void print() {
    System.out.println("-----------统计单词完成，所有文件单词总数为-------------------");
    for (Entry<String, Long> wordCount : hashMap.entrySet()) {
      System.out.printf("单词:%-12s 出现次数:%d\n", wordCount.getKey(), wordCount.getValue());
    }
  }
}