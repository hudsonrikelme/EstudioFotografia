package br.edu.ifnmg.estudiofotografia.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author Rikelme, Artur e Dijalmir
 */
public class Contrato
        extends Entidade {

//<editor-fold defaultstate="collapsed" desc="Atributos">
    private Cliente cliente = new Cliente();
    private Colaborador fotografo = new Colaborador();
    private TipoProduto tipoproduto = new TipoProduto();
    private LocalDate dataEvento;
    private ArrayList<Pagamento> pagamentos = new ArrayList<>();

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Construtores">
    public Contrato() {
    }

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Getters e Setters">
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public TipoProduto getTipoproduto() {
        return tipoproduto;
    }

    public void setTipoproduto(TipoProduto tipoproduto) {
        this.tipoproduto = tipoproduto;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public Colaborador getFotografo() {
        return fotografo;
    }

    public void setFotografo(Colaborador fotografo) {
        this.fotografo = fotografo;
    }

    public ArrayList<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(ArrayList<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="To_String">
    @Override
    public String toString() {

        return ("Cliente: " + cliente.getNome() + "\n"
                + "     " + tipoproduto.getNome() + "\n"
                //                + "Valor do Contrato: "+ tipoproduto.getValor()+"\n"
                + "     Data: " + dataEvento + "\n");
    }

//</editor-fold>
}
