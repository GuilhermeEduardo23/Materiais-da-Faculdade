/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author guilh_000
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
        cadCargos = new javax.swing.JMenuItem();
        cadCidades = new javax.swing.JMenuItem();
        cadClientes = new javax.swing.JMenuItem();
        cadFilmes = new javax.swing.JMenuItem();
        cadFuncionarios = new javax.swing.JMenuItem();
        cadGenero = new javax.swing.JMenuItem();
        locacao = new javax.swing.JMenu();
        locReserva = new javax.swing.JMenuItem();
        sobre = new javax.swing.JMenu();
        sobreSistema = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LocaSim");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Fundo_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/Fundo_Menu.jpg"))); // NOI18N

        cadastros.setText("Cadastros");

        cadCargos.setText("Cargos");
        cadCargos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadCargosActionPerformed(evt);
            }
        });
        cadastros.add(cadCargos);

        cadCidades.setText("Cidades");
        cadCidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadCidadesActionPerformed(evt);
            }
        });
        cadastros.add(cadCidades);

        cadClientes.setText("Clientes");
        cadClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadClientesActionPerformed(evt);
            }
        });
        cadastros.add(cadClientes);

        cadFilmes.setText("Filmes");
        cadFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadFilmesActionPerformed(evt);
            }
        });
        cadastros.add(cadFilmes);

        cadFuncionarios.setText("Funcionários");
        cadFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadFuncionariosActionPerformed(evt);
            }
        });
        cadastros.add(cadFuncionarios);

        cadGenero.setText("Gênero");
        cadGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadGeneroActionPerformed(evt);
            }
        });
        cadastros.add(cadGenero);

        jMenuBar1.add(cadastros);

        locacao.setText("Locação");

        locReserva.setText("Reserva");
        locReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locReservaActionPerformed(evt);
            }
        });
        locacao.add(locReserva);

        jMenuBar1.add(locacao);

        sobre.setText("Sobre");
        sobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sobreMouseClicked(evt);
            }
        });
        sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreActionPerformed(evt);
            }
        });

        sobreSistema.setText("Sistema");
        sobreSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreSistemaActionPerformed(evt);
            }
        });
        sobre.add(sobreSistema);

        jMenuBar1.add(sobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fundo_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 760, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fundo_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 517, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(776, 565));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreActionPerformed
       
    }//GEN-LAST:event_sobreActionPerformed

    private void sobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sobreMouseClicked
    }//GEN-LAST:event_sobreMouseClicked

    private void cadFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadFuncionariosActionPerformed
       Cadastros.Funcionarios funcionarios = new Cadastros.Funcionarios();
       funcionarios.setVisible(true);    }//GEN-LAST:event_cadFuncionariosActionPerformed

    private void sobreSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreSistemaActionPerformed
        JOptionPane.showMessageDialog(null, "LocaSim v. 1.0!!!", "Sistema", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_sobreSistemaActionPerformed

    private void cadCargosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadCargosActionPerformed
        Cadastros.Cargos cargos = new Cadastros.Cargos();
        cargos.setVisible(true);
    }//GEN-LAST:event_cadCargosActionPerformed

    private void cadCidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadCidadesActionPerformed
       Cadastros.Cidades cidades = new Cadastros.Cidades();
       cidades.setVisible(true);
    }//GEN-LAST:event_cadCidadesActionPerformed

    private void cadClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadClientesActionPerformed
       Cadastros.Clientes clientes = new Cadastros.Clientes();
       clientes.setVisible(true);
    }//GEN-LAST:event_cadClientesActionPerformed

    private void cadFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadFilmesActionPerformed
       Cadastros.Filmes filmes = new Cadastros.Filmes();
       filmes.setVisible(true);
    }//GEN-LAST:event_cadFilmesActionPerformed

    private void cadGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadGeneroActionPerformed
       Cadastros.Genero genero = new Cadastros.Genero();
       genero.setVisible(true);
    }//GEN-LAST:event_cadGeneroActionPerformed

    private void locReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locReservaActionPerformed
        Locacao.Reserva reserva = new Locacao.Reserva();
        reserva.setVisible(true);
    }//GEN-LAST:event_locReservaActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        UnicaConexao con = new UnicaConexao();
        con.conectar();
    }//GEN-LAST:event_formWindowActivated

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
    private javax.swing.JMenuItem cadCargos;
    private javax.swing.JMenuItem cadCidades;
    private javax.swing.JMenuItem cadClientes;
    private javax.swing.JMenuItem cadFilmes;
    private javax.swing.JMenuItem cadFuncionarios;
    private javax.swing.JMenuItem cadGenero;
    private javax.swing.JMenu cadastros;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem locReserva;
    private javax.swing.JMenu locacao;
    private javax.swing.JMenu sobre;
    private javax.swing.JMenuItem sobreSistema;
    // End of variables declaration//GEN-END:variables
}
