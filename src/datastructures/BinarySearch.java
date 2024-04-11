package datastructures;

public class BinarySearch {

    /**
     * Realiza busca binária em um array ordenado.
     *
     * @param arr Array ordenado onde a busca será realizada.
     * @param target O valor alvo a ser buscado.
     * @return O índice do valor alvo no array ou -1 se o valor não for encontrado.
     */
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int midPoint = left + ((right - left) / 2);

            if (arr[midPoint] == target) return midPoint;
            else if (arr[midPoint] > target) right = midPoint - 1;
            else left = midPoint + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 5, 6, 7, 9, 10};
        int target = 7;
        int result = binarySearch(numbers, target);

        if (result != -1) {
            System.out.println("Elemento encontrado no índice: " + result);
        } else {
            System.out.println("Elemento não encontrado.");
        }
    }
}
