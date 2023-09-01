package desafio_streamAPI;

import java.util.Arrays;
import java.util.List;

//Desafio 14 - Encontre o maior número primo da lista:
//Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
public class Desafio14 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 13, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.println(numeros.stream().filter(Desafio14::primo).sorted().reduce((n1, n2) -> n2).get());

    }
    public static boolean primo(int n){
        if(n<=0){
            return false;
        }
        else if (n <= 3) {
            return true;
        }

        for(int i=2; i<n; i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }

}
