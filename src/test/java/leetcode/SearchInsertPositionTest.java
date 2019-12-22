package leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchInsertPositionTest {

    @Test
    public void testSearchInsert() {
        SearchInsertPosition position = new SearchInsertPosition();
        Assert.assertEquals(position.searchInsert(new int[]{1, 3, 5, 6}, 7), 4);
        Assert.assertEquals(position.searchInsert(new int[]{1, 3, 5, 6}, 5), 2);
        Assert.assertEquals(position.searchInsert(new int[]{1, 3, 5, 6}, 2), 1);
        Assert.assertEquals(position.searchInsert(new int[]{1, 3, 5, 6}, 0), 0);
    }
}