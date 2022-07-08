import java.util.ArrayList;
import java.util.List;

public class ArrayRatio {

    public static void main(String[] args) {
        List<Integer> valores = new ArrayList<>();
        valores.add(1);
        valores.add(-5);
        valores.add(-1);
        valores.add(0);
        valores.add(73);

        plusMinus(valores);
    }

    public static void plusMinus(List<Integer> arr) {

        System.out.println(arr.subList(1, 3));

        int qtdPositivos = 0;
        int qtdZeros = 0;
        int qtdNegativos = 0;

        for(Integer numero : arr) {
            if (numero > 0) {
                qtdPositivos = qtdPositivos + 1;
            } else if (numero == 0) {
                qtdZeros = qtdZeros + 1;
            } else {
                qtdNegativos = qtdNegativos + 1;
            }
        }

        double ratioPositivos = (double) qtdPositivos/arr.size();
        double ratioZeros = (double) qtdZeros/arr.size();
        double ratioNegativos = (double) qtdNegativos/arr.size();

        System.out.printf("%.6f", ratioPositivos);
        System.out.print("\n");
        System.out.printf("%.6f", ratioNegativos);
        System.out.print("\n");
        System.out.printf("%.6f", ratioZeros);

    }

}
