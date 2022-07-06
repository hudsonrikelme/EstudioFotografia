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
//    private Long contrato_id;
    private Contrato contrato = new Contrato();

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Pagamento() {
    }
//    public Pagamento(BigDecimal valor, LocalDate dataPagamento, Long contrato_id) {
    public Pagamento(BigDecimal valor, LocalDate dataPagamento) {
        this.valor = valor;
        this.dataPagamento = dataPagamento;
//        this.contrato_id = contrato_id;
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

//    public Long getContrato_id() {
//        return contrato_id;
//    }
//
//    public void setContrato_id(Long contrato_id) {
//        this.contrato_id = contrato_id;
//    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }
    

//</editor-fold>



   
}
