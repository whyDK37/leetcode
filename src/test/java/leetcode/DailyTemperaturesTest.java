package leetcode;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class DailyTemperaturesTest {

  @Test
  public void testDailyTemperatures() {
    DailyTemperatures dailyTemperatures = new DailyTemperatures();

    assertEquals(dailyTemperatures.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}),
        new int[]{1, 1, 4, 2, 1, 1, 0, 0});
    assertEquals(dailyTemperatures.dailyTemperatures(new int[]{30, 40, 50, 60}),
        new int[]{1, 1, 1, 0});
  }
}