public class nextsquare {
    public static long findNextSquare(long num) {
        long root = (long) Math.sqrt(num);
        if (root * root != num) return -1;
        return (root + 1) * (root + 1);
    }

    public static void main(String[] args) {
        System.out.println(findNextSquare(4)); // Deve retornar 9
        System.out.println(findNextSquare(121)); // Deve retornar 144
        System.out.println(findNextSquare(625)); // Deve retornar 676
        System.out.println(findNextSquare(114)); // Deve retornar -1
    }
}
