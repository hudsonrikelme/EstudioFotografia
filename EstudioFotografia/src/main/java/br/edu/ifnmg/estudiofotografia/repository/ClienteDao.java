package br.edu.ifnmg.estudiofotografia.repository;

import br.edu.ifnmg.estudiofotografia.entity.Cliente;
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
        extends Dao<Cliente, Long>{
   /*
    CREATE TABLE `cliente` (
        `id` bigint(20) NOT NULL AUTO_INCREMENT,
        `cpf` bigint(20) NOT NULL,
        `nome` varchar(50) NOT NULL,
        `email` varchar(255) DEFAULT NULL,
        PRIMARY KEY (`id`),
        UNIQUE KEY `cpf` (`cpf`),
        UNIQUE KEY `email` (`email`)
    ) engine=Innodb;
-- */
//    
    @Override
    public String obterSentencaInsert() {
        return "insert into cliente (id, cpf, nome, email) values (default, ?, ?, ?);";
    }

    @Override
    public String obterSentencaUpdate() {
        return "update cliente set cpf = ?, nome = ?, email = ? where id = ?;";
    }

    @Override
    public String obterSentencaLocalizarPorId() {
        return "select id, cpf, nome, email from cliente where id = ?;";
    }

    @Override
    public String obterSentencaLocalizarTodos() {
        return "select id, cpf, nome, email from cliente;";
    }

    @Override
    public void montarDeclaracao(PreparedStatement pstmt, Cliente e) {
        try {
            pstmt.setLong(1, e.getCpf());
            pstmt.setString(2, e.getNome());
            pstmt.setString(3, e.getEmail());

            if (e.getId() != null && e.getId() != 0) {
                pstmt.setLong(5, e.getId());
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
    public Cliente extrairObjeto(ResultSet resultSet) {
        Cliente cliente = new Cliente();

        try {
            cliente.setId(resultSet.getLong("id"));
            cliente.setCpf(resultSet.getLong("cpf"));
            cliente.setNome(resultSet.getString("nome"));
            cliente.setEmail(resultSet.getString("email"));

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cliente;
    } 
}
