package leetcode;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SearchInRotatedSortedArrayTest {

    @Test
    public void testSearch() {
        SearchInRotatedSortedArray search = new SearchInRotatedSortedArray();

        assertEquals(search.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 4), 0);
        assertEquals(search.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 5), 1);
        assertEquals(search.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 6), 2);
        assertEquals(search.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 7), 3);
        assertEquals(search.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 2), 6);
        assertEquals(search.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 1), 5);
        assertEquals(search.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3), -1);
        assertEquals(search.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0), 4);


    }

    @Test
    public void findSmallestIndex() {
        SearchInRotatedSortedArray search = new SearchInRotatedSortedArray();
        assertEquals(search.findSmallestIndex(new int[]{1, 2, 3, 4, 5}), 0);
        assertEquals(search.findSmallestIndex(new int[]{1, 2, 3, 4, 5, 0}), 5);
        assertEquals(search.findSmallestIndex(new int[]{4, 5, 6, 7, 0, 1, 2}), 4);
    }
}