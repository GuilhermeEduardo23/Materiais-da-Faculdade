/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

/**
 *
 * @author aluno02.itb
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fundo_Menu = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        cadastros = new javax.swing.JMenu();
        aluno = new javax.swing.JMenuItem();
        cidade = new javax.swing.JMenuItem();
        disciplina = new javax.swing.JMenuItem();
        nota = new javax.swing.JMenuItem();
        professor = new javax.swing.JMenuItem();
        titulacao = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de Notas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Fundo_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/abstrato_azul.jpg"))); // NOI18N

        cadastros.setText("Cadastros");

        aluno.setText("Aluno");
        aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alunoActionPerformed(evt);
            }
        });
        cadastros.add(aluno);

        cidade.setText("Cidade");
        cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeActionPerformed(evt);
            }
        });
        cadastros.add(cidade);

        disciplina.setText("Disciplina");
        disciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disciplinaActionPerformed(evt);
            }
        });
        cadastros.add(disciplina);

        nota.setText("Nota");
        nota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notaActionPerformed(evt);
            }
        });
        cadastros.add(nota);

        professor.setText("Professor");
        professor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                professorActionPerformed(evt);
            }
        });
        cadastros.add(professor);

        titulacao.setText("Titulação");
        titulacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titulacaoActionPerformed(evt);
            }
        });
        cadastros.add(titulacao);

        jMenuBar1.add(cadastros);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fundo_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fundo_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 487, Short.MAX_VALUE)
        );

        setBounds(0, 0, 816, 547);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        UnicaConexao con = new UnicaConexao();
        con.conectar();
    }//GEN-LAST:event_formWindowOpened

    private void alunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alunoActionPerformed
        Cadastros.Aluno aluno = new Cadastros.Aluno();
        aluno.setVisible(true);
    }//GEN-LAST:event_alunoActionPerformed

    private void cidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeActionPerformed
        Cadastros.Cidade cidade = new Cadastros.Cidade();
        cidade.setVisible(true);
    }//GEN-LAST:event_cidadeActionPerformed

    private void disciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disciplinaActionPerformed
        Cadastros.Disciplinas disciplinas = new Cadastros.Disciplinas();
        disciplinas.setVisible(true);
    }//GEN-LAST:event_disciplinaActionPerformed

    private void notaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notaActionPerformed
        Cadastros.Lancamento_de_Notas notas = new Cadastros.Lancamento_de_Notas();
        notas.setVisible(true);
    }//GEN-LAST:event_notaActionPerformed

    private void professorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_professorActionPerformed
        Cadastros.Professor professor = new Cadastros.Professor();
        professor.setVisible(true);
    }//GEN-LAST:event_professorActionPerformed

    private void titulacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titulacaoActionPerformed
        Cadastros.Titulacao titulacao = new Cadastros.Titulacao();
        titulacao.setVisible(true);
    }//GEN-LAST:event_titulacaoActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo_Menu;
    private javax.swing.JMenuItem aluno;
    private javax.swing.JMenu cadastros;
    private javax.swing.JMenuItem cidade;
    private javax.swing.JMenuItem disciplina;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem nota;
    private javax.swing.JMenuItem professor;
    private javax.swing.JMenuItem titulacao;
    // End of variables declaration//GEN-END:variables
}
