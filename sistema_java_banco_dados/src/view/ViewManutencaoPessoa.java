package view;

import controller.ControllerPessoaDB;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import model.ModelPessoa;
import model.ModelValidaCPFPessoa;

/**
 *
 * @author Gelvazio Camargo
 */
public class ViewManutencaoPessoa extends javax.swing.JFrame {

    ModelValidaCPFPessoa val = new ModelValidaCPFPessoa();

    ViewConsultaPessoa cons = new ViewConsultaPessoa(this, true);

    ControllerPessoaDB pessoadb = new ControllerPessoaDB();

    public ViewManutencaoPessoa() {
        initComponents();
        this.setLocationRelativeTo(null);
        edtCodigo.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        edtEndereco = new javax.swing.JTextField();
        edtCodigo = new javax.swing.JTextField();
        edtNome = new javax.swing.JTextField();
        edtCPF = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cadastro de Clientes");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 650, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Endereço");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Código");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Nome");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("CPF");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        edtEndereco.setEnabled(false);
        edtEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtEnderecoKeyPressed(evt);
            }
        });
        getContentPane().add(edtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 410, -1));

        edtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCodigoActionPerformed(evt);
            }
        });
        edtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtCodigoKeyPressed(evt);
            }
        });
        getContentPane().add(edtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 80, -1));

        edtNome.setEnabled(false);
        edtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtNomeKeyPressed(evt);
            }
        });
        getContentPane().add(edtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 410, -1));

        edtCPF.setEnabled(false);
        edtCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtCPFKeyPressed(evt);
            }
        });
        getContentPane().add(edtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 410, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Knob Valid Green.png"))); // NOI18N
        jButton2.setText("Gravar");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 130, 40));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Knob Remove Red.png"))); // NOI18N
        jButton3.setText("Excluir");
        jButton3.setEnabled(false);
        jButton3.setPreferredSize(new java.awt.Dimension(101, 41));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 130, 40));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Knob Cancel.png"))); // NOI18N
        jButton4.setText("Cancelar");
        jButton4.setEnabled(false);
        jButton4.setPreferredSize(new java.awt.Dimension(101, 41));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 130, 40));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, -1));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 610, 10));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 610, 10));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 610, 10));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Knob Search.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 40, 40));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Knob Add.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 40, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Knob Red.png"))); // NOI18N
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 130, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

//        if (cli.GravarAlterar(Integer.parseInt(jTextField2.getText()), jTextField3.getText(),
//                jTextField4.getText(), jTextField1.getText())) {
//
//            JOptionPane.showMessageDialog(null, "Cliente gravado/alterado com sucesso!");
//            limpaCampos();
//            habilitaCampos(false);
//            jTextField2.requestFocus();
//        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //cli.setCodigo(Integer.parseInt(jTextField2.getText()));

//        if (ven.procurarClienteNaVenda(cli.getCodigo())) {
//            JOptionPane.showMessageDialog(null, "Cliente já foi utilizado na venda, não pode ser excluído!");
//        } else {
//            if (cli.deletarCliente()) {
//                JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!");
//                limpaCampos();
//                habilitaCampos(false);
//                jTextField2.requestFocus();
//            }
//        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void edtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtCodigoKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER) || (evt.getKeyCode() == KeyEvent.VK_TAB)) {
            if (edtCodigo.getText().equals("")) {

                edtCodigo.setText(String.valueOf(pessoadb.getUltimoCodigo("tbpessoa", "pescodigo")));

                habilitaCampos(true);

                edtCodigo.requestFocus();
            } else {
                int codigo = Integer.parseInt(edtCodigo.getText());
                ModelPessoa pessoaBanco = new ModelPessoa();
                //pessoaBanco = pessoadb.getPessoa(codigo);
                if (pessoaBanco.getCodigo() > 0) {
                    edtEndereco.setText(pessoaBanco.getEndereco());
                    edtNome.setText(pessoaBanco.getNome());
                    edtCPF.setText(pessoaBanco.getCpf());

                    habilitaCampos(true);
                    edtNome.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(null, "Cliente não existe!");

                    habilitaCampos(false);

                    edtCodigo.requestFocus();
                }
            }
        }
    }//GEN-LAST:event_edtCodigoKeyPressed

    private void edtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            edtCPF.requestFocus();
        }
    }//GEN-LAST:event_edtNomeKeyPressed

    private void edtCPFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtCPFKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String cpf = edtCPF.getText();
            cpf = cpf.replace(".", "");
            cpf = cpf.replace("-", "");
            edtCPF.setText(cpf);
            if (ModelValidaCPFPessoa.validaCPF(edtCPF.getText())) {
                edtCPF.setText(val.imprimeCPF(edtCPF.getText()));
                edtEndereco.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "CPF Inválido");
                edtCPF.requestFocus();
            }
        }
    }//GEN-LAST:event_edtCPFKeyPressed

    private void edtEnderecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtEnderecoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Object[] opcoes = {"Sim", "Não"};
            int resposta;
            resposta = JOptionPane.showOptionDialog(null, "Deseja Salvar?", "Finalização", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

            if (resposta == 0) {
//                if (cli.GravarAlterar(Integer.parseInt(jTextField2.getText()), jTextField3.getText(),
//                        jTextField4.getText(), jTextField1.getText())) {
//
//                    JOptionPane.showMessageDialog(null, "Cliente gravado/alterado com sucesso!");
//                    limpaCampos();
//                    habilitaCampos(false);
//                    jTextField2.requestFocus();
//                }
            }
        }
    }//GEN-LAST:event_edtEnderecoKeyPressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void edtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCodigoActionPerformed

    }//GEN-LAST:event_edtCodigoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        limpaCampos();
        habilitaCampos(false);
        edtCodigo.requestFocus();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        edtCodigo.setText(String.valueOf(pessoadb.getUltimoCodigo("tbpessoa", "pescodigo")));

        habilitaCampos(true);

        edtNome.requestFocus();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        cons.setVisible(true);
        edtCodigo.setText(String.valueOf(cons.codigo));
        edtCodigo.requestFocus();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewManutencaoPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewManutencaoPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewManutencaoPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewManutencaoPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewManutencaoPessoa().setVisible(true);
            }
        });
    }

    public void habilitaCampos(boolean habilita) {
        edtEndereco.setEnabled(habilita);
        edtNome.setEnabled(habilita);
        edtCPF.setEnabled(habilita);
        jButton2.setEnabled(habilita);
        jButton3.setEnabled(habilita);
        jButton4.setEnabled(habilita);

        edtCodigo.setEnabled(!habilita);
        jButton5.setEnabled(!habilita);
        jButton6.setEnabled(!habilita);
        jButton1.setEnabled(!habilita);
    }

    public void limpaCampos() {
        edtEndereco.setText("");
        edtCodigo.setText("");
        edtNome.setText("");
        edtCPF.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField edtCPF;
    private javax.swing.JTextField edtCodigo;
    private javax.swing.JTextField edtEndereco;
    private javax.swing.JTextField edtNome;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    // End of variables declaration//GEN-END:variables
}
