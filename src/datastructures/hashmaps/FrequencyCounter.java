package datastructures.hashmaps;

import java.util.Arrays;
import java.util.HashMap;

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        HashMap<Integer, Integer> frequencyMap = countFrequencies(numbers);

        for (int num : frequencyMap.keySet()) {
            System.out.println(num + " aparece " + frequencyMap.get(num) + " vezes.");
        }
    }

    public static HashMap<Integer, Integer> countFrequencies(int[] numbers) {
        HashMap<Integer, Integer> countedFrequencies = new HashMap<>();

        Arrays.stream(numbers).forEach(value -> {
            if (countedFrequencies.containsKey(value)) {
                countedFrequencies.put(value, countedFrequencies.get(value) + 1);
            } else {
                countedFrequencies.put(value, 1);
            }
        });

        return countedFrequencies;
    }
}
