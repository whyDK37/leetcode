package leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveElementTest {

    @Test
    public void testRemoveElement() {
        RemoveElement removeElement = new RemoveElement();
        Assert.assertEquals(removeElement.removeElement(new int[]{3, 2, 2, 3}, 3), 2);
        Assert.assertEquals(removeElement.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2), 5);
    }
}