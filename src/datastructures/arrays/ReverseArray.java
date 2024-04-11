package datastructures.arrays;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
    public static List<Integer> reverseArray(List<Integer> a) {
        List<Integer> reverse = new ArrayList<>();
        for (int i = a.size()-1; i >= 0; i--) reverse.add(a.get(i));
        return reverse;
    }

    public static List<Integer> reverseCollections(List<Integer> a) {
        List<Integer> reverse = new ArrayList<>(a);
        Collections.reverse(reverse);
        return reverse;
    }

    public static List<Integer> reverseWithSwap(List<Integer> numbers) {
        int listMidPointer = numbers.size() / 2;
        List<Integer> reverse = new ArrayList<>(numbers);

        int j = numbers.size()-1;
        for (int i = 0; i <= listMidPointer; i++) {
            Integer currentPosition = reverse.get(i);
            reverse.set(i, reverse.get(j));
            reverse.set(j, currentPosition);
            j--;
           if (i == j) break;
        }

        return reverse;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6);
        System.out.println(reverseArray(numbers));
        System.out.println(reverseCollections(numbers));
        System.out.println(reverseWithSwap(numbers));
    }
}
