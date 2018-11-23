package leetcode;

import java.util.Stack;

/**
 */
public class IntersectionOfTwoLinkedLists {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Stack<ListNode> stackA = new Stack<>();
        Stack<ListNode> stackB = new Stack<>();

        while (headA != null) {
            stackA.push(headA);
            headA = headA.next;
        }

        while (headB != null) {
            stackB.push(headB);
            headB = headB.next;
        }

        ListNode comment = null;
        while (!stackA.empty() && !stackB.empty()) {
            ListNode popA = stackA.pop();
            ListNode popB = stackB.pop();
            if (popA == popB) comment = popA;
            else break;
        }

        return comment;
    }

}
