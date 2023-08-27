package list.ordenacao;

public class Teste {
    public static void main(String[] args) {
        OrdenacaoPessoas pessoasOrd = new OrdenacaoPessoas();

        pessoasOrd.adicionarPessoa("Pessoa #1", 20, 1.65);
        pessoasOrd.adicionarPessoa("Pessoa #2", 21, 1.60);
        pessoasOrd.adicionarPessoa("Pessoa #3", 19, 1.70);


        System.out.println(pessoasOrd.ordenarPorIdade());
        System.out.println();
        System.out.println(pessoasOrd.ordenarPorAltura());

    }
}
