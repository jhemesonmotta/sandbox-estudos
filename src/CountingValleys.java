public class CountingValleys {
    public static void main(String[] args) {
        System.out.println(countingValleys(4, "DDUUUUDDDDUUDUDU"));
    }

    // D = descida. U = subida. Contar quantos vales existem no caminho. Isto é, quantas vezes estou em um nível abaixo de 0.
    public static int countingValleys(int steps, String path) {
        int countValleys = 0;
        int currentLevel = 0;

        for (char step: path.toCharArray()) {
            if (step == 'D') {
                if (currentLevel == 0) {
                    countValleys = countValleys + 1;
                }

                currentLevel = currentLevel - 1;
            } else {
                // i.e.: equals "U"
                currentLevel = currentLevel + 1;
            }
        }

        return countValleys;
    }
}
