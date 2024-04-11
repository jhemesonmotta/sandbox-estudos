package datastructures;

import java.util.HashMap;
import java.util.Map;

public class HashMapTwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] indices = twoSum(nums, target);

        if (indices.length == 2) {
            System.out.println("Índices: " + indices[0] + " e " + indices[1]);
        } else {
            System.out.println("Nenhum par encontrado.");
        }
    }
}
