package br.edu.ifnmg.estudiofotografia.gui;

import br.edu.ifnmg.estudiofotografia.entity.Usuario;
import br.edu.ifnmg.estudiofotografia.repository.ConexaoBd;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Rikelme
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal(Usuario usuario) {
        initComponents();
        //Resolver Bloqueio de Cadastro de Usuario para não administradores
        if (usuario.getAdministrador()) {
            mnuCadastroUsuario.setEnabled(false);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        dskPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArquivo = new javax.swing.JMenu();
        mnuArquivoSair = new javax.swing.JMenuItem();
        mnuCadastro = new javax.swing.JMenu();
        mnuCadastroUsuario = new javax.swing.JMenuItem();
        mnuCadastroCliente = new javax.swing.JMenuItem();
        mnuCadastroContrato = new javax.swing.JMenuItem();
        mnuCadastroPagamento = new javax.swing.JMenuItem();
        mnuRelatorios = new javax.swing.JMenu();
        mnuRelatoriosContratos = new javax.swing.JMenuItem();
        mnuRelatoriosUsuarios = new javax.swing.JMenuItem();
        mnuRelatoriosPagamentos = new javax.swing.JMenuItem();
        mnuRelatoriosClientes = new javax.swing.JMenuItem();
        mnuRelatorioEventos = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Janela Principal");

        javax.swing.GroupLayout dskPrincipalLayout = new javax.swing.GroupLayout(dskPrincipal);
        dskPrincipal.setLayout(dskPrincipalLayout);
        dskPrincipalLayout.setHorizontalGroup(
            dskPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dskPrincipalLayout.setVerticalGroup(
            dskPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        mnuArquivo.setText("Arquivo");

        mnuArquivoSair.setText("Sair");
        mnuArquivoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoSairActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoSair);

        jMenuBar1.add(mnuArquivo);

        mnuCadastro.setText("Cadastro");
        mnuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastroActionPerformed(evt);
            }
        });

        mnuCadastroUsuario.setText("Usuario");
        mnuCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastroUsuarioActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuCadastroUsuario);

        mnuCadastroCliente.setText("Cliente");
        mnuCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastroClienteActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuCadastroCliente);

        mnuCadastroContrato.setText("Contrato");
        mnuCadastroContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastroContratoActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuCadastroContrato);

        mnuCadastroPagamento.setText("Pagamento");
        mnuCadastroPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastroPagamentoActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuCadastroPagamento);

        jMenuBar1.add(mnuCadastro);

        mnuRelatorios.setText("Relatórios");

        mnuRelatoriosContratos.setText("Contratos");
        mnuRelatoriosContratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRelatoriosContratosActionPerformed(evt);
            }
        });
        mnuRelatorios.add(mnuRelatoriosContratos);

        mnuRelatoriosUsuarios.setText("Usuarios");
        mnuRelatoriosUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRelatoriosUsuariosActionPerformed(evt);
            }
        });
        mnuRelatorios.add(mnuRelatoriosUsuarios);

        mnuRelatoriosPagamentos.setText("Pagamentos");
        mnuRelatoriosPagamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRelatoriosPagamentosActionPerformed(evt);
            }
        });
        mnuRelatorios.add(mnuRelatoriosPagamentos);

        mnuRelatoriosClientes.setText("Clientes");
        mnuRelatoriosClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRelatoriosClientesActionPerformed(evt);
            }
        });
        mnuRelatorios.add(mnuRelatoriosClientes);

        mnuRelatorioEventos.setText("Eventos");
        mnuRelatorioEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRelatorioEventosActionPerformed(evt);
            }
        });
        mnuRelatorios.add(mnuRelatorioEventos);

        jMenuBar1.add(mnuRelatorios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCadastroContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastroContratoActionPerformed
        CadastroContrato janela = CadastroContrato.getInstance();
        anexarJanela(janela);
    }//GEN-LAST:event_mnuCadastroContratoActionPerformed

    private void mnuRelatoriosContratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRelatoriosContratosActionPerformed
        try (InputStream in = getClass().getResourceAsStream("/RelatorioContratos.jasper")) {

            JasperPrint jasperPrint = JasperFillManager.fillReport(in, null, ConexaoBd.getConexao());
            JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);

            JDialog dialog = new JDialog(this);
            dialog.setContentPane(jasperViewer.getContentPane());
            dialog.setSize(jasperViewer.getSize());
            dialog.setTitle("Relatório de Contratos");
            dialog.setModal(true);
            dialog.setVisible(true);

        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_mnuRelatoriosContratosActionPerformed

    private void mnuArquivoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoSairActionPerformed
        dispose();
    }//GEN-LAST:event_mnuArquivoSairActionPerformed

    private void mnuCadastroPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastroPagamentoActionPerformed
        CadastroPagamento janela = CadastroPagamento.getInstance();
        anexarJanela(janela);
    }//GEN-LAST:event_mnuCadastroPagamentoActionPerformed

    private void mnuCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastroClienteActionPerformed
        CadastroCliente janela = CadastroCliente.getInstance();
        anexarJanela(janela);
    }//GEN-LAST:event_mnuCadastroClienteActionPerformed

    private void mnuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuCadastroActionPerformed

    private void mnuCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastroUsuarioActionPerformed
        CadastroUsuario janela = CadastroUsuario.getInstance();
        anexarJanela(janela);

    }//GEN-LAST:event_mnuCadastroUsuarioActionPerformed

    private void mnuRelatoriosUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRelatoriosUsuariosActionPerformed
        try (InputStream in = getClass().getResourceAsStream("/RelatorioUsuarios.jasper")) {
            JasperPrint jasperPrint = JasperFillManager.fillReport(in, null, ConexaoBd.getConexao());
            JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);

            JDialog dialog = new JDialog(this);
            dialog.setContentPane(jasperViewer.getContentPane());
            dialog.setSize(jasperViewer.getSize());
            dialog.setTitle("Relatório de Usuarios");
            dialog.setModal(true);
            dialog.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuRelatoriosUsuariosActionPerformed

    private void mnuRelatoriosPagamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRelatoriosPagamentosActionPerformed
        try (InputStream in = getClass().getResourceAsStream("/Pagamentos.jasper")) {
            JasperPrint jasperPrint = JasperFillManager.fillReport(in, null, ConexaoBd.getConexao());
            JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);

            JDialog dialog = new JDialog(this);
            dialog.setContentPane(jasperViewer.getContentPane());
            dialog.setSize(jasperViewer.getSize());
            dialog.setTitle("Relatório de Pagamentos");
            dialog.setModal(true);
            dialog.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuRelatoriosPagamentosActionPerformed

    private void mnuRelatoriosClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRelatoriosClientesActionPerformed
       try (InputStream in = getClass().getResourceAsStream("/RelatoriosClientes.jasper")) {
            JasperPrint jasperPrint = JasperFillManager.fillReport(in, null, ConexaoBd.getConexao());
            JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);

            JDialog dialog = new JDialog(this);
            dialog.setContentPane(jasperViewer.getContentPane());
            dialog.setSize(jasperViewer.getSize());
            dialog.setTitle("Relatório de Clientes");
            dialog.setModal(true);
            dialog.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuRelatoriosClientesActionPerformed

    private void mnuRelatorioEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRelatorioEventosActionPerformed
               try (InputStream in = getClass().getResourceAsStream("/RelatoriosEventos.jasper")) {
            JasperPrint jasperPrint = JasperFillManager.fillReport(in, null, ConexaoBd.getConexao());
            JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);

            JDialog dialog = new JDialog(this);
            dialog.setContentPane(jasperViewer.getContentPane());
            dialog.setSize(jasperViewer.getSize());
            dialog.setTitle("Relatório de Clientes");
            dialog.setModal(true);
            dialog.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuRelatorioEventosActionPerformed

    private void anexarJanela(JInternalFrame janela) {
        if (!janela.isVisible()) {
            dskPrincipal.add(janela);
        }
        janela.setVisible(true);
        try {
            janela.setIcon(false);
            janela.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        janela.toFront();
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dskPrincipal;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu mnuArquivo;
    private javax.swing.JMenuItem mnuArquivoSair;
    private javax.swing.JMenu mnuCadastro;
    private javax.swing.JMenuItem mnuCadastroCliente;
    private javax.swing.JMenuItem mnuCadastroContrato;
    private javax.swing.JMenuItem mnuCadastroPagamento;
    private javax.swing.JMenuItem mnuCadastroUsuario;
    private javax.swing.JMenuItem mnuRelatorioEventos;
    private javax.swing.JMenu mnuRelatorios;
    private javax.swing.JMenuItem mnuRelatoriosClientes;
    private javax.swing.JMenuItem mnuRelatoriosContratos;
    private javax.swing.JMenuItem mnuRelatoriosPagamentos;
    private javax.swing.JMenuItem mnuRelatoriosUsuarios;
    // End of variables declaration//GEN-END:variables
}
