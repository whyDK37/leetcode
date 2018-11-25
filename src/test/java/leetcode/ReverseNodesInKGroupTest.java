package leetcode;

import org.testng.annotations.Test;

import static leetcode.ListNodeUtil.createList;
import static leetcode.ReverseNodesInKGroup.reverseKGroup;
import static org.testng.Assert.*;

public class ReverseNodesInKGroupTest {

    @Test
    public void testReverseKGroup() {
        ListNodeUtil.equals(
                reverseKGroup(createList(new int[]{1, 2, 3, 4, 5}), 2),
                new int[]{2, 1, 4, 3, 5});
        ListNodeUtil.equals(
                reverseKGroup(createList(new int[]{1, 2, 3, 4, 5}), 3),
                new int[]{3, 2, 1, 4, 5});
        ListNodeUtil.equals(
                reverseKGroup(createList(new int[]{1, 2, 3, 4, 5}), 3),
                new int[]{4, 3, 2, 1, 5});
    }
}