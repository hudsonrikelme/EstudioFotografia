package br.edu.ifnmg.estudiofotografia;

/**
 *
 * @author Rikelme
 */
public class Pessoa {
    private String nome;
    private String email;
    private Long cpf;

    public Pessoa() {
    }

    public Pessoa(String nome, String email, Long cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", email=" + email + ", cpf=" + cpf + '}';
    }
    
    
}
