package Menu;

import Cadastro.Cadastro_Usuarios_GetDados;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sun.util.logging.PlatformLogger;


public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        senha = new javax.swing.JPasswordField();
        ok = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        IMGLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setText("Usuário");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 40, 70, 14);

        jLabel2.setText("Senha");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 40, 100, 14);
        getContentPane().add(usuario);
        usuario.setBounds(30, 60, 140, 30);
        getContentPane().add(senha);
        senha.setBounds(240, 60, 140, 30);

        ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icos/32/avancar.png"))); // NOI18N
        ok.setText("OK");
        ok.setMaximumSize(new java.awt.Dimension(111, 41));
        ok.setMinimumSize(new java.awt.Dimension(111, 41));
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        getContentPane().add(ok);
        ok.setBounds(60, 110, 110, 40);

        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icos/32/sair.png"))); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar);
        cancelar.setBounds(260, 110, 120, 40);

        IMGLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/IMGLogin.jpg"))); // NOI18N
        getContentPane().add(IMGLogin);
        IMGLogin.setBounds(0, 0, 400, 170);

        setSize(new java.awt.Dimension(399, 170));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        try{
            validaAcesso();
        }
        catch (ClassNotFoundException ex){
            Logger.getLogger(Login.class.getName()).
                    log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_okActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    public void validaAcesso() throws ClassNotFoundException
    {
        VariaveisPublicas var = new VariaveisPublicas();
        Cadastro_Usuarios_GetDados usu = new Cadastro_Usuarios_GetDados();
        usu.setUsuario(usuario.getText().toLowerCase());
        usu.setSenha(senha.getText().toLowerCase());
        String urlCon = "";
        String temUsuario = "nao";
        String temRole = "nao";
        String statusUsuario = "";
        
        try
        {
            Class.forName("org.postgresql.Driver");
            Connection conn = null;
                try{
                    String url = "jdbc:postgresql://localhost:5432/Aula_LPOOII";
                    String usuario = "postgres";
                    String senha = "123456";
                    
                    conn = (Connection) DriverManager.getConnection(url, usuario, senha);
                    urlCon = "jdbc:postgresql://localhost:5432/Aula_LPOOII";
                }
                catch(SQLException e){
                    JOptionPane.showMessageDialog(this, "Usuário ou Senha Incorretos!");
                }
                
                String sql = "SELECT usuario, situacao "
                        + "from cadastro_usuario where "
                        + "usuario = '"+usuario.getText().toLowerCase()+"'"
                        + " and senha = '"+senha.getText().toLowerCase()+"' ";
                
                Statement stm = conn.createStatement();
                ResultSet rsUsu = stm.executeQuery(sql);
                
                while(rsUsu.next())
                {
                    usu.setUsuario(usuario.getText());
                    temUsuario = "sim";
                    statusUsuario = (rsUsu.getString("situacao"));
                }
                
                if((temUsuario.equals("sim")) && (statusUsuario.equals("ATIVO")))
                        {
                            // verifica se este usuario tem role
                            try
                            {
                                String sqlRole = "select usename from pg_user where usename = '"+usu.yUsuario.toLowerCase()+"'";
                                Statement stmt = conn.createStatement();
                                ResultSet rs = stmt.executeQuery(sqlRole);
                                
                                while(rs.next())
                                {
                                    temRole = "sim";
                                }
                            }
                            catch(SQLException e)
                            {
                                JOptionPane.showMessageDialog(this, "ERRO: " + e.getMessage());
                            } 
                                if(temRole.equals("nao"))
                                {
                                    Statement stmRole = conn.createStatement();
                                    stmRole.executeUpdate
                                    ("create role "+usuario.getText().toLowerCase()+" "
                                    + "superuser login password '"+senha.getText()
                                            .toLowerCase()+"' ");
                                }
                                
                                conn.close();
                                conn = (Connection) DriverManager.getConnection
                                    (urlCon, usuario.getText().toLowerCase(),
                                            senha.getText().toLowerCase());
                                var.setConexao(conn);
                                
                                Menu m = new Menu();
                                m.setVisible(true);
                                
                                this.dispose();
                            
                        }
                else
                {
                    if(statusUsuario.equals("INATIVO")){
                        JOptionPane.showMessageDialog(this, "Usuário Inativo");
                        return;
                        }
                                
                        else{
                            JOptionPane.showMessageDialog(this, "Usuário ou Senha Inválido");
                            return;
                            }
                }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(this, "ERRO NO COMANDO SQL" + e.getMessage());
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IMGLogin;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton ok;
    private javax.swing.JPasswordField senha;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
