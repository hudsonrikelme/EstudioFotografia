package br.edu.ifnmg.estudiofotografia.entity;

import br.edu.ifnmg.estudiofotografia.entity.Contrato;
import br.edu.ifnmg.estudiofotografia.entity.TipoTrabalho;
import br.edu.ifnmg.estudiofotografia.entity.Pessoa;
import java.util.ArrayList;
/**
 *
 * @author Rikelme, Artur e Dijalmir
 */
public class Colaborador extends Pessoa{
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    
        private TipoTrabalho funcaoNoEnsaio;
        private ArrayList<Contrato> historicoDeEventos = new ArrayList<Contrato>();
    
//</editor-fold>
    
     //<editor-fold defaultstate="collapsed" desc="Construtores">

        public Colaborador() {
        }
        
        
        public Colaborador(Pessoa p1) {
        super.setNome(p1.getNome());
        super.setEmail(p1.getEmail());
        super.setCpf(p1.getCpf());

    }
        
        
        public Colaborador(Pessoa p1, TipoTrabalho funcaoNoEnsaio) {
        super.setNome(p1.getNome());
        super.setEmail(p1.getEmail());
        super.setCpf(p1.getCpf());
        this.funcaoNoEnsaio = funcaoNoEnsaio;
    }
        
        
        
//</editor-fold>
        
    //<editor-fold defaultstate="collapsed" desc="Getters e Setters">
        
          public TipoTrabalho getFuncaoNoEnsaio() {
        return funcaoNoEnsaio;
    }

    public void setFuncaoNoEnsaio(TipoTrabalho funcaoNoEnsaio) {
        this.funcaoNoEnsaio = funcaoNoEnsaio;
    }
        
//</editor-fold>

     //<editor-fold defaultstate="collapsed" desc="Metodos do Arraylist de Equipes">
    
    void addEquipeNoHistorico(Contrato evt) {  //adiciona uma equipe ao histórico do colaborador
        historicoDeEventos.add(evt);
    }
    
    void removeEquipeDoHistorico(Contrato evt){
        historicoDeEventos.remove(evt);
    }
    
    int numeroDeEventos(){
        return historicoDeEventos.size();
    }
    
    
    
    
//</editor-fold>
    
    
    
    //<editor-fold defaultstate="collapsed" desc="To_string">
        @Override
    public String toString() {
        return ("Nome do Colaborador: "+super.getNome()+"\n"
                + "Email do colaborador: "+super.getEmail()+"\n"
                + "Função no ensaio: "+ funcaoNoEnsaio+"\n");
    }
//</editor-fold>
    

   
        





    
    
    
    
    
}
