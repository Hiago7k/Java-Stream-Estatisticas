import java.util.*;
import java.util.stream.Collector;
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
        //System.out.println("O maior número da lista é: " + est.getMax());

        /*
            2 -Dada a lista de palavras (strings) abaixo, agrupe-as
            pelo seu tamanho. No código a seguir, há um exemplo prático
            do resultado esperado.
            Resultado Esperado: {4=[java, code], 6=[stream, lambda]}
       */
        List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");

        Map<Integer, List<String>> agrupamento = palavras.stream()
                        .collect(Collectors.groupingBy(String::length));

       // System.out.println(agrupamento);

        /*
        3 - Dada a lista de nomes abaixo,
          concatene-os separados por vírgula.
          No código a seguir, há um exemplo prático do resultado esperado.
          // Resultado Esperado: "Alice, Bob, Charlie"
         */
        List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");
            String resultado =  nomes.stream()
                        .collect(Collectors.joining(", "));
       // System.out.println(resultado);

        /*
        4 - Dada a lista de números inteiros abaixo,
         calcule a soma dos quadrados dos números pares.
         */
        List<Integer> numeros2 = Arrays.asList(1, 2, 3, 4, 5, 6);
        DoubleSummaryStatistics esta = (DoubleSummaryStatistics) numeros2.stream()
                .filter(n -> n % 2 == 0)
                        .collect(Collectors.summarizingDouble(Integer::longValue));
        System.out.println(esta.getSum());


    }
}
