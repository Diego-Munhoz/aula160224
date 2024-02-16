package primeiro_exemplo.modelos;

public class Pessoa {
    // Atributos
    public String nome;
    public int idade;

    // Métodos
    public boolean verificarMarioriedade() {
        return this.idade >= 18;
    }
}
