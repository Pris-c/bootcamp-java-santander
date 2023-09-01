package desafio_streamAPI;

import java.util.Arrays;
import java.util.List;

//Desafio 17 - Filtrar os números primos da lista:
//Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
public class Desafio17 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.println(numeros.stream().filter(Desafio17::primo).toList());

    }

    public static boolean primo(int n){
        if(n<=0){
            return false;
        }

        int div = 0;
        for(int i=1; i<n; i++){
            if (n%i == 0){
                div++;
            }
        }
        return div == 1;
    };

}
