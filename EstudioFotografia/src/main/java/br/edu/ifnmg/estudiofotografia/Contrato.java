package br.edu.ifnmg.estudiofotografia;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Rikelme, Artur e Djalmir
 */
public class Contrato {
    
//<editor-fold defaultstate="collapsed" desc="Atributos">
    
    private Cliente contratante = new Cliente();
    private Colaborador fotografo = new Colaborador();
    private TipoProduto itemContratado = new TipoProduto();
    private LocalDateTime dataDoEvento;
    private ArrayList<Pagamento>pagamentos = new ArrayList<>(); 
    
    
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Construtores">
    
        public Contrato() {
    }

    
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Getters e Setters">
        
        
    public Cliente getContratante() {
        return contratante;
    }

    public void setContratante(Cliente contratante) {
        this.contratante = contratante;
    }

    public Colaborador getFotografo() {
        return fotografo;
    }

    public void setFotografo(Colaborador fotografo) {
        this.fotografo = fotografo;
    }

    public TipoProduto getItemContratado() {
        return itemContratado;
    }

    public void setItemContratado(TipoProduto itemContratado) {
        this.itemContratado = itemContratado;
    }

    public LocalDateTime getDataDoEvento() {
        return dataDoEvento;
    }

    public void setDataDoEvento(LocalDateTime dataDoEvento) {
        this.dataDoEvento = dataDoEvento;
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

        return ("Dados do contrato: "+"\n"
                + "Nome do cliente: "+ contratante.getNome()+"\n"
                + "Nome do fotógrafo: "+ fotografo.getNome()+"\n"
                + "Item Contratado: "+ itemContratado.getNome()+"\n"
                + "Valor do Contrato: "+ itemContratado.getValor()+"\n"
                + "Data do evento: "+ dataDoEvento+"\n"
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
