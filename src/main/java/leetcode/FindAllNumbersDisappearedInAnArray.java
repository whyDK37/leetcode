package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // 获取数组中的值，定位到数组值对应的下标并把下标值修改为复数，表示存在
        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i]) - 1] > 0) {
                nums[Math.abs(nums[i]) - 1] *= -1;
            }
        }
        List<Integer> result = new ArrayList<>();
        // 值大于0的就是不存在的
        for (int var = 0; var < nums.length; var++) {
            if (nums[var] > 0) {
                result.add(var + 1);
            }
        }
        return result;

    }
}
