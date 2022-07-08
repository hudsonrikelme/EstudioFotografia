package br.edu.ifnmg.estudiofotografia.repository;

import br.edu.ifnmg.estudiofotografia.entity.Cliente;
import br.edu.ifnmg.estudiofotografia.entity.TipoProduto;
import br.edu.ifnmg.estudiofotografia.entity.Contrato;
import br.edu.ifnmg.estudiofotografia.util.Util;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Cliente contratante = new Cliente(); C Colaborador fotografo = new
 * Colaborador(); TipoProduto itemContratado = new TipoProduto(); //////
 * LocalDateTime dataDoEvento; ArrayList<Pagamento>pagamentos = new
 * ArrayList<>();
 *
 * @author Rikelme
 */
public class ContratoDao
        extends Dao<Contrato, Long> {

    /*
    CREATE TABLE `contrato` (
        `id` bigint(20) NOT NULL AUTO_INCREMENT,
        `dataevento` date DEFAULT NULL,
        `cliente_id` bigint(20) NOT NULL,
        `tipoproduto_id` bigint(20) NOT NULL,
        PRIMARY KEY (`id`),
        foreign key (cliente_id) references cliente(id),
        foreign key(tipoproduto_id) references tipoproduto(id) 
    ) engine=Innodb;
-- */
//    
    @Override
    public String obterSentencaInsert() {
        return "insert into contrato (id, dataevento, cliente_id, tipoproduto_id) values (default, ?, ?, ?);";
    }

    @Override
    public String obterSentencaUpdate() {
        return "update contrato set dataevento = ?, cliente_id = ?, tipoproduto_id = ? where id = ?;";
    }

    @Override
    public String obterSentencaLocalizarPorId() {
        return "SELECT * FROM contrato WHERE id = ?;";
    }

    @Override
    public String obterSentencaLocalizarTodos() {
        return "SELECT * FROM contrato;";
    }

    @Override
    public void montarDeclaracao(PreparedStatement pstmt, Contrato e) {
        try {
            pstmt.setObject(1, e.getDataEvento(),
                    java.sql.Types.DATE);
            pstmt.setLong(2, e.getCliente().getId());
            pstmt.setLong(3, e.getTipoproduto().getId());

            if (e.getId() != null && e.getId() != 0) {
                pstmt.setLong(4, e.getId());
            }

        } catch (Exception ex) {
            System.out.println("Exceptoin: " + ex);
        }
    }

    /**
     * Extrai um objeto PessoaFisica do resultado gerado pela consulta
     *
     * @param resultSet Registro recuperado do banco de dados
     * @return PessoaFisica equivalente ao registro recebido
     */
    @Override
    public Contrato extrairObjeto(ResultSet resultSet) {
        Contrato c = new Contrato();

        try {
            c.setId(resultSet.getLong("id"));
            Long cliente_id = resultSet.getLong("cliente_id");
            c.setCliente((Cliente) new ClienteDao().localizarPorId(cliente_id));
            Long tipoproduto_id = resultSet.getLong("tipoproduto_id");
            c.setTipoproduto((TipoProduto) new TipoProdutoDao().localizarPorId(tipoproduto_id));
            //c.setTipoproduto_id(resultSet.getLong("tipoproduto_id"));

            c.setDataEvento(Util.convertDateToLocalDate(
                    resultSet.getDate("dataevento")));
        } catch (SQLException ex) {
            Logger.getLogger(ContratoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return c;
    }

    public List<Contrato> extrairObjetos(ResultSet resultSet) {

        // Cria referência para inserção dos livros a serem mapeados
        ArrayList<Contrato> contratos = new ArrayList<>();

        // Tenta...
        try {
            // ... enquanto houver registros a serem processados
            while (resultSet.next()) {

                // Insere o livro na lista de livros recuperados
                contratos.add(extrairObjeto(resultSet));
            }

        } catch (SQLException ex) {
            Logger.getLogger(ContratoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Devolve a lista de livros reconstituídos dos registros do banco 
        // de dados
        return contratos;
    }
}
