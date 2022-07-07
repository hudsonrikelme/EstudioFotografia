package br.edu.ifnmg.estudiofotografia.repository;

import br.edu.ifnmg.estudiofotografia.entity.Contrato;
import br.edu.ifnmg.estudiofotografia.entity.Pagamento;
import br.edu.ifnmg.estudiofotografia.util.Util;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Rikelme
 */
public class PagamentoDao 
            extends Dao<Pagamento, Long>{
    /*
    CREATE TABLE `pagamento` (
             `id` bigint(20) NOT NULL AUTO_INCREMENT,
             `valor` decimal NOT NULL,
             `datapagamento` date DEFAULT NULL,
             `contrato_id` bigint(20) NOT NULL,
             PRIMARY KEY (`id`),
             foreign key (contrato_id) references contrato(id)
         ) engine=Innodb DEFAULT CHARSET=latin1;
-- */
//  
    public List<Pagamento> localizarComentariosPorLivro(Contrato contrato) {

        // Declara referência para reter o(s) objeto(s) a ser(em) recuperado(s)
        List<Pagamento> pagamentos = new ArrayList<>();

        // Tenta preparar uma sentença SQL para a conexão já estabelecida
        try ( PreparedStatement pstmt
                = ConexaoBd.getConexao().prepareStatement(
                        // Sentença SQL para recuperação de todos os registros
                        obterDeclaracaoSelecionarPagamentosPorContrato())) {

            // Prepara a consulta com os parâmetros adequados
            pstmt.setLong(1, contrato.getId());

            // Executa o comando SQL
            ResultSet resultSet = pstmt.executeQuery();

            // Extrai objeto(s) do(s) respectivo(s) registro(s) do banco de dados
            pagamentos = extrairObjetos(resultSet);

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Devolve uma lista vazia (nenhum registro encontrado) 
        // ou a relação de objeto(s) recuperado(s)
        return pagamentos;
    }
    
    
    @Override
    public String obterSentencaInsert() {
        return "insert into pagamento (id, valor, datapagamento, contrato_id) values (default, ?, ?, ?);";
    }

    @Override
    public String obterSentencaUpdate() {
        return "update pagamento set valor = ?, datapagamento = ?, contrato_id = ? where id = ?;";
    }

    @Override
    public String obterSentencaLocalizarPorId() {
        return "SELECT * FROM pagamento WHERE id = ?;";
    }

    @Override
    public String obterSentencaLocalizarTodos() {
        return "SELECT * FROM pagamento;";
    }

    private String obterDeclaracaoSelecionarPagamentosPorContrato() {
        return "SELECT * FROM pagamento WHERE contrato_id = ?;";
    }
    @Override
    public void montarDeclaracao(PreparedStatement pstmt, Pagamento e) {
        try {
            //update
            pstmt.setBigDecimal(1, e.getValor());
            pstmt.setObject(2, e.getDataPagamento(),
                    java.sql.Types.DATE);
            pstmt.setLong(3, e.getContrato().getId());
            if (e.getId() != null && e.getId() != 0) {
                pstmt.setLong(4, e.getId());
            }

        } catch (Exception ex) {
            System.out.println("Exceptoin: " + ex);
        }
    }

    /**
     * Extrai um objeto Pagamento do resultado gerado pela consulta
     *
     * @param resultSet Registro recuperado do banco de dados
     * @return PessoaFisica equivalente ao registro recebido
     */
    @Override
    public Pagamento extrairObjeto(ResultSet resultSet) {
        Pagamento pagamento = new Pagamento();

        try {
            pagamento.setId(resultSet.getLong("id"));
            pagamento.setValor(resultSet.getBigDecimal("Valor"));
            pagamento.setDataPagamento(Util.convertDateToLocalDate(
                    resultSet.getDate("datapagamento")));
            Long contrato_id = resultSet.getLong("contrato_id");
            pagamento.setContrato(new ContratoDao().localizarPorId(contrato_id));
        } catch (SQLException ex) {
            Logger.getLogger(PagamentoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return pagamento;
    }
    public List<Pagamento> extrairObjetos(ResultSet resultSet) {

        // Cria referência para inserção das comentarios a serem mapeados
        ArrayList<Pagamento> pagamentos = new ArrayList<>();

        // Tenta...
        try {
            // ... entquanto houver registros a serem processados
            while (resultSet.next()) {
                // Insere o comentario na lista de comentarios recuperados
                pagamentos.add(extrairObjeto(resultSet));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PagamentoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Devolve a lista de comentarios reconstituídos dos registros do banco 
        // de dados
        return pagamentos;
    }

//    @Override
//    public Long salvar(Pagamento e) {
//        // Novo registro: nenhum objeto localizado para atualização
//        if (localizarPorId(e.getId()) == null) {
//            // try-with-resources libera recurso ao final do bloco (PreparedStatement)
//            try (PreparedStatement pstmt
//                    = ConexaoBd.getConexao().prepareStatement(
//                            // Sentença SQL para inserção de registros
//                            obterSentencaInsert())) {
//
//                // Prepara a declaração com os dados do objeto passado
//                pstmt.setLong(1, e.getId());
//                pstmt.setBigDecimal(2, e.getValor());
//                pstmt.setObject(3, e.getDataPagamento(),
//                    java.sql.Types.DATE);
//                pstmt.setLong(4, e.getContrato().getId());
//                // Executa o comando SQL
//                pstmt.executeUpdate();
//
//            } catch (Exception ex) {
//                ex.printStackTrace();
//            }
//
//        } else {
//            // Mesma operação de atualização da superclasse.
//            // Como a id terá um valor, sempre executará a atualização
//            // nesta chamada.
//            super.salvar(e);
//        }
//
//        // Cast requerido para adaptação do tipo pois, mesmo que a id seja sempre
//        // longa, esse trecho de código não reconhece tal tipo implicitamente
//        return e.getId();
//    }
    
}
