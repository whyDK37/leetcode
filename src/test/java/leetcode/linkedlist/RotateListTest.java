package leetcode.linkedlist;

import leetcode.util.ListNodeUtil;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RotateListTest {

    @Test
    public void test(){
        RotateList rotateList = new RotateList();

        System.out.println(rotateList.rotateRight(ListNodeUtil.createListNode(0, 1, 2), 1));
        System.out.println(rotateList.rotateRight(ListNodeUtil.createListNode(0, 1, 2), 2));
        System.out.println(rotateList.rotateRight(ListNodeUtil.createListNode(0, 1, 2), 3));
        System.out.println(rotateList.rotateRight(ListNodeUtil.createListNode(0, 1, 2), 4));
    }

}