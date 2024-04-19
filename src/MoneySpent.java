import java.util.Arrays;
import java.util.HashMap;

public class MoneySpent {
    public static void main(String[] args) {
        int[] keyboards = {40,50,60};
        int[] drives = {5,8,12};
        int money = 60;
        int result = getMoneySpent(keyboards, drives, money);
        int result2 = getMoneySpentEnhanced(keyboards, drives, money);

        System.out.println("Valor total gasto: " + result);
        System.out.println("Valor total gasto 2: " + result2);
    }
    static int getMoneySpent(int[] keyboards, int[] drives, int money) {
        if (money < 1) return -1;

        int biggestSpentValuePossible = -1;

        for (int keyboard: keyboards) {
            int amountAfterBuyingKeyboard = money - keyboard;
            if (amountAfterBuyingKeyboard > 0) {
                for (int drive: drives) {
                    int spentValue = keyboard + drive;
                    if (spentValue <= money && spentValue > biggestSpentValuePossible)
                        biggestSpentValuePossible = spentValue;
                }
            }
        }
        return biggestSpentValuePossible;
    }

    static int getMoneySpentEnhanced(int[] keyboards, int[] drives, int money) {
        if (money < 1) return -1;

        Arrays.sort(keyboards);
        Arrays.sort(drives);

        int biggestSpentValuePossible = -1;
        int i = keyboards.length - 1;
        int j = 0;

        while (i >= 0 && j < drives.length) {
            int spentValue = keyboards[i] + drives[j];
            if (spentValue <= money) {
                biggestSpentValuePossible = Math.max(biggestSpentValuePossible, spentValue);
                j++;
            } else {
                i--;
            }
        }

        return biggestSpentValuePossible;
    }
}
