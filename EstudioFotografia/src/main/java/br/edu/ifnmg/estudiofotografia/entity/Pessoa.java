package br.edu.ifnmg.estudiofotografia.entity;

import br.edu.ifnmg.estudiofotografia.util.Util;

/**
 *
 * @author Rikelme, Artur e Dijalmir
 */
public class Pessoa 
        extends Entidade{
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    
    private String nome;
    private Long cpf;
    private String email;
    private String senha;
//</editor-fold>

    
    //<editor-fold defaultstate="collapsed" desc="Construtores">
      
    public Pessoa() {
    }

    public Pessoa(String nome, Long cpf, String email, String senha) {
        super(cpf);
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    
    
    
//</editor-fold>
    
    
    //<editor-fold defaultstate="collapsed" desc="Getters e Setters">
    
     public String getNome() {
        return nome;
    }

    public void setNome(String nome) 
              throws IllegalArgumentException {
        if (nome.length() > 50) {
            throw new IllegalArgumentException("Comprimento de nome inválido");
        }
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) 
             throws IllegalArgumentException {
        if (Util.isCpfValido(cpf)) {
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("CPF inválido");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
    
//</editor-fold>

    
    //<editor-fold defaultstate="collapsed" desc="To_String">
    
        @Override
    public String toString() {
        return "Entidade{id=" + getId()
                + "} Pessoa{"
                + "cpf=" + cpf
                + ", nome=" + nome
                + ", email=" + email
                + ", senha=" + senha
                + '}';
    }
    
//</editor-fold>

    
    

    

    
    
    
    
    
    
}
