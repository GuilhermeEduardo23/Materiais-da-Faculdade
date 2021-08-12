/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastros;

import Menu.VariaveisPublicas;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author guilh_000
 */
public class Filmes extends javax.swing.JFrame {

    /**
     * Creates new form Filmes
     */
    public Filmes() {
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

        codigo = new javax.swing.JLabel();
        ctCodigo = new javax.swing.JTextField();
        titulo = new javax.swing.JLabel();
        ctTitulo = new javax.swing.JTextField();
        descricao = new javax.swing.JLabel();
        ctDescricao = new javax.swing.JTextField();
        duracao = new javax.swing.JLabel();
        cfDuracao = new javax.swing.JFormattedTextField();
        ano = new javax.swing.JLabel();
        cfAno = new javax.swing.JFormattedTextField();
        observacoes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        atObservacoes = new javax.swing.JTextArea();
        codgenero = new javax.swing.JLabel();
        ctCodGenero = new javax.swing.JTextField();
        btBuscaGenero = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btGravar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Filmes");
        setResizable(false);

        codigo.setText("Código");

        ctCodigo.setEnabled(false);

        titulo.setText("Título");

        descricao.setText("Descrição");

        duracao.setText("Duração");

        try {
            cfDuracao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cfDuracao.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ano.setText("Ano");

        try {
            cfAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cfAno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        observacoes.setText("Observações");

        atObservacoes.setColumns(20);
        atObservacoes.setRows(5);
        jScrollPane1.setViewportView(atObservacoes);

        codgenero.setText("Cód. Gênero");

        ctCodGenero.setEnabled(false);

        btBuscaGenero.setText("...");
        btBuscaGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscaGeneroActionPerformed(evt);
            }
        });

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
                        .addComponent(titulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(descricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctDescricao))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(observacoes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(codigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ctCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(duracao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cfDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(ano)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cfAno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(codgenero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ctCodGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btBuscaGenero)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 81, Short.MAX_VALUE)
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
                    .addComponent(titulo)
                    .addComponent(ctTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descricao)
                    .addComponent(ctDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(duracao)
                    .addComponent(cfDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ano)
                    .addComponent(cfAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(observacoes)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctCodGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codgenero)
                    .addComponent(btBuscaGenero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSair)
                    .addComponent(btLimpar)
                    .addComponent(btGravar))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(416, 396));
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

    private void btBuscaGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscaGeneroActionPerformed
        Cadastro_Genero_GetDados genero = new Cadastro_Genero_GetDados();
        buscaGenero();
    }//GEN-LAST:event_btBuscaGeneroActionPerformed

    private void buscaGenero(){
        Cadastro_Genero_Dialog generox = new Cadastro_Genero_Dialog();
        
        ctCodGenero.setText(Cadastro_Genero_GetDados.yCodGenero);
        ctDescricao.setText(Cadastro_Genero_GetDados.yDescricao);
        atObservacoes.setText(Cadastro_Genero_GetDados.yObservacoes);
    }
    
    private void limpacampos()
    {
        ctCodigo.setText("");
        ctTitulo.setText("");
        ctDescricao.setText("");
        cfDuracao.setText("");
        cfAno.setText("");
        atObservacoes.setText("");
        ctCodGenero.setText("");
    }
    
    private void gravar()
    {
        if(ctTitulo.getText().equals("") || ctDescricao.getText().equals("") ||
                cfDuracao.getText().equals("") || cfAno.getText().equals("") ||
                atObservacoes.getText().equals("") || ctCodGenero.getText().equals("") ||
                ctCodGenero.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Algum(ns) campo(s) está(ão) vazio(s)!!",
                    "Erro", JOptionPane.INFORMATION_MESSAGE);
            ctTitulo.requestFocus();
            ctDescricao.requestFocus();
            cfDuracao.requestFocus();
            cfAno.requestFocus();
            atObservacoes.requestFocus();
            ctCodGenero.requestFocus();
            return;
        }
        
        String xTitulo = ctTitulo.getText();
        String xDescricao = ctDescricao.getText();
        String xDuracao = cfDuracao.getText();
        String xAno = cfAno.getText();
        String xObservacoes = atObservacoes.getText();
        int xCodGenero = Integer.parseInt(ctCodGenero.getText());
        
        try{
            String sql = "INSERT INTO filmes(titulo, descricao, duracao, ano, observacoes, cod_genero) "
                    + "VALUES( '"+ xTitulo + "','" + xDescricao + "','" + xDuracao + "','"
                    + xAno + "','" + xObservacoes + "','" + xCodGenero + "')";
            System.out.println(sql);
            Statement stm = VariaveisPublicas.ConexaoPadrao.createStatement();
            stm.executeUpdate(sql);
            stm.close();
            JOptionPane.showMessageDialog(rootPane, "Filme cadastrado!!",
                    "Cadastro de Filmes", JOptionPane.INFORMATION_MESSAGE);
            limpacampos();
        }
        
        catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, ex);
            Logger.getLogger(Filmes.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Filmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Filmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Filmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Filmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Filmes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ano;
    private javax.swing.JTextArea atObservacoes;
    private javax.swing.JButton btBuscaGenero;
    private javax.swing.JButton btGravar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JFormattedTextField cfAno;
    private javax.swing.JFormattedTextField cfDuracao;
    private javax.swing.JLabel codgenero;
    private javax.swing.JLabel codigo;
    private javax.swing.JTextField ctCodGenero;
    private javax.swing.JTextField ctCodigo;
    private javax.swing.JTextField ctDescricao;
    private javax.swing.JTextField ctTitulo;
    private javax.swing.JLabel descricao;
    private javax.swing.JLabel duracao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel observacoes;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
