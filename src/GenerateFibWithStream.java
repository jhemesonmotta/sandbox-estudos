import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class GenerateFibWithStream {
    public static void main(String[] args) {
        generateFibonacciSequence()
                .limit(20)
                .forEach(System.out::println);
    }

    // usa novos recursos da API de Streams para gerar uma sequencia infinita
    // IntStream: É um stream para operações com valores primitivos do tipo int
    // --> evita autoboxing (processo de conversão de int em Integer
    public static IntStream generateFibonacciSequence() {
        // UnaryOperator<int[]>: É uma interface funcional que representa uma operação sobre um único operando
        // que retorna um resultado do mesmo tipo que o operando.
        // Neste caso, o operando e o resultado são ambos arrays de inteiros (int[]).
        UnaryOperator<int[]> unaryOperator =
                // os {} são usados para a criação de um novo array, simplesmente
                //  f[1] se torna o primeiro elemento do novo array.
                //  f[0] + f[1] se torna o segundo elemento do novo array.
                // assim, para cada iteração tenho um array onde o primeiro elemento [0] é o próximo item fib e [1] é o posterior
                // --> [1] será jogado para a posição [0] a cada vez que o operator for chamado
                f -> new int[]{f[1], f[0] + f[1]};

        // UnaryOperator<String> stringUnaryOperator = f -> "Modified" + f;


        // os {} são usados para a criação de um novo array, simplesmente

        // int[] f = {1, 2};
        // int[] newArray = new int[]{f[1], f[0] + f[1]}; // newArray será {2, 3}

        // Stream.iterate: Este método é usado para criar um stream infinito
        // --> O primeiro argumento é o elemento inicial do stream (os dois primeiros números da sequência de Fibonacci)
        // --> O segundo argumento é uma função que gera o próximo elemento com base no elemento anterior
        return Stream.iterate(
                new int[]{1, 1},
                unaryOperator
        ).mapToInt(f -> f[0]); // Este método converte o stream de arrays de inteiros para um IntStream de números inteiros individuais.
    }
}
