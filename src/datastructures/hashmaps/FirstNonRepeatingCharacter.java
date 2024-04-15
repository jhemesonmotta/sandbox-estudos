package datastructures.hashmaps;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String input = "tuturialcup";
        char result = findFirstNonRepeatingCharacter(input);

        if (result != '\0') {
            System.out.println("O primeiro caractere não repetido é: " + result);
        } else {
            System.out.println("Não há caracteres não repetidos na string.");
        }
    }

    public static char findFirstNonRepeatingCharacter(String input) {
        HashMap<Character, Integer> charOccurs = new HashMap<>();
        char[] charList = input.toCharArray();

        for(char c : charList) {
            charOccurs.put(c, charOccurs.getOrDefault(c, 0) + 1);
        }

        AtomicReference<Character> firstWithOne = new AtomicReference<>((char) 0);
        charOccurs.forEach((character, integer) -> {
            if (integer == 1) firstWithOne.set(character);
        });
        return firstWithOne.get();
    }
}
