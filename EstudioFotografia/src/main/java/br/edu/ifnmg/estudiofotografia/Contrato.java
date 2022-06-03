package br.edu.ifnmg.estudiofotografia;

import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author Rikelme
 */
public class Contrato {
    private Cliente contratante;
    private Colaborador fotografo;
    private TipoProduto produtoContratado;
    private LocalDateTime dataEvento;
    private List<Pagamento> pagamentos;
    
}
