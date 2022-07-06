package br.edu.ifnmg.estudiofotografia.gui;

import br.edu.ifnmg.estudiofotografia.entity.Contrato;
import br.edu.ifnmg.estudiofotografia.entity.Pagamento;
import br.edu.ifnmg.estudiofotografia.repository.ContratoDao;
import br.edu.ifnmg.estudiofotografia.repository.PagamentoDao;
import br.edu.ifnmg.estudiofotografia.util.Util;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Rikelme
 */
public class CadastroPagamento extends javax.swing.JInternalFrame {
    private static CadastroPagamento instance;
    private List<Contrato> todosContratos;
    /**
     * Creates new form CadastroContrato
     */
    public CadastroPagamento() {
        initComponents();
        
        
        todosContratos = new ContratoDao().localizarTodos();
        DefaultComboBoxModel<Contrato> comboBoxModel
                = new DefaultComboBoxModel<>();
        comboBoxModel.addAll(todosContratos);
        cbContrato.setModel(comboBoxModel);
        
        
    }
    public static CadastroPagamento getInstance(){
        if(instance == null){
            instance = new CadastroPagamento();
        }
        return instance;
    }
    private void limparCampos() {
        cbContrato.getModel().setSelectedItem(null);
        ftfValor.setText(null);
        dcDataPagamento.setDate(null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPagamentoCadastrar = new javax.swing.JButton();
        lblValor = new javax.swing.JLabel();
        lblContrato = new javax.swing.JLabel();
        cbContrato = new javax.swing.JComboBox<>();
        lblDataPagamento = new javax.swing.JLabel();
        dcDataPagamento = new com.toedter.calendar.JDateChooser();
        ftfValor = new javax.swing.JFormattedTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro Pagamento");

        btnPagamentoCadastrar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnPagamentoCadastrar.setText("Cadastrar");
        btnPagamentoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagamentoCadastrarActionPerformed(evt);
            }
        });

        lblValor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblValor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblValor.setText("Valor:");

        lblContrato.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblContrato.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblContrato.setText("Contrato:");

        cbContrato.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblDataPagamento.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblDataPagamento.setText("Data do Pagamento:");

        dcDataPagamento.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        ftfValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        ftfValor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPagamentoCadastrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblContrato)
                                    .addComponent(lblDataPagamento)))
                            .addComponent(lblValor, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbContrato, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dcDataPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(ftfValor))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContrato))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(ftfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDataPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(dcDataPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addComponent(btnPagamentoCadastrar)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPagamentoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagamentoCadastrarActionPerformed
            Pagamento pagamento = new Pagamento();
            Contrato contrato = new Contrato();

            pagamento.setContrato((Contrato) cbContrato.getSelectedItem());
            BigDecimal valor = new BigDecimal(ftfValor.getText());            
            pagamento.setValor(valor);
            pagamento.setDataPagamento(Util.convertDateToLocalDate(dcDataPagamento.getDate()));
            //Id Nao Encontrada
            pagamento.setId(contrato.getId());

            PagamentoDao pagamentodao = new PagamentoDao();
            Long id = pagamentodao.salvar(pagamento);
            pagamento.setId(id);
            
            dispose();
            limparCampos();
            
    }//GEN-LAST:event_btnPagamentoCadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPagamentoCadastrar;
    private javax.swing.JComboBox<Contrato> cbContrato;
    private com.toedter.calendar.JDateChooser dcDataPagamento;
    private javax.swing.JFormattedTextField ftfValor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblContrato;
    private javax.swing.JLabel lblDataPagamento;
    private javax.swing.JLabel lblValor;
    // End of variables declaration//GEN-END:variables
}
