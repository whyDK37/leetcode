package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class NumberOfIslandsTest {

  @Test
  public void testNumIslands() {
    NumberOfIslands numberOfIslands = new NumberOfIslands();
    char[][]
        chars = {
        {'1', '1', '1', '1', '0'},
        {'1', '1', '0', '1', '0'},
        {'1', '1', '0', '0', '0'},
        {'0', '0', '0', '0', '0'}
    };
    assertEquals(1, numberOfIslands.numIslands(chars));
    char[][] chars2 = {
        {'1', '1', '0', '0', '0'},
        {'1', '1', '0', '0', '0'},
        {'0', '0', '1', '0', '0'},
        {'0', '0', '0', '1', '1'}
    };
    assertEquals(3, numberOfIslands.numIslands(chars2));
  }

  @Test
  public void testNumIslandsV2() {
    NumberOfIslandsV2 numberOfIslands = new NumberOfIslandsV2();
    char[][]
        chars = {
        {'1', '1', '1', '1', '0'},
        {'1', '1', '0', '1', '0'},
        {'1', '1', '0', '0', '0'},
        {'0', '0', '0', '0', '0'}
    };
    assertEquals(1, numberOfIslands.numIslands(chars));
    char[][] chars2 = {
        {'1', '1', '0', '0', '0'},
        {'1', '1', '0', '0', '0'},
        {'0', '0', '1', '0', '0'},
        {'0', '0', '0', '1', '1'}
    };
    assertEquals(3, numberOfIslands.numIslands(chars2));
  }
}