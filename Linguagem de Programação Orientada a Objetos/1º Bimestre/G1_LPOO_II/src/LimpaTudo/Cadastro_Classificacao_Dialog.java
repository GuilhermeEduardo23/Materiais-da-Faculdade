package LimpaTudo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class Cadastro_Classificacao_Dialog extends javax.swing.JDialog {

    public Cadastro_Classificacao_Dialog(){
        new Cadastro_Classificacao_Dialog(null, true).setVisible(true);
    }
    
    public Cadastro_Classificacao_Dialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ctDescricao = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClassificacao = new javax.swing.JTable();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa de Classificações");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        ctDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ctDescricaoKeyReleased(evt);
            }
        });

        tblClassificacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Classificação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClassificacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClassificacaoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClassificacao);

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
                    .addComponent(ctDescricao)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btSair)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ctDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSair)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(408, 385));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void tblClassificacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClassificacaoMouseClicked
        if(evt.getClickCount() == 2){
            int linha = tblClassificacao.getSelectedRow();
            Cadastro_Classificacao_GetDados get = new Cadastro_Classificacao_GetDados();
            get.setCodClas(String.valueOf((String)tblClassificacao.getValueAt(linha, 0)));
            get.setClassificacao(String.valueOf((String)tblClassificacao.getValueAt(linha, 1)));
            this.dispose();
        }
    }//GEN-LAST:event_tblClassificacaoMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        carrega();
    }//GEN-LAST:event_formWindowOpened

    private void ctDescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ctDescricaoKeyReleased
        String pegaClas = String.valueOf(ctDescricao.getText());
        ctDescricao.setText(pegaClas);
        carrega();
    }//GEN-LAST:event_ctDescricaoKeyReleased

    private void carrega(){
        try{
            String sql = "select c.cod_classificacao, c.classificacao  " +
                    "from CLASSIFICACAO c "+
                    "where c.classificacao like '%" + ctDescricao.getText()+"%'"+
                    " order by c.classificacao";
            
            LimpaTudo.LimpaTabela.limparTabela(tblClassificacao);
            
            Statement stmt = (Statement) VariaveisPublicas.ConexaoPadrao.createStatement();
            ResultSet RS = (ResultSet) stmt.executeQuery(sql);
            
            DefaultTableModel model = (DefaultTableModel)tblClassificacao.getModel();
            
            DefaultTableCellRenderer centro = new DefaultTableCellRenderer();
            centro.setHorizontalAlignment(SwingConstants.CENTER);
            
            DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
            esquerda.setHorizontalAlignment(SwingConstants.LEFT);
            
            tblClassificacao.getColumnModel().getColumn(0).setCellRenderer(centro);
            tblClassificacao.getColumnModel().getColumn(1).setCellRenderer(esquerda);
            
            int cols = model.getColumnCount();
            int linha = model.getRowCount();
            
            while(RS.next()){
                ((javax.swing.table.DefaultTableModel)tblClassificacao.getModel()).addRow(new Object[cols]);
                
                tblClassificacao.setValueAt(RS.getString("cod_classificacao"), linha, 0);
                tblClassificacao.setValueAt(RS.getString("classificacao"), linha, 1);
                
                linha++;
            }
            RS.close();
            stmt.close();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro 1: " + ex.getMessage());
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
            java.util.logging.Logger.getLogger(Cadastro_Classificacao_Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Classificacao_Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Classificacao_Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Classificacao_Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Cadastro_Classificacao_Dialog dialog = new Cadastro_Classificacao_Dialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSair;
    private javax.swing.JTextField ctDescricao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClassificacao;
    // End of variables declaration//GEN-END:variables
}
