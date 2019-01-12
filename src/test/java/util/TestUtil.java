package util;

import org.testng.Assert;

public class TestUtil {

    public static void equals(int[] source, int[] target) {
        Assert.assertEquals(source.length, target.length);

        for (int i = 0; i < source.length; i++) {
            Assert.assertEquals(source[i], target[i]);
        }
    }
}
