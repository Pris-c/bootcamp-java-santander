package desafio_streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Desafio 5 - Calcule a média dos números maiores que 5:
//Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
public class Desafio5 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.println(numeros.stream().filter(n -> n>5).collect(Collectors.averagingInt(Integer::intValue)));
        //System.out.println(numeros.stream().filter(n -> n>5).mapToInt(Integer::intValue).average().getAsDouble());

/*
        Double mediaMaioresCinco = ( (double) numeros.stream().filter(n -> n>5).reduce(0, Integer::sum) / numeros.stream().filter(n -> n>5).toList().size() );
        System.out.println(mediaMaioresCinco);
*/

/*
        List<Integer> maioresCinco = numeros.stream().filter(n -> n>5).toList();
        Double media =  ((double) maioresCinco.stream().reduce(0, Integer::sum)) / maioresCinco.size();
        System.out.println(media);
*/



    }
}
