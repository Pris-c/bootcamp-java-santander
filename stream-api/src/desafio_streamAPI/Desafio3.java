package desafio_streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Desafio 3 - Verifique se todos os números da lista são positivos:
//Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
public class Desafio3 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, -9, 10, 5, 4, 3);
        System.out.println(numeros.stream().allMatch(n -> n>0));

        //List<Integer> maiorZero = numeros.stream().filter(n -> n>0).collect(Collectors.toList());
        //List<Integer> maiorZero = numeros.stream().filter(n -> n>0).toList();
        //List<Integer> maiorZero = numeros.stream().filter(n -> n>0).toList();
        //System.out.println(numeros.size() == maiorZero.size());



    }
}