package primeiro_exemplo.modelos;

public class Pessoa {
    // Atributos
    public String nome;
    public int idade;

    // Métodos
    public boolean verificaMaioridade() {
        return this.idade >= 18;
    }

    // Método Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa() {}
}
