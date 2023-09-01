package desafio_streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Desafio 2 - Imprima a soma dos números pares da lista:
//Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
public class Desafio2 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Integer soma = numeros.stream().filter(n -> (n % 2 == 0)).reduce(0, (n1, n2) -> n1 + n2);
        Integer soma = numeros.stream().filter(n -> (n % 2 == 0)).reduce(0, Integer::sum);

        System.out.println(soma);

    }
}
