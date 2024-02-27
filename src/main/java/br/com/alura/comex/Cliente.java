
public class Cliente {
    String nome;
    String cpf;
    String email;
    String endereco;
    String telefone;
    int idade;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @java.lang.Override
    public String toString() {
        return "Cliente : " + nome + " - " +
                "cpf:" + cpf;
    }
}
