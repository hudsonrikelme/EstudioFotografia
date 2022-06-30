package br.edu.ifnmg.estudiofotografia.entity;

/**
 * Usuario para acesso ao sistema
 *
 * @author 
 * 
 */
public class Usuario
        extends Entidade {

    private String nomeSistema;
    private String senha;
    private Boolean administrador;

    //<editor-fold defaultstate="collapsed" desc="Constructor">
    public Usuario() {
        administrador = false;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getNomeSistema() {
        return nomeSistema;
    }

    public void setNomeSistema(String nomeSistema) {
        this.nomeSistema = nomeSistema;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Boolean administrador) {
        this.administrador = administrador;
    }
    //</editor-fold>

}
