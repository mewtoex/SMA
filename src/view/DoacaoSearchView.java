/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.DoacaoController;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import model.Doacao;

public class DoacaoSearchView extends javax.swing.JFrame {

    /**
     * Creates new form DoacaoSearchView
     */
    public DoacaoSearchView() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
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
        jBConsultar = new javax.swing.JButton();
        jBInserir = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jcB = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDespasa = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jCOpcoes = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jBConsultar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jBConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ImgNovo/Search_32px.png"))); // NOI18N
        jBConsultar.setText("Consultar");
        jBConsultar.setContentAreaFilled(false);
        jBConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultarActionPerformed(evt);
            }
        });

        jBInserir.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jBInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ImgNovo/File_32px.png"))); // NOI18N
        jBInserir.setText("Inserir");
        jBInserir.setContentAreaFilled(false);
        jBInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInserirActionPerformed(evt);
            }
        });

        jBAlterar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jBAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ImgNovo/Edit_32px.png"))); // NOI18N
        jBAlterar.setText("Alterar");
        jBAlterar.setContentAreaFilled(false);
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        jBSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ImgNovo/Multiply_25px.png"))); // NOI18N
        jBSair.setContentAreaFilled(false);
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jcB.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jcB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Mes", "Ano", "Mes/Ano", "Ativo" }));
        jcB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcBActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTDespasa);

        jPanel2.setBackground(new java.awt.Color(0, 0, 200));

        jCOpcoes.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jCOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCOpcoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jcB, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBAlterar)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBInserir)
                    .addComponent(jBAlterar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
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

    private void jBConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarActionPerformed

        //List<Doacao> Doacaos = DoacaoController.getInstance().consultarTodos();
        /*
        List<Doacao> doacao = DoacaoController.getInstance().
        buscar(jcB.getSelectedIndex(),
            jCOpcoes.getText());

         */
        List<Doacao> doacao = null;

        List<Doacao> c = DoacaoController.getInstance().
                busca(jcB.getSelectedIndex(),
                        jCOpcoes.getText());

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Quantidade");
        modelo.addColumn("Data");
        modelo.addColumn("Descricao");
        modelo.addColumn("Ativo");
        modelo.addColumn("Projeto");
        modelo.addColumn("Doador");

        for (Doacao i : c) {
            // Seta os valores do objeto para o JTableModel
            modelo.addRow(new Object[]{i.getId(), i.getQuantidade(), i.getData(), i.getDescricao(), i.getAtivo(), i.getProjeto().getNome(), i.getDoador().getNome()});
        }
        //Limpa a JTable (Grid)
        jTDespasa.removeAll();
        //Seta o modelo para a Grid
        jTDespasa.setModel(modelo);

        //Ajusta o tamanho da primeira coluna
        jTDespasa.getColumnModel().getColumn(0).setPreferredWidth(60);
        jTDespasa.getColumnModel().getColumn(0).setPreferredWidth(360);
        jTDespasa.getColumnModel().getColumn(0).setPreferredWidth(60);
        jTDespasa.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTDespasa.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTDespasa.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTDespasa.getColumnModel().getColumn(0).setPreferredWidth(50);

    }//GEN-LAST:event_jBConsultarActionPerformed

    private void jBInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInserirActionPerformed
        DoacaoEditView v = new DoacaoEditView();
        v.setLocationRelativeTo(null);
        v.LoadDoa();
        v.LoadProj();
        v.logo(true);
        v.setVisible(true);

        jBConsultar.doClick();
    }//GEN-LAST:event_jBInserirActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        int linha = jTDespasa.getSelectedRow();

        //Verifica se existe alguem selecionado
        if (linha >= 0) {
            Long id = (Long) jTDespasa.getValueAt(linha, 0);

            Doacao Doacao = DoacaoController.getInstance().buscarID(id);

            DoacaoEditView v = new DoacaoEditView();
            v.setLocationRelativeTo(null);
            v.LoadDoa();
            v.LoadProj();
            v.setDados(Doacao);
            v.logo(false);
            v.setVisible(true);

            jBConsultar.doClick();
    }//GEN-LAST:event_jBAlterarActionPerformed
    }
    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        dispose();
    }//GEN-LAST:event_jBSairActionPerformed

    private void jCOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCOpcoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCOpcoesActionPerformed

    private void jcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcBActionPerformed

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
            java.util.logging.Logger.getLogger(DoacaoSearchView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoacaoSearchView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoacaoSearchView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoacaoSearchView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoacaoSearchView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBConsultar;
    private javax.swing.JButton jBInserir;
    private javax.swing.JButton jBSair;
    private javax.swing.JTextField jCOpcoes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTDespasa;
    private javax.swing.JComboBox<String> jcB;
    // End of variables declaration//GEN-END:variables

}
