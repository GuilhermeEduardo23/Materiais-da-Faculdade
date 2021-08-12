package Cadastros;

import Menu.VariaveisPublicas;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Clientes extends javax.swing.JFrame {

    public Clientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ctCodigo = new javax.swing.JTextField();
        codigo = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        ctNome = new javax.swing.JTextField();
        endereco = new javax.swing.JLabel();
        ctEndereco = new javax.swing.JTextField();
        numero = new javax.swing.JLabel();
        ctNumero = new javax.swing.JTextField();
        bairro = new javax.swing.JLabel();
        ctBairro = new javax.swing.JTextField();
        codcidade = new javax.swing.JLabel();
        ctCodCidade = new javax.swing.JTextField();
        btBuscaCidade = new javax.swing.JButton();
        cidade = new javax.swing.JLabel();
        ctCidade = new javax.swing.JTextField();
        uf = new javax.swing.JLabel();
        ctUF = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        btGravar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");
        setResizable(false);

        ctCodigo.setEnabled(false);

        codigo.setText("Código");

        nome.setText("Nome");

        endereco.setText("Endereço");

        numero.setText("Nº");

        bairro.setText("Bairro");

        codcidade.setText("Cód. Cidade");

        ctCodCidade.setEnabled(false);

        btBuscaCidade.setText("...");
        btBuscaCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscaCidadeActionPerformed(evt);
            }
        });

        cidade.setText("Cidade");

        ctCidade.setEnabled(false);

        uf.setText("UF");

        ctUF.setEnabled(false);

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
                        .addComponent(nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctNome))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(codigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ctCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(endereco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ctEndereco))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(bairro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ctBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(codcidade)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ctCodCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btBuscaCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cidade)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(ctCidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ctNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(uf)
                                .addComponent(ctUF, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btGravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSair)))
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
                    .addComponent(nome)
                    .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endereco)
                    .addComponent(ctEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero)
                    .addComponent(ctNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bairro)
                    .addComponent(ctBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cidade)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(codcidade)
                        .addComponent(uf)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btBuscaCidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ctCodCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ctCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ctUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSair)
                    .addComponent(btLimpar)
                    .addComponent(btGravar))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(416, 306));
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

    private void btBuscaCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscaCidadeActionPerformed
        Cadastro_Cidades_GetDados cidades = new Cadastro_Cidades_GetDados();
        buscaCidade();
    }//GEN-LAST:event_btBuscaCidadeActionPerformed
    
    private void buscaCidade(){
        Cadastro_Cidades_Dialog cidadesx = new Cadastro_Cidades_Dialog();
        
        ctCodCidade.setText(Cadastro_Cidades_GetDados.yCodCidade);
        ctCidade.setText(Cadastro_Cidades_GetDados.yCidade);
        ctUF.setText(Cadastro_Cidades_GetDados.yUF);
    }
    
    private void limpacampos()
    {
        ctCodigo.setText("");
        ctNome.setText("");
        ctEndereco.setText("");
        ctNumero.setText("");
        ctBairro.setText("");
        ctCodCidade.setText("");
        ctCidade.setText("");
        ctUF.setText("");
    }
    
    private void gravar()
    {
        if(ctNome.getText().equals("") || ctEndereco.getText().equals("") ||
                ctNumero.getText().equals("") || ctBairro.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Algum(ns) campo(s) está(ão) vazio(s)!!", 
                    "Erro", JOptionPane.INFORMATION_MESSAGE);
            ctNome.requestFocus();
            ctEndereco.requestFocus();
            ctNumero.requestFocus();
            ctBairro.requestFocus();
            return;
        }
        
        String xNome = ctNome.getText();
        String xEndereco = ctEndereco.getText();
        String xNumero = ctNumero.getText();
        String xBairro = ctBairro.getText();
        int xCodCidade = Integer.parseInt(ctCodCidade.getText());
        String xCidade = ctCidade.getText();
        String xUF = ctUF.getText();
        
        try{
            String sql = "INSERT INTO clientes(nome, endereco, numero, bairro, cod_cidade, cidade, uf)"
                    + "VALUES ( '" + xNome + "','" + xEndereco + "','" + xNumero + "','"
                    + xBairro + "','" + xCodCidade + "','" + xCidade + "','" + xUF + "')";
            
            System.out.println(sql);
            Statement stm = VariaveisPublicas.ConexaoPadrao.createStatement();
            stm.executeUpdate(sql);
            stm.close();
            
            JOptionPane.showMessageDialog(rootPane, "Cliente cadastrado!!",
                    "Cadastro de Clientes", JOptionPane.INFORMATION_MESSAGE);
            limpacampos();
        }
        
        catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, ex);
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bairro;
    private javax.swing.JButton btBuscaCidade;
    private javax.swing.JButton btGravar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel cidade;
    private javax.swing.JLabel codcidade;
    private javax.swing.JLabel codigo;
    private javax.swing.JTextField ctBairro;
    private javax.swing.JTextField ctCidade;
    private javax.swing.JTextField ctCodCidade;
    private javax.swing.JTextField ctCodigo;
    private javax.swing.JTextField ctEndereco;
    private javax.swing.JTextField ctNome;
    private javax.swing.JTextField ctNumero;
    private javax.swing.JTextField ctUF;
    private javax.swing.JLabel endereco;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel numero;
    private javax.swing.JLabel uf;
    // End of variables declaration//GEN-END:variables
}