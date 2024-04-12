package datastructures.arrays;

import java.util.ArrayList;
import java.util.List;

public class LeftRotationArray {

    public static List<Integer> rotateLeft(int amountOfRotations, List<Integer> arr) {
        List<Integer> rotatedArray = new ArrayList<>(arr);
        int arraySize = arr.size();

        for (int i = 0; i < arraySize; i++) {
            int targetIndex = findRelatedIndex(amountOfRotations, i, arraySize);
            rotatedArray.set(targetIndex, arr.get(i));
        }
        return rotatedArray;
    }

    public static int findRelatedIndex(int amountOfRotations, int currentIndex, int arraySize) {
        int resultIndex = currentIndex - amountOfRotations;
        if (resultIndex >= 0) return resultIndex;
        else return arraySize + resultIndex;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5);
        System.out.println(rotateLeft(2, numbers));
    }
}
