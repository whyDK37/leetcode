package qq;

import org.testng.Assert;

import java.util.HashSet;
import java.util.Set;

/**
 * 【气球游戏】小Q在进行射击气球的游戏，如果小Q在连续T枪中打爆了所有颜色的气球，将得到一只QQ公仔作为奖励。
 * （每种颜色的气球至少被打爆一只）。这个游戏中有m种不同颜色的气球，编号1到m。小Q一共有n发子弹，然后连续开了n枪。
 * 小Q想知道在这n枪中，打爆所有颜色的气球最少用了连续几枪？  输入描述：  第一行两个空格间隔的整数数n，m。n<=1000000 m<=2000
 * 第二行一共n个空格间隔的整数，分别表示每一枪打中的气球的颜色,0表示没打中任何颜色的气球。
 * <p>
 * 输出描述：  一个整数表示小Q打爆所有颜色气球用的最少枪数。如果小Q无法在这n枪打爆所有颜色的气球，则输出 -1
 * <p>
 * 示例  输入：
 * 12 5
 * 2 5 3 1 3 2 4 1 0 5 4 3
 * 输出：  6
 */
public class Qiqiu {
    public static void main(String[] args) {
        Assert.assertEquals(shootCount(3, new int[]{2, 2, 1, 1, 1, 2, 3}), 3);
        Assert.assertEquals(shootCount(5, new int[]{2, 5, 3, 1, 3, 2, 4, 1, 0, 5, 4, 3}), 6);
        Assert.assertEquals(shootCount(5, new int[]{2, 5, 3, 1, 3, 2, 4, 1, 0, 5, 4, 3}), 6);
        Assert.assertEquals(shootCount(1, new int[]{2, 5, 3, 1, 3, 2, 4, 1, 0, 5, 4, 3}), 1);
    }

    /**
     * @param colors 命中不同颜色的个数
     * @param shoots 开枪打中颜色的数组
     * @return -1 没有射中 colors 颜色
     */
    public static int shootCount(int colors, int[] shoots) {
        if (colors == 0) return 0;
        if (shoots == null || shoots.length == 0) return -1;
        if (shoots.length < colors) return -1;
        if (colors == 1) return 1;

        int slow = 0, minShoot = Integer.MAX_VALUE;
        Set<Integer> shootColor = new HashSet<>();
        shootColor.add(shoots[0]);
        for (int fast = 1; fast < shoots.length; fast++) {
            int shoot = shoots[fast];
            if (!shootColor.add(shoot)) {
                while (slow < fast && shoots[slow] == shoot) {
                    slow++;
                }
                if (slow < fast) {
                    shoot = shoots[slow + 1];
                    boolean hasSameNum = false;
                    while (slow < fast && shoots[slow] == shoot) {
                        slow++;
                        hasSameNum = true;
                    }
                    if (hasSameNum) slow--;
                }
            } else {
                if (shootColor.size() == colors) {
                    minShoot = Math.min(minShoot, fast - slow + 1);
                }
            }
        }

        return minShoot == Integer.MAX_VALUE ? -1 : minShoot;
    }
}
