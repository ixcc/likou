package day;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class day1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                arr[0] = i;
                arr[1] = map.get(target - nums[i]);
                return arr;
            } else {
                map.put(nums[i], i);
            }
        }
        return arr;
    }
}
