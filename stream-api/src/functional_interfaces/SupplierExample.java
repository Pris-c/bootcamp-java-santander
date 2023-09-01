package functional_interfaces;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {

    /**
     * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
     * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
     */

    public static void main(String[] args) {
        // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        /*
        // Usar o Supplier para obter uma lista com 5 saudações
        //#1
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .collect(Collectors.toList());
        */

/*

        // Usar o Supplier para obter uma lista com 5 saudações
        //#2
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .toList();
*/

        /*
        // Usar o Supplier para obter uma lista com 5 saudações
        //#3
        List<String> listaSaudacoes = Stream.generate(
                        new Supplier<String>() {
                            @Override
                            public String get() {
                                return "Olá, seja bem-vindo(a)!";
                            }
                        }
                )
                .limit(5)
                .toList();
*/


        // Usar o Supplier para obter uma lista com 5 saudações
        //#4
        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem-vindo(a)!")
            .limit(5)
            .toList();

        // Imprimir as saudações geradas
        //#1
        listaSaudacoes.forEach(n -> System.out.println(n));


        // Imprimir as saudações geradas
        //#2
        listaSaudacoes.forEach(System.out::println);
    }
}
