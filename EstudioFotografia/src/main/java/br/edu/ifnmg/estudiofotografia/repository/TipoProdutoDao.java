package br.edu.ifnmg.estudiofotografia.repository;

import br.edu.ifnmg.estudiofotografia.entity.Pessoa;
import br.edu.ifnmg.estudiofotografia.entity.TipoProduto;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rikelme
 */
public class TipoProdutoDao 
            extends Dao<TipoProduto, Long>{
    /*
    CREATE TABLE `tipoproduto` (
        `id` bigint(20) NOT NULL AUTO_INCREMENT,
        `nome` varchar(50) NOT NULL,
        `duracao` double NOT NULL,
        `valor` decimal NOT NULL,
        PRIMARY KEY (`id`)
    ) engine=Innodb;
-- */
//    
    @Override
    public String obterSentencaInsert() {
        return "insert into tipoproduto (nome, duracao, valor) values (?, ?, ?);";
    }

    @Override
    public String obterSentencaUpdate() {
        return "update tipoproduto set nome = ?, duracao = ?, valor = ? where id = ?;";
    }

    @Override
    public String obterSentencaLocalizarPorId() {
        return "select id, nome, duracao, valor from tipoproduto where id = ?;";
    }

    @Override
    public String obterSentencaLocalizarTodos() {
        return "select id, nome, duracao, valor from tipoproduto;";
    }

    @Override
    public void montarDeclaracao(PreparedStatement pstmt, TipoProduto e) {
        try {
            pstmt.setString(1, e.getNome());
            pstmt.setDouble(2, e.getDuracao());
            pstmt.setBigDecimal(3, e.getValor());

            if (e.getId() != null && e.getId() != 0) {
                pstmt.setLong(6, e.getId());
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
    public TipoProduto extrairObjeto(ResultSet resultSet) {
        TipoProduto tp = new TipoProduto();

        try {
            tp.setId(resultSet.getLong("id"));
            tp.setNome(resultSet.getString("nome"));
            tp.setDuracao(resultSet.getDouble("duracao"));
            tp.setValor(resultSet.getBigDecimal("valor"));

        } catch (SQLException ex) {
            Logger.getLogger(TipoProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return tp;
    }
}
