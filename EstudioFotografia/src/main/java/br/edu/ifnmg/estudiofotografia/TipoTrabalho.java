package br.edu.ifnmg.estudiofotografia;

import java.math.BigDecimal;

/**
 *
 * @author Rikelme
 */
public class TipoTrabalho {
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">
       
        private Integer index;
        private String nome=new String();
        private BigDecimal remuneracao;
        
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Construtor">

    public TipoTrabalho() {
    }

    public TipoTrabalho(Integer index) {

        this.index = index;

        if (null != index) {
            switch (index) {
                case 1:
                    this.nome = "Fotografo Senior";
                    this.remuneracao = new BigDecimal("500");
                    break;
                case 2:
                    this.nome = "Segundo Junior";
                    this.remuneracao = new BigDecimal("400");
                    break;
                case 3:
                    this.nome = "Estagiário";
                    this.remuneracao = new BigDecimal("300");
                    break;
                default:
                    break;
            }
        }

        
    }

        
        
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters e Setters">
         
         public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getFuncaoNoEnsaio() {
        return nome;
    }

    public void setFuncaoNoEnsaio(String nome) {
        this.nome = nome;
    }

    public BigDecimal getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(BigDecimal remuneracao) {
        this.remuneracao = remuneracao;
    }
         
         
         
         
         
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="To_String">
    
        @Override
    public String toString() {
        
        return ("Codigo da atividade: "+index+"\n"
                + "Tipo de Função no ensaio: "+nome+"\n"
                + "Remuneração: "+remuneracao+"\n");
    
    }
   
    
//</editor-fold>
    

         
         
         
         

        
        
    




    
    
    
    

    
}
