package desafio_streamAPI;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

//Desafio 8 - Somar os dígitos de todos os números da lista:
//Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
public class Desafio8 {

    public static void main(String[] args) {
        //List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numeros = Arrays.asList(103, 24, 3, 40, 5, 61, 7, 8, 9, 11110, 5, 49, 3);

        //Function<Integer,Integer> somarDigitos = n -> somarDigitos(n);
        Function<Integer,Integer> somarDigitos = n ->
        {
            int soma = 0;
            while(n>=10){
                soma += n%10;
                n=n/10;
            }
            soma +=n;
            return soma;
        };

        System.out.println(numeros.stream().map(somarDigitos).reduce(Integer::sum).get());

        /*
        System.out.println(
                numeros.stream().map(n ->
                {
                    int soma = 0;
                    while(n>=10){
                        soma += n%10;
                        n=n/10;
                    }
                    soma +=n;
                    return soma;
                }).reduce(Integer::sum).get()
        );
*/

    }
}
