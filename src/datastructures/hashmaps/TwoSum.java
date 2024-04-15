package datastructures.hashmaps;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int target = 7;
        int[] result = findTwoSum(numbers, target);

        if (result != null) {
            System.out.println("Os números que somam " + target + " são: " + result[0] + " e " + result[1]);
        } else {
            System.out.println("Não há dois números que somam ao valor alvo.");
        }
    }

    public static int[] findTwoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int number : numbers) {
            int complement = target - number;

            if (map.containsKey(complement)) {
                return new int[]{complement, number};
            }
            map.put(number, complement);
        }
        return null;
    }
}