package br.edu.ifnmg.estudiofotografia;

/**
 *
 * @author Rikelme
 */
public class Pessoa {
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    
    private String nome;
    private Long cpf;
    private String email;
    
    
    
    
//</editor-fold>

    
    //<editor-fold defaultstate="collapsed" desc="Construtores">
      
    public Pessoa() {
    }

    public Pessoa(String nome, Long cpf, String email) {
        this.nome = nome;
        
        //TODO implementar o teste de CPF
        
        this.cpf = cpf;
        this.email = email;
    }

    
    
    
//</editor-fold>
    
    
    //<editor-fold defaultstate="collapsed" desc="Getters e Setters">
    
     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
//</editor-fold>

    
    //<editor-fold defaultstate="collapsed" desc="To_String">
    
        @Override
    public String toString() {
        return ("Nome: " +nome+"\n"
                + "CPF: "+cpf+"\n"
                + "Email: "+email+"\n");
    }
    
//</editor-fold>

    
    

    

    
    
    
    
    
    
}
