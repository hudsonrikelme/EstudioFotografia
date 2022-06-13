package br.edu.ifnmg.estudiofotografia.entity;

import br.edu.ifnmg.estudiofotografia.entity.Contrato;
import br.edu.ifnmg.estudiofotografia.entity.Pessoa;
import java.util.ArrayList;
/**
 *
 * @author Rikelme, Artur e Dijalmir
 */
public class Cliente extends Pessoa {
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private ArrayList<Contrato> contratos = new ArrayList<>();

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Cliente() {
    }

    public Cliente(Pessoa p1) {

        super.setNome(p1.getNome());
        super.setEmail(p1.getEmail());
        super.setCpf(p1.getCpf());

    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Métodos para o arrayList de contratos">
    public void addContrato(Contrato c1) {

        contratos.add(c1);

    }

    public void removeContrato(Contrato c1) {

        contratos.remove(c1);

    }

    public int numeroDeContratos() {
        return contratos.size();

    }

//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="To_string">
    @Override
    public String toString() {
        return ("Nome do cliente: " + super.getNome() + "\n"
                + "CPF: " + super.getCpf() + "\n"
                + "Email: " + super.getEmail() + "\n"
                + "Numero de Cotratos: " + this.numeroDeContratos()+"\n");
    }
//</editor-fold>



    
    
    
    
    
}
