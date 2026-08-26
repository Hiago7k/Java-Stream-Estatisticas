import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
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

        Map<Integer, String> stringsAgrupadas = palavras.stream()
                .collect(Collectors.toCollection(palavras::getClass,
                        Collectors.averagingDouble(palavras::sort)));


        System.out.println(stringsAgrupadas);


    }
}
