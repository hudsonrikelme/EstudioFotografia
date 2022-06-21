package br.edu.ifnmg.estudiofotografia.repository;

import br.edu.ifnmg.estudiofotografia.entity.Pessoa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rikelme
 */
public class ClienteDao 
        extends Dao<Pessoa, Long>{
    //private List<Contrato> contratos = new ArrayList<>();
   /*
    CREATE TABLE `cliente` (
        `id` bigint(11) NOT NULL AUTO_INCREMENT,
        `email` varchar(255) DEFAULT NULL,
        PRIMARY KEY (`id`),
    ) engine=Innodb;
-- */
//    
    @Override
    public String obterSentencaInsert() {
        return "insert into pessoa (cpf, nome, email) values (?, ?, ?);";
    }

    @Override
    public String obterSentencaUpdate() {
        return "update pessoa set cpf = ?, nome = ?, email = ? where id = ?;";
    }

    @Override
    public String obterSentencaLocalizarPorId() {
        return "select id, cpf, nome, email from pessoafisica where id = ?;";
    }

    @Override
    public String obterSentencaLocalizarTodos() {
        return "select id, cpf, nome, email from pessoafisica where excluido = false;";
    }

    @Override
    public void montarDeclaracao(PreparedStatement pstmt, Pessoa e) {
        try {
            pstmt.setLong(1, e.getCpf());
            pstmt.setString(2, e.getNome());
            pstmt.setString(3, e.getEmail());

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
    public Pessoa extrairObjeto(ResultSet resultSet) {
        Pessoa pf = new Pessoa();

        try {
            pf.setId(resultSet.getLong("id"));
            pf.setCpf(resultSet.getLong("cpf"));
            pf.setNome(resultSet.getString("nome"));
            pf.setEmail(resultSet.getString("email"));

        } catch (SQLException ex) {
            Logger.getLogger(PessoaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return pf;
    } 
}
