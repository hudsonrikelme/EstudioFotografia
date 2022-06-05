package br.edu.ifnmg.estudiofotografia;

import java.time.LocalDateTime;

/**
 *
 * @author Rikelme, Artur e Djalmir
 */
public class Program {
    public static void main(String[] args) {
        
//<editor-fold defaultstate="collapsed" desc="Definição de 5 Pessoas">
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        Pessoa p4 = new Pessoa();
        Pessoa p5 = new Pessoa();

        p1.setNome("Ana");
        p1.setCpf(112233L);
        p1.setEmail("ana@mail.com");

        p2.setNome("Carla");
        p2.setCpf(223344L);
        p2.setEmail("carla@mail.com");

        p3.setNome("Pedro");
        p3.setCpf(334455L);
        p3.setEmail("pedro@mail.com");

        p4.setNome("Mario");
        p4.setCpf(445566L);
        p4.setEmail("mario@mail.com");

        p5.setNome("João");
        p5.setCpf(556677L);
        p5.setEmail("João@mail.com");

        System.out.println("========Definição de 5 Pessoas========");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Definição dos tês tipos de trabalho">
        TipoTrabalho papelDePrimFotografo = new TipoTrabalho(1);
        TipoTrabalho papelDeSegFotografo = new TipoTrabalho(2);
        TipoTrabalho papelDeAssitente = new TipoTrabalho(3);

        System.out.println("========Definição de 3 tipos de trabalho========");
        System.out.println(papelDePrimFotografo);
        System.out.println(papelDeSegFotografo);
        System.out.println(papelDeAssitente);

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Definição de 3 colaboradores">
        Colaborador clb1 = new Colaborador(p3);
        Colaborador clb2 = new Colaborador(p4);
        Colaborador clb3 = new Colaborador(p5);

        System.out.println("========Definição de 3 Colaboradores========");
        System.out.println(clb1);
        System.out.println(clb2);
        System.out.println(clb3);

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Definição de 3 produtos">

TipoProduto prdt1=new TipoProduto(1);
TipoProduto prdt2=new TipoProduto(2);
TipoProduto prdt3=new TipoProduto(3);

        System.out.println("========Definição de 3 Produtos========");
        System.out.println(prdt1);
        System.out.println(prdt2);
        System.out.println(prdt3);


//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Definição de 2 clientes">


 Cliente cliente1=new Cliente(p1);
 Cliente cliente2=new Cliente(p2);


        System.out.println("========Definição de 2 Clientes========");
 
        System.out.println(cliente1);
        System.out.println(cliente2);
     
    
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Definição de 3 contratos">

Contrato contrato1 = new Contrato();

contrato1.setContratante(cliente1);
contrato1.setFotografo(clb1);
contrato1.setItemContratado(prdt1);
contrato1.setDataDoEvento(LocalDateTime.of(2022, 9, 3, 18, 30));

System.out.println("========Definição de Contratos========");

        System.out.println(contrato1);

//</editor-fold>


    }
}
