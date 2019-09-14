package leetcode;

import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.PriorityQueue;

import static leetcode.util.ListNodeUtil.createListNode;
import static leetcode.util.ListNodeUtil.equalsListNode;

public class MergeKSortedListsTest {

    @Test
    public void testMergeKLists() {
        ListNode listNode = new MergeKSortedLists().mergeKLists(new ListNode[]{createListNode(1, 4, 5),
                createListNode(1, 3, 4),
                createListNode(2, 6)});
        equalsListNode(listNode, new int[]{1, 1, 2, 3, 4, 4, 5, 6});
    }

    @Test
    public void testPriority() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(o -> o));
        priorityQueue.add(1);
        priorityQueue.add(4);
        priorityQueue.add(3);

        System.out.println(priorityQueue);

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
//
//        PriorityQueue<Integer> q = new PriorityQueue<>();
//        for (int i = 0; i < 10; i++) {
//            q.add(i);
//        }
//
//        while (!q.isEmpty()) {
//            System.out.println(q.poll());
//        }
    }
}