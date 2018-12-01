package leetcode;

import org.testng.annotations.Test;

import static leetcode.ListNodeUtil.createList;
import static leetcode.ListNodeUtil.equalsNode;
import static leetcode.ReverseNodesInKGroup.reverseKGroup;
import static org.testng.Assert.*;

public class ReverseNodesInKGroupTest {

    @Test
    public void testReverseKGroup() {
        equalsNode(reverseKGroup(createList(new int[]{1, 2, 3, 4, 5}), 0),
                new int[]{1, 2, 3, 4, 5});
        equalsNode(reverseKGroup(createList(new int[]{1, 2, 3, 4, 5}), 1),
                new int[]{1, 2, 3, 4, 5});
        equalsNode(reverseKGroup(createList(new int[]{1, 2, 3, 4, 5}), 5),
                new int[]{5, 4, 3, 2, 1});
        equalsNode(reverseKGroup(createList(new int[]{1, 2, 3, 4, 5}), 2),
                new int[]{2, 1, 4, 3, 5});
        equalsNode(reverseKGroup(createList(new int[]{1, 2, 3, 4, 5}), 3),
                new int[]{3, 2, 1, 4, 5});
        equalsNode(reverseKGroup(createList(new int[]{1, 2, 3, 4, 5}), 4),
                new int[]{4, 3, 2, 1, 5});
    }
}