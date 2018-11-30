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

    public static ListNode createList(int[] arr) {
        ListNode sentinal = new ListNode(0);

        ListNode curr = sentinal;
        for (int i : arr) {
            curr.next = new ListNode(i);
            curr = curr.next;
        }

        return sentinal.next;
    }

    public static void main(String[] args) {
        ListNode list = createList(new int[]{1, 2, 3, 4});
        equals(list, new int[]{1, 2, 3, 4});


    }
}
