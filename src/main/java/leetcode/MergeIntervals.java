package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * sort intervals
 * traversal intervals , and merge overlap interval.
 */
public class MergeIntervals {

    public int[][] merge(int[][] intervals) {

        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }

        List<Interval> param = new ArrayList<>(intervals.length);
        for (int[] interval : intervals) {
            param.add(new Interval(interval[0], interval[1]));
        }

        param.sort((o1, o2) -> {
            if (o1.start == o2.start) {
                return o1.end - o2.end;
            }
            return o1.start - o2.start;
        });

        List<Interval> result = new ArrayList<>();
        result.add(new Interval(param.get(0).start, param.get(0).end));
        for (int i = 1; i < param.size(); i++) {
            Interval interval = param.get(i);

            Interval pre = result.get(result.size() - 1);
            if (pre.start < interval.start && pre.end > interval.end) {
                continue;
            }
            if (pre.end >= interval.start) {
                pre.end = interval.end;
            } else {
                result.add(new Interval(interval.start, interval.end));
            }
        }

        int[][] numseven = new int[result.size()][];
        for (int i = 0; i < result.size(); i++) {
            Interval interval = result.get(i);

            numseven[i] = new int[2];
            numseven[i][0] = interval.start;
            numseven[i][1] = interval.end;
        }

        return numseven;
    }

    private class Interval {
        int start;
        int end;

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }
}
