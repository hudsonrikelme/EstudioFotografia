package br.edu.ifnmg.estudiofotografia.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author Rikelme, Artur e Dijalmir
 */
public class Pagamento
        extends Entidade {

//<editor-fold defaultstate="collapsed" desc="Atributos">
    private BigDecimal valor;
    private LocalDate dataPagamento;
    private Long contratoId;

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Pagamento() {
    }

    public Pagamento(BigDecimal valor, LocalDate dataPagamento, Long contratoId) {
        this.valor = valor;
        this.dataPagamento = dataPagamento;
        this.contratoId = contratoId;
    }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getters e Setters">
    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Long getcontratoId() {
        return contratoId;
    }

    public void setcontratoId(Long ContratoId) {
        this.contratoId = ContratoId;
    }

//</editor-fold>
}
