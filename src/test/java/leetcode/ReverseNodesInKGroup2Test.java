package leetcode;

import org.testng.annotations.Test;

import static util.ListNodeUtil.createListNode;
import static util.ListNodeUtil.equalsListNode;
import static leetcode.ReverseNodesInKGroup2.reverseKGroup;

public class ReverseNodesInKGroup2Test {

    @Test
    public void testReverseKGroup() {
        equalsListNode(reverseKGroup(createListNode(new int[]{1, 2, 3, 4, 5}), 0),
                new int[]{1, 2, 3, 4, 5});
        equalsListNode(reverseKGroup(createListNode(new int[]{1, 2, 3, 4, 5}), 1),
                new int[]{1, 2, 3, 4, 5});
        equalsListNode(reverseKGroup(createListNode(new int[]{1, 2, 3, 4, 5}), 5),
                new int[]{5, 4, 3, 2, 1});
        equalsListNode(reverseKGroup(createListNode(new int[]{1, 2, 3, 4, 5}), 2),
                new int[]{2, 1, 4, 3, 5});
        equalsListNode(reverseKGroup(createListNode(new int[]{1, 2, 3, 4, 5}), 3),
                new int[]{3, 2, 1, 4, 5});
        equalsListNode(reverseKGroup(createListNode(new int[]{1, 2, 3, 4, 5}), 4),
                new int[]{4, 3, 2, 1, 5});
    }
}