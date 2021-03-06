package br.edu.ifnmg.estudiofotografia;

import br.edu.ifnmg.estudiofotografia.entity.Cliente;
import br.edu.ifnmg.estudiofotografia.entity.Contrato;
import br.edu.ifnmg.estudiofotografia.entity.TipoProduto;
import br.edu.ifnmg.estudiofotografia.entity.Pessoa;
import br.edu.ifnmg.estudiofotografia.entity.Usuario;
import br.edu.ifnmg.estudiofotografia.repository.ClienteDao;
import br.edu.ifnmg.estudiofotografia.repository.PessoaDao;
import br.edu.ifnmg.estudiofotografia.repository.TipoProdutoDao;
import br.edu.ifnmg.estudiofotografia.repository.UsuarioDao;

/**
 *
 * @author Rikelme
 */
public class Program {

    public static void main(String[] args) {

//<editor-fold defaultstate="collapsed" desc="Definição de 5 Pessoas">
        Long id;
        Pessoa p1 = new Pessoa();
        PessoaDao pessoaDao = new PessoaDao();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        Pessoa p4 = new Pessoa();
        Pessoa p5 = new Pessoa();

        p1.setNome("Ana");
        p1.setCpf(74193712028L);
        p1.setEmail("ana@mail.com");

//        new PessoaDao().salvar(p1);
//        Long id = pessoaDao.salvar(p1);
//        p1.setId(id);
        p2.setNome("Carla Helem");
        p2.setCpf(69089421041L);
        p2.setEmail("carla@mail.com");

//        id = pessoaDao.salvar(p2);
//        p2.setId(id);
        p3.setNome("Pedro");
        p3.setCpf(34534095074L);
        p3.setEmail("pedro@mail.com");

//        id = pessoaDao.salvar(p3);
//        p3.setId(id);
//        new PessoaDao().salvar(p3);
        p4.setNome("Mario");
        p4.setCpf(79685316082L);
        p4.setEmail("mario@mail.com");

//        id = pessoaDao.salvar(p4);
//        p4.setId(id);
        //new PessoaDao().salvar(p4);
        p5.setNome("João");
        p5.setCpf(89312377078L);
        p5.setEmail("João@mail.com");

//        id = pessoaDao.salvar(p5);
//        p5.setId(id);
//        System.out.println("Pessoa: " + pessoaDao.localizarPorId(p1.getId()));
//        System.out.println("Pessoa: " + pessoaDao.localizarTodos());
//        new PessoaDao().salvar(p5);
//        System.out.println("========Definição de 5 Pessoas========");
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//        System.out.println(p4);
//        System.out.println(p5);
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Definição dos tês tipos de trabalho">
//        TipoTrabalho papelPrimeiroFotografo = new TipoTrabalho(1);
//        TipoTrabalho papelSegundoFotografo = new TipoTrabalho(2);
//        TipoTrabalho papelAssitente = new TipoTrabalho(3);
//        System.out.println("========Definição de 3 tipos de trabalho========");
//        System.out.println(papelPrimeiroFotografo);
//        System.out.println(papelSegundoFotografo);
//        System.out.println(papelAssitente);
//        
//        System.out.println("========Teste Banco de Dados========");
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Definição de 3 colaboradores">
//        Colaborador clb1 = new Colaborador(p3);
//        Colaborador clb2 = new Colaborador(p4);
//        Colaborador clb3 = new Colaborador(p5);
//
//        System.out.println("========Definição de 3 Colaboradores========");
//        System.out.println(clb1);
//        System.out.println(clb2);
//        System.out.println(clb3);
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Definição de 3 produtos">
        TipoProduto prdt1 = new TipoProduto(1);
        TipoProduto prdt2 = new TipoProduto(2);
        TipoProduto prdt3 = new TipoProduto(3);

        TipoProdutoDao tipoProdutoDao = new TipoProdutoDao();

        id = tipoProdutoDao.salvar(prdt1);
        prdt1.setId(id);
        id = tipoProdutoDao.salvar(prdt2);
        prdt2.setId(id);
        id = tipoProdutoDao.salvar(prdt3);
        prdt3.setId(id);

        System.out.println("========Definição de 3 Produtos========");
        System.out.println(prdt1);
        System.out.println(prdt2);
        System.out.println(prdt3);

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Definição de 2 clientes">
        Cliente cliente1 = new Cliente(p1);
        ClienteDao clientedao = new ClienteDao();
        Cliente cliente2 = new Cliente(p2);
//        id = clientedao.salvar(cliente1);
//        cliente1.setId(id);
//        id = clientedao.salvar(cliente2);
//        cliente2.setId(id);

//        System.out.println("========Definição de 2 Clientes========");
//
//        System.out.println(cliente1);
//        System.out.println(cliente2);
//        new ClienteDao().salvar(cliente1);
//        new ClienteDao().salvar(cliente2);
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Definição de 3 contratos">
        Contrato contrato1 = new Contrato();
//        contrato1.setTipoproduto(prdt1);
//        contrato1.setCliente(cliente1);
//        contrato1.setDataEvento(LocalDate.of(2022, 8, 25));
//        ContratoDao contratodao = new ContratoDao();
//        contratodao.salvar(contrato1);

//contrato1.setDataDoEvento(LocalDateTime.of(2022, 9, 3, 18, 30));
//        System.out.println("========Definição de Contratos========");
//
//        System.out.println(contrato1);
//</editor-fold>
//        PagamentoDao pagamentodao = new PagamentoDao();
//        Pagamento pagamento = new Pagamento();
//        pagamento.setContrato(contrato1);
//        pagamento.setDataPagamento(LocalDate.of(2022, 06, 24));
//        pagamento.setValor(BigDecimal.valueOf(3000.0) );
//        id = pagamentodao.salvar(pagamento);
//        pagamento.setId(id);
        //<editor-fold defaultstate="collapsed" desc="Usuario">
//        Usuario u = new Usuario();
//        u.setNomeSistema("hudsonrikelme");
//        u.setSenha("12345678");
//        u.setAdministrador(Boolean.TRUE);
//        Long novaId = new UsuarioDao().salvar(u);
//        System.out.println(">> " + novaId);
//        Usuario recuperado = new UsuarioDao().autenticar(u);
//        
//        if(recuperado != null) {
//            System.out.println("Usuário autêntico!");
//        } else {
//            System.out.println("Acesso não autorizado.");
//        }
        UsuarioDao usuariodao = new UsuarioDao();
        Usuario usuario = new Usuario();
        Usuario usuario1 = new Usuario();

        usuario.setAdministrador(Boolean.TRUE);
        usuario.setNomeSistema("administrador");
        usuario.setSenha("administrador");
        id = usuariodao.salvar(usuario);
        usuario.setId(id);

        usuario1.setAdministrador(Boolean.FALSE);
        usuario1.setNomeSistema("secretario");
        usuario1.setSenha("12345678");
        id = usuariodao.salvar(usuario1);
        usuario1.setId(id);

//</editor-fold>
    }
}
