public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 18){
            System.out.println("Você e maior de idade");
        } else {
            System.out.println("Você e menor de idade");
        }
        this.idade = idade;
    }
}
