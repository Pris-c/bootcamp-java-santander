package functional_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizada para transformar, ou mapear os elementos do Stream em outros valores, ou tipos.
 */
public class FunctionExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);


        // Usar a Function com expressão lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        /*// Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
        //#1
        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar)
                .collect(Collectors.toList());*/

        /*
        // Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
        //#2
        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar)
                .toList();
*/

/*
        // Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
        //#3
        List<Integer> numerosDobrados = numeros.stream()
                .map(n -> n * 2)
                .toList();
        */

 /*
        // Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
        //#4
        List<Integer> numerosDobrados = numeros.stream()
                .map(new Function<Integer, Integer>() {
                         @Override
                         public Integer apply(Integer n) {
                             return n*2;
                         }
                     }
                )
                .toList();
 */

        // Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
        //#5
        List<Integer> numerosDobrados = numeros.stream()
                .map(n -> n * 2)
                .toList();


        // Imprimir a lista de números dobrados
        //numerosDobrados.forEach(n -> System.out.println(n));
        numerosDobrados.forEach(System.out::println);
    }
}
