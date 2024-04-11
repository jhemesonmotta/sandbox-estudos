import java.math.BigInteger;

public class LookSequence {
    public static String LookSaySequence(BigInteger num) {
        String numberString = num.toString();
        StringBuilder result = new StringBuilder();

        int count = 1;

        char specificDigit = numberString.charAt(0); // 0 = simply initial char

        for (int i = 1; i < numberString.length(); i++) {
            if (numberString.charAt(i) == specificDigit) count ++;
            else {
                result.append(count).append(specificDigit);
                specificDigit = numberString.charAt(i);
                count = 1;
            }
        }

        result.append(count).append(specificDigit);

        System.out.println(result.toString());

        return result.toString();
    }

    public static void main (String[] args) {
        // keep this function call here
        System.out.print("Test 1 passing: " + (LookSaySequence(new BigInteger("11111111112233331112")).equals("10122433112")) + "\r\n");
    }
}
