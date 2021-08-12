package LimpaTudo;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno02.itb
 */
public class Cadastro_Classificacao extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro_Classificacao
     */
    public Cadastro_Classificacao() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        codigo = new javax.swing.JLabel();
        ctCodigo = new javax.swing.JTextField();
        classificacao = new javax.swing.JLabel();
        ctClassificacao = new javax.swing.JTextField();
        observacoes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        atObservacoes = new javax.swing.JTextArea();
        btIncluir = new javax.swing.JButton();
        btGravar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Classificação");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        codigo.setText("Código");

        ctCodigo.setEnabled(false);

        classificacao.setText("Classificação");

        observacoes.setText("Observações");

        atObservacoes.setColumns(20);
        atObservacoes.setRows(5);
        jScrollPane1.setViewportView(atObservacoes);

        btIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icos/32/incluir.png"))); // NOI18N
        btIncluir.setText("Incluir");
        btIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirActionPerformed(evt);
            }
        });

        btGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icos/32/avancar.png"))); // NOI18N
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
                .addComponent(ctCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ctClassificacao)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(codigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(classificacao)
                .addGap(128, 128, 128))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(observacoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(btIncluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btGravar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSair)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigo)
                    .addComponent(classificacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(observacoes)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSair)
                    .addComponent(btIncluir)
                    .addComponent(btGravar))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(408, 318));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirActionPerformed
        limpacampos();
        habilitacampos();
    }//GEN-LAST:event_btIncluirActionPerformed

    private void btGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarActionPerformed
        gravar();
    }//GEN-LAST:event_btGravarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        UnicaConexao con = new UnicaConexao();
        con.conectar();
    }//GEN-LAST:event_formWindowActivated

    private void limpacampos()
    {
        ctCodigo.setText("");
        ctClassificacao.setText("");
        atObservacoes.setText("");
    }
    
    private void habilitacampos()
    {
        ctClassificacao.setEditable(true);
        atObservacoes.setEditable(true);
    }
    
    private void gravar()
    {
        if(ctClassificacao.getText().equals("") || atObservacoes.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Algum(ns) campo(s) está(ão) vazio(s)!!",
                    "Erro", JOptionPane.INFORMATION_MESSAGE);
            ctClassificacao.requestFocus();
            atObservacoes.requestFocus();
            return;
        }
                
            
        String xClassificacao = ctClassificacao.getText();
        String xObservacoes = atObservacoes.getText();
        
        try{
            String sql = "INSERT INTO CLASSIFICACAO(classificacao, observacoes) VALUES "
                    + "('"+ xClassificacao + "','" + xObservacoes + "')";
            
            System.out.println(sql);
            Statement stm = VariaveisPublicas.ConexaoPadrao.createStatement();
            stm.executeUpdate(sql);
            stm.close();
            JOptionPane.showMessageDialog(rootPane, "Classificação cadastrada!",
                    "Cadastro de Classificação", JOptionPane.INFORMATION_MESSAGE);
            limpacampos();
           
        }
        
        catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, ex);
            Logger.getLogger(Cadastro_Classificacao.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Cadastro_Classificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Classificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Classificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Classificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_Classificacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea atObservacoes;
    private javax.swing.JButton btGravar;
    private javax.swing.JButton btIncluir;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel classificacao;
    private javax.swing.JLabel codigo;
    private javax.swing.JTextField ctClassificacao;
    private javax.swing.JTextField ctCodigo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel observacoes;
    // End of variables declaration//GEN-END:variables
}
