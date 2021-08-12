package Cadastros;

import Menu.VariaveisPublicas;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Cargos extends javax.swing.JFrame {


    public Cargos() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        codigo = new javax.swing.JLabel();
        ctCodigo = new javax.swing.JTextField();
        descricao = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ctDescricao = new javax.swing.JTextField();
        observacoes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        atObservacoes = new javax.swing.JTextArea();
        btLimpar = new javax.swing.JButton();
        btGravar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cargos");
        setResizable(false);

        codigo.setText("Código");

        ctCodigo.setEnabled(false);

        descricao.setText("Descrição");

        observacoes.setText("Observações");

        atObservacoes.setColumns(20);
        atObservacoes.setRows(5);
        jScrollPane1.setViewportView(atObservacoes);

        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icos/32/excluir.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icos/32/incluir.png"))); // NOI18N
        btGravar.setText("Gravar");
        btGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarActionPerformed(evt);
            }
        });

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icos/32/sair.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(codigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btGravar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSair))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(observacoes)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(descricao)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ctDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigo)
                    .addComponent(ctCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descricao)
                    .addComponent(jLabel3)
                    .addComponent(ctDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(observacoes)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSair)
                    .addComponent(btLimpar)
                    .addComponent(btGravar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(425, 313));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpacampos();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarActionPerformed
        gravar();
    }//GEN-LAST:event_btGravarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void limpacampos()
    {
        ctCodigo.setText("");
        ctDescricao.setText("");
        atObservacoes.setText("");
    }
    
    private void gravar()
    {
        if(ctDescricao.getText().equals("") && atObservacoes.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Descrição e Observações não informados!!",
                    "Erro", JOptionPane.INFORMATION_MESSAGE);
            ctDescricao.requestFocus();
            atObservacoes.requestFocus();
            return;
        }
        
        if(ctDescricao.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Descrição não informada!!",
                    "Erro", JOptionPane.INFORMATION_MESSAGE);
            ctDescricao.requestFocus();
            return;
        }
        
        if(atObservacoes.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Observações não informada!!",
                    "Erro", JOptionPane.INFORMATION_MESSAGE);
            atObservacoes.requestFocus();
            return;
        }
        
        String xDescricao = ctDescricao.getText();
        String xObservacoes = atObservacoes.getText();
        
        try{
            String sql = "INSERT INTO cargos(descricao, observacoes) "
                    + "VALUES( '" + xDescricao + "','" + xObservacoes + "')";
            System.out.println(sql);
            Statement stm = VariaveisPublicas.ConexaoPadrao.createStatement();
            stm.executeUpdate(sql);
            stm.close();
            JOptionPane.showMessageDialog(rootPane, "Cargo cadastrado!",
                    "Cadastro de Cargo", JOptionPane.INFORMATION_MESSAGE);
            limpacampos();
        }
        
        catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, ex);
            Logger.getLogger(Cargos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
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
            java.util.logging.Logger.getLogger(Cargos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cargos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cargos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cargos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cargos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atObservacoes;
    private javax.swing.JButton btGravar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel codigo;
    private javax.swing.JTextField ctCodigo;
    private javax.swing.JTextField ctDescricao;
    private javax.swing.JLabel descricao;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel observacoes;
    // End of variables declaration//GEN-END:variables
}
