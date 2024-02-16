package primeiro_exemplo;

import primeiro_exemplo.modelos.Pessoa;
import primeiro_exemplo.modelos.PessoaFisica;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Funciona!!!");

        Pessoa p1 = new Pessoa();
        p1.nome = "Marco";
        p1.idade = 43;

        // Pessoa p2 = p1;
        // p2.nome = "Teste";

        // System.out.println(p1.nome + " : " + p1.idade);
        // System.out.println(p2.nome + " : " + p2.idade);

        Pessoa p3 = new Pessoa();
        p3.nome = "Testando";
        p3.idade = 16;
        System.out.println(p1.verificaMaioridade());
        System.out.println(p3.verificaMaioridade());

        Pessoa p4 = new Pessoa("Construtor", 45);
        System.out.println(p4.nome);

        PessoaFisica p5 = new PessoaFisica();
        p5.nome = "Herança";
        p5.cpf = "45698756322";
        System.out.println(p5.nome + " : " + p5.cpf);
    }
}