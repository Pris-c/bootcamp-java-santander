package functional_interfaces;

import java.util.Arrays;
import java.util.List;

/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
 * retornar um valor.
 */
public class ConsumerExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        /*
        // Usar o Consumer com expressão lambda para imprimir números pares
        //Forma 1
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        numeros.stream().forEach(imprimirNumeroPar);

       */



      /*  // Usar o Consumer para imprimir números pares no Stream
        //Forma 2
        numeros.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                if (n % 2 == 0){
                    System.out.println(n);
                }
            }
        });*/


        // Usar o Consumer para imprimir números pares no Stream
        //Forma 3 - lambda
        numeros.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });


        // Usar o Predicate para imprimir números pares no Stream
        //Forma 4
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

    }
}
