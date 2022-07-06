package br.edu.ifnmg.estudiofotografia.gui;

import br.edu.ifnmg.estudiofotografia.entity.Cliente;
import br.edu.ifnmg.estudiofotografia.entity.Pessoa;
import br.edu.ifnmg.estudiofotografia.repository.ClienteDao;
import br.edu.ifnmg.estudiofotografia.repository.PessoaDao;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author Rikelme
 */
public class CadastroCliente extends javax.swing.JInternalFrame {

    private static CadastroCliente instance;

    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
        initComponents();
    }

    public static CadastroCliente getInstance() {
        if (instance == null) {
            instance = new CadastroCliente();
        }
        return instance;
    }

    private void limparCampos() {
        ftfCadastroClienteCpf.setText(null);
        tfCadastroClienteEmail.setText(null);
        tfCadastroClienteNome.setText(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        tfCadastroClienteNome = new javax.swing.JTextField();
        tfCadastroClienteEmail = new javax.swing.JTextField();
        ftfCadastroClienteCpf = new javax.swing.JFormattedTextField();
        btnCadastrar = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro Cliente");

        lblNome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNome.setText("Nome:");

        lblEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblEmail.setText("Email:");

        lblCpf.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblCpf.setText("CPF:");

        tfCadastroClienteNome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        tfCadastroClienteEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        try {
            ftfCadastroClienteCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfCadastroClienteCpf.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btnCadastrar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCadastrar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCpf)
                            .addComponent(lblEmail)
                            .addComponent(lblNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfCadastroClienteNome, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(tfCadastroClienteEmail)
                            .addComponent(ftfCadastroClienteCpf))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(tfCadastroClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(tfCadastroClienteEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf)
                    .addComponent(ftfCadastroClienteCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(btnCadastrar)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Pessoa pessoa = new Pessoa();
        PessoaDao pessoaDao = new PessoaDao();
        //JFormattedTextField cpf = new JFormattedTextField();
        //cpf.setValue(ftfCadastroClienteCpf);
        if (tfCadastroClienteNome.getText().length() < 50) {
            if (tfCadastroClienteEmail.getText().length() < 255) {
                pessoa.setNome(tfCadastroClienteNome.getText());
                Double valor = Double.parseDouble(ftfCadastroClienteCpf.getText());
                pessoa.setCpf(valor.longValue());
                pessoa.setEmail(tfCadastroClienteEmail.getText());

                Long id = pessoaDao.salvar(pessoa);
                pessoa.setId(id);

                Cliente cliente = new Cliente(pessoa);
                ClienteDao clientedao = new ClienteDao();
                id = clientedao.salvar(cliente);
                cliente.setId(id);
                JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso");
                dispose();
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(null, "O Email tem mais de 255 caracteres");
            }

        } else {
            JOptionPane.showMessageDialog(null, "O Nome do Cliente tem mais 50 caracteres");
        }

    }//GEN-LAST:event_btnCadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JFormattedTextField ftfCadastroClienteCpf;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTextField tfCadastroClienteEmail;
    private javax.swing.JTextField tfCadastroClienteNome;
    // End of variables declaration//GEN-END:variables
}
