import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

class Main{
    public static void main(String[] args){
        /*
         1 - Dada a lista de números inteiros a seguir,
          encontre o maior número dela.
           */
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);

        IntSummaryStatistics est = numeros.stream()
          .collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println("O maior número da lista é: " + est.getMax());

    }
}
