public class BigNumber {


  public static String bigNumberAdd(String f, String s) {
    // 翻转两个字符串，并转换成数组
    char[] a = new StringBuffer(f).reverse().toString().toCharArray();
    char[] b = new StringBuffer(s).reverse().toString().toCharArray();
    int lenA = a.length;
    int lenB = b.length;
    // 计算两个长字符串中的较长字符串的长度
    int len = lenA > lenB ? lenA : lenB;
    int[] result = new int[len + 1];
    for (int i = 0; i < len + 1; i++) {
      // 如果当前的i超过了其中的一个，就用0代替，和另一个字符数组中的数字相加
      int aint = i < lenA ? (a[i] - '0') : 0;
      int bint = i < lenB ? (b[i] - '0') : 0;
      result[i] = aint + bint;
    }
    // 处理结果集合，如果大于10的就向前一位进位，本身进行除10取余
    for (int i = 0; i < result.length; i++) {
      if (result[i] >= 10) {
        result[i + 1] += result[i] / 10;
        result[i] %= 10;
      }
    }
    StringBuilder sb = new StringBuilder();
    // 该字段用于标识是否有前置0，如果有就不要存储
    boolean flag = true;
    // 注意从后往前
    for (int i = len; i >= 0; i--) {
      if (result[i] == 0 && flag) {
        continue;
      } else {
        flag = false;
      }
      sb.append(result[i]);
    }
    // 结果
    return sb.toString();
  }

  public static String bigNumberSub(String f, String s) {
    System.out.print("减法:" + f + "-" + s + "=");
    // 将字符串翻转并转换成字符数组
    char[] a = new StringBuffer(f).reverse().toString().toCharArray();
    char[] b = new StringBuffer(s).reverse().toString().toCharArray();
    int lenA = a.length;
    int lenB = b.length;
    // 找到最大长度
    int len = lenA > lenB ? lenA : lenB;
    int[] result = new int[len];
    // 表示结果的正负
    char sign = '+';
    // 判断最终结果的正负
    if (lenA < lenB) {
      sign = '-';
    } else if (lenA == lenB) {
      int i = lenA - 1;
      // 找到第一个不相等的
      // 注意下标0处理
      while (i > 0 && a[i] == b[i]) {
        i--;
      }
      if (a[i] < b[i]) {
        sign = '-';
      }
    }
    // 计算结果集，如果最终结果为正，那么就a-b否则的话就b-a
    for (int i = 0; i < len; i++) {
      int aint = i < lenA ? (a[i] - '0') : 0;
      int bint = i < lenB ? (b[i] - '0') : 0;
      if (sign == '+') {
        result[i] = aint - bint;
      } else {
        result[i] = bint - aint;
      }
    }
    // 如果结果集合中的某一位小于零，那么就向前一位借一，
    // 然后将本位加上10。其实就相当于借位做减法
    for (int i = 0; i < result.length - 1; i++) {
      if (result[i] < 0) {
        result[i + 1] -= 1;
        result[i] += 10;
      }
    }

    StringBuilder sb = new StringBuilder();
    // 如果最终结果为负值，就将负号放在最前面，正号则不需要
    if (sign == '-') {
      sb.append('-');
    }
    // 判断是否有前置0
    boolean flag = true;
    for (int i = len - 1; i >= 0; i--) {
      if (result[i] == 0 && flag) {
        continue;
      } else {
        flag = false;
      }
      sb.append(result[i]);
    }
    // 结果为一位且是0，被上面的for处理了
    // 如果最终结果集合中没有值，就说明是两值相等，最终返回0
    if (sb.toString().equals("")) {
      sb.append("0");
    }
    return sb.toString();
  }

  public static String add(String a, String b) {

    String ret = "";
    int lenA = a.length();
    int lenB = b.length();
    int maxLen = lenA > lenB ? lenA : lenB;
    int minLen = lenA < lenB ? lenA : lenB;
    StringBuilder s = new StringBuilder();
    //要保证两个数位数相同，位数少的前面补0
    for (int i = 0; i < maxLen - minLen; i++) {
      s.append(0);
    }
    if (minLen == lenA) {
      s.append(a);
    } else {
      s.append(b);
    }

    s = new StringBuilder();
    int tempA, tempB, result;
    int sc = 0;//进位
    for (int i = maxLen - 1; i >= 0; i--) {
      tempA = Integer.valueOf(a.charAt(i));
      tempB = Integer.valueOf(b.charAt(i));
      result = tempA + tempB + sc;
      sc = result / 10;
      result = result % 10;
      s.append(result);
    }
    //如果加到最高为仍有进位，那么也要加上去
    if (sc == 1) {
      s.append(1);
    }
    //因为是从个位依次相加的，所以结果要倒过来
    ret = s.reverse().toString();

    return ret;
  }

}