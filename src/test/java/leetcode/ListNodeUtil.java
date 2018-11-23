package leetcode;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class ListNodeUtil {

    public static void equals(ListNode head, int[] ints) {
        List<Integer> nodeArr = new ArrayList<>();
        while (head != null) {
            nodeArr.add(head.val);
            head = head.next;
        }

        Assert.assertEquals(nodeArr.size(), ints.length);

        Integer[] integers = nodeArr.toArray(new Integer[0]);
        for (int i = 0; i < integers.length; i++) {
            Assert.assertEquals(integers[i].intValue(), ints[i]);
        }
    }
}
