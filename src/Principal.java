public class Principal {
    public static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setIdade(12);

        System.out.println("*************************\n");

        Produto produto = new Produto("Celular", 2000.0);

        System.out.println("Nome do Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());

        produto.aplicarDesconto(10);
        System.out.println("Novo Preço após Desconto: " + produto.getPreco());

        System.out.println("*************************\n");

        Livro livro1 = new Livro();
        livro1.setAutor("Maiara");
        livro1.setTitulo("Harry Potter");
        livro1.exibirDetalhes();
    }
}
