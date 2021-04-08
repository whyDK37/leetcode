package leetcode.linkedlist;

import leetcode.util.ListNodeUtil;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RotateListTest {

    @Test
    public void test(){
        RotateList rotateList = new RotateList();

        assertEquals(ListNodeUtil.printListNode(rotateList.rotateRight(ListNodeUtil.createListNode(0, 1, 2), 1)),"[2->0->1]");;
        assertEquals(ListNodeUtil.printListNode(rotateList.rotateRight(ListNodeUtil.createListNode(0, 1, 2), 2)),"[1->2->0]");;
        assertEquals(ListNodeUtil.printListNode(rotateList.rotateRight(ListNodeUtil.createListNode(0, 1, 2), 3)),"[0->1->2]");;
        assertEquals(ListNodeUtil.printListNode(rotateList.rotateRight(ListNodeUtil.createListNode(0, 1, 2), 4)),"[2->0->1]");;
    }

}