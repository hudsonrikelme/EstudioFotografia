package br.edu.ifnmg.estudiofotografia.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Rikelme, Artur e Dijalmir
 */
public class Contrato 
            extends Entidade{
    
//<editor-fold defaultstate="collapsed" desc="Atributos">
    
    private Cliente cliente = new Cliente();
    private Colaborador fotografo = new Colaborador();
    private TipoProduto tipoproduto = new TipoProduto();
    private LocalDateTime dataEvento;
    private ArrayList<Pagamento>pagamentos = new ArrayList<>(); 
    private Long cliente_id;
    private Long tipoproduto_id;
    
    
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

    public LocalDateTime getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDateTime dataEvento) {
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

    public Long getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Long cliente_id) {
        this.cliente_id = cliente_id;
    }

    public Long getTipoproduto_id() {
        return tipoproduto_id;
    }

    public void setTipoproduto_id(Long tipoproduto_id) {
        this.tipoproduto_id = tipoproduto_id;
    }
        
    
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="To_String">
    @Override    
    public String toString() {

        return ("Dados do contrato: "+"\n"
                + "Nome do cliente: "+ cliente.getNome()+"\n"
                + "Nome do fotógrafo: "+ fotografo.getNome()+"\n"
                + "Item Contratado: "+ tipoproduto.getNome()+"\n"
                + "Valor do Contrato: "+ tipoproduto.getValor()+"\n"
                + "Data do evento: "+ dataEvento+"\n"
                );
    }

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Métodos para o array de pagamentos">
    public void addPagamento(Pagamento pgt1) {
        pagamentos.add(pgt1);
    }

    public void removePagamento(Pagamento pgt1) {

        pagamentos.remove(pgt1);
    }

    public void quantidadeDePagamentos() {

        pagamentos.size();

    }

    
//</editor-fold>
    
    

    
    }
