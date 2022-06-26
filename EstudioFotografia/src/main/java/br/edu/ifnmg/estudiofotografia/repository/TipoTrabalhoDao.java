package br.edu.ifnmg.estudiofotografia.repository;

import br.edu.ifnmg.estudiofotografia.entity.TipoTrabalho;
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
public class TipoTrabalhoDao 
            extends Dao<TipoTrabalho, Long>{    
    /*
    CREATE TABLE `tipotrabalho` (
        `id` bigint(20) NOT NULL AUTO_INCREMENT,
        `nome` varchar(50) NOT NULL,
        `remuneracao` decimal NOT NULL,
        `index` integer NOT NULL,
        PRIMARY KEY (`id`)
    ) engine=Innodb;
-- */
//    
    @Override
    public String obterSentencaInsert() {
        return "insert into tipotrabalho (index, nome, remuneracao) values (?, ?, ?);";
    }

    @Override
    public String obterSentencaUpdate() {
        return "update tipotrabalho set index = ?, nome = ?, remuneracao = ? where id = ?;";
    }

    @Override
    public String obterSentencaLocalizarPorId() {
        return "select id, index, nome, remuneracao from tipotrabalho where id = ?;";
    }

    @Override
    public String obterSentencaLocalizarTodos() {
        return "select index, nome, remuneracao from tipotrabalho where excluido = false;";
    }

    @Override
    public void montarDeclaracao(PreparedStatement pstmt, TipoTrabalho e) {
        try {
            pstmt.setInt(1, e.getIndex());
            pstmt.setString(2, e.getFuncaoNoEnsaio());
            pstmt.setBigDecimal(3, e.getRemuneracao());

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
    public TipoTrabalho extrairObjeto(ResultSet resultSet) {
        TipoTrabalho tipotrabalho = new TipoTrabalho();

        try {
            tipotrabalho.setId(resultSet.getLong("id"));
            tipotrabalho.setRemuneracao(resultSet.getBigDecimal("remuneracao"));
            tipotrabalho.setFuncaoNoEnsaio(resultSet.getString("nome"));

        } catch (SQLException ex) {
            Logger.getLogger(TipoTrabalhoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return tipotrabalho;
    }
}
