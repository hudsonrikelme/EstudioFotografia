package br.edu.ifnmg.estudiofotografia.entity;

/**
 *
 * @author Rikelme, Artur e Djalmir
 */
public abstract class Entidade {
    // Representação da chave primária padrão para a entidade.
    private Long id;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Entidade() {
    }

    public Entidade(Long id) {
        this.id = id;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    //</editor-fold>

}
