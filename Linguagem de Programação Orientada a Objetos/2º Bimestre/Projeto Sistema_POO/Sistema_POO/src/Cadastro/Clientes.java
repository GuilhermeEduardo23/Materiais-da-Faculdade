/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro;

import Menu.VariaveisPublicas;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ronde
 */
public class Clientes extends javax.swing.JFrame {

    /**
     * Creates new form Clientes
     */
    public Clientes() {
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

        buttonGroup_tipoCliente = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        rb_juridica = new javax.swing.JRadioButton();
        rb_fisica = new javax.swing.JRadioButton();
        lbl_codigo = new javax.swing.JLabel();
        lbl_fantasia = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        txt_fantasia = new javax.swing.JTextField();
        lbl_razaoSocial = new javax.swing.JLabel();
        txt_razaoSocial = new javax.swing.JTextField();
        lbl_cnpjCpf = new javax.swing.JLabel();
        lbl_inscEstadualRg = new javax.swing.JLabel();
        cf_cnpjCpf = new javax.swing.JFormattedTextField();
        txt_inscEstadualRg = new javax.swing.JTextField();
        lbl_endereco = new javax.swing.JLabel();
        txt_endereco = new javax.swing.JTextField();
        lbl_numero = new javax.swing.JLabel();
        txt_numero = new javax.swing.JTextField();
        lbl_bairro = new javax.swing.JLabel();
        lbl_cep = new javax.swing.JLabel();
        lbl_telefone = new javax.swing.JLabel();
        txt_bairro = new javax.swing.JTextField();
        cf_cep = new javax.swing.JFormattedTextField();
        cf_telefone = new javax.swing.JFormattedTextField();
        lbl_codCidade = new javax.swing.JLabel();
        lbl_cidade = new javax.swing.JLabel();
        lbl_uf = new javax.swing.JLabel();
        txt_codCidade = new javax.swing.JTextField();
        txt_cidade = new javax.swing.JTextField();
        txt_uf = new javax.swing.JTextField();
        btn_buscaCid = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        at_observacoes = new javax.swing.JTextArea();
        btn_incluir = new javax.swing.JButton();
        btn_gravar = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tipo"));

        buttonGroup_tipoCliente.add(rb_juridica);
        rb_juridica.setSelected(true);
        rb_juridica.setText("Jurídica");
        rb_juridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_juridicaActionPerformed(evt);
            }
        });

        buttonGroup_tipoCliente.add(rb_fisica);
        rb_fisica.setText("Física");
        rb_fisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_fisicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(rb_juridica)
                .addGap(18, 18, 18)
                .addComponent(rb_fisica)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_juridica)
                    .addComponent(rb_fisica))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbl_codigo.setText("Código");

        lbl_fantasia.setText("Fantasia");

        lbl_razaoSocial.setText("Razão Social");

        lbl_cnpjCpf.setText("CNPJ");

        lbl_inscEstadualRg.setText("Insc. Estadual");

        try {
            cf_cnpjCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cf_cnpjCpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbl_endereco.setText("Endereço");

        lbl_numero.setText("Nº");

        lbl_bairro.setText("Bairro");

        lbl_cep.setText("CEP");

        lbl_telefone.setText("Telefone");

        try {
            cf_cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cf_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbl_codCidade.setText("Cód.Cidade");

        lbl_cidade.setText("Cidade");

        lbl_uf.setText("UF");

        txt_codCidade.setEnabled(false);

        txt_cidade.setEnabled(false);

        txt_uf.setEnabled(false);

        btn_buscaCid.setText("jButton1");
        btn_buscaCid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscaCidActionPerformed(evt);
            }
        });

        jLabel1.setText("Observações");

        at_observacoes.setColumns(20);
        at_observacoes.setRows(5);
        jScrollPane2.setViewportView(at_observacoes);

        btn_incluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icos/32/incluir.png"))); // NOI18N
        btn_incluir.setText("Incluir");
        btn_incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_incluirActionPerformed(evt);
            }
        });

        btn_gravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icos/32/avancar.png"))); // NOI18N
        btn_gravar.setText("Gravar");
        btn_gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gravarActionPerformed(evt);
            }
        });

        btn_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icos/32/sair.png"))); // NOI18N
        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_codCidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_buscaCid, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txt_bairro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl_bairro, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cf_cep, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_cep))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lbl_telefone)
                                            .addComponent(cf_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_cidade))
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_uf)
                                            .addComponent(txt_uf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_razaoSocial)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_endereco)
                                    .addComponent(txt_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_numero)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_numero)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_codigo)
                                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_fantasia)
                                    .addComponent(txt_fantasia)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_incluir)
                                .addGap(18, 18, 18)
                                .addComponent(btn_gravar)
                                .addGap(18, 18, 18)
                                .addComponent(btn_sair))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_razaoSocial)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_cnpjCpf)
                                            .addComponent(cf_cnpjCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_inscEstadualRg)
                                            .addComponent(txt_inscEstadualRg, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lbl_codCidade)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(172, 172, 172))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codigo)
                    .addComponent(lbl_fantasia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_fantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_razaoSocial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_razaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cnpjCpf)
                    .addComponent(lbl_inscEstadualRg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cf_cnpjCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_inscEstadualRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_endereco)
                    .addComponent(lbl_numero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_bairro)
                    .addComponent(lbl_cep)
                    .addComponent(lbl_telefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cf_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cf_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codCidade)
                    .addComponent(lbl_cidade)
                    .addComponent(lbl_uf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_codCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscaCid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_gravar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_incluir))
                .addGap(44, 44, 44))
        );

        setSize(new java.awt.Dimension(432, 645));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_sairActionPerformed

    private void rb_juridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_juridicaActionPerformed
        if(rb_juridica.isSelected()){
            lbl_cnpjCpf.setText("CNPJ");
            lbl_inscEstadualRg.setText("Insc. Estadual");
            cf_cnpjCpf.setText("");
            
            try{
                cf_cnpjCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
            }
            catch(ParseException ex){
                Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(rb_fisica.isSelected()){
            lbl_cnpjCpf.setText("CPF");
            lbl_inscEstadualRg.setText("RG");
            cf_cnpjCpf.setText("");

            try{
                cf_cnpjCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
            }
            catch(ParseException ex){
                Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_rb_juridicaActionPerformed

    private void rb_fisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_fisicaActionPerformed
       if(rb_juridica.isSelected()){
            lbl_cnpjCpf.setText("CNPJ");
            lbl_inscEstadualRg.setText("Insc. Estadual");
            cf_cnpjCpf.setText("");
            
            try{
                cf_cnpjCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
            }
            catch(ParseException ex){
                Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(rb_fisica.isSelected()){
            lbl_cnpjCpf.setText("CPF");
            lbl_inscEstadualRg.setText("RG");
            cf_cnpjCpf.setText("");
            
            try{
                cf_cnpjCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
            }
            catch(ParseException ex){
                Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_rb_fisicaActionPerformed

    private void btn_incluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_incluirActionPerformed
        limpacampos();
        habilitacampos();
    }//GEN-LAST:event_btn_incluirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        limpacampos();
        txt_codigo.setEditable(false);
    }//GEN-LAST:event_formWindowOpened

    private void btn_gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gravarActionPerformed
        gravar();
    }//GEN-LAST:event_btn_gravarActionPerformed

    private void btn_buscaCidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscaCidActionPerformed
        Cadastro_Cidades_GetDados dic = new Cadastro_Cidades_GetDados();
        buscaCidade();
    }//GEN-LAST:event_btn_buscaCidActionPerformed

    private void buscaCidade(){
        Cadastro_Cidades_Dialog cidx = new Cadastro_Cidades_Dialog();
        txt_codCidade.setText(Cadastro_Cidades_GetDados.yCodCid);
        txt_cidade.setText(Cadastro_Cidades_GetDados.yCidade);
        txt_uf.setText(Cadastro_Cidades_GetDados.yUF);
    }
    
    private void gravar(){
        String xFantasia = txt_fantasia.getText();
        String xRazao = txt_razaoSocial.getText();
        String xCnpjCpf = cf_cnpjCpf.getText();
        String xInscRg = txt_inscEstadualRg.getText();
        String xEndereco = txt_endereco.getText();
        String xNumero = txt_numero.getText();
        String xBairro = txt_bairro.getText();
        String xCep = cf_cep.getText();
        String xTelefone = cf_telefone.getText().replace("(", "").replace(")", "").replace("-", "");
        int xCodCidade = Integer.parseInt(txt_codCidade.getText());
        String xObservacoes = at_observacoes.getText();
        
        try{
           String sql = ""; 
           if(rb_juridica.isSelected()){
               sql = "INSERT INTO cadastro_clientes(razao, fantasia, cnpj, insc_est, end_logradouro, end_numero, end_bairro, end_cep, telefone, cod_cidade, observacoes)"
               + "VALUES ( '" + xRazao + "','" + xFantasia + "','" + xCnpjCpf + "','"  + xInscRg + "','" + xEndereco + "','" + xNumero + "','" + xBairro + "','" + xCep + "','" + xTelefone + "','" + xCodCidade + "','"+ xObservacoes + "')";
           }
           
           if(rb_fisica.isSelected()){
               sql = "INSERT INTO cadastro_clientes(razao, fantasia, cpf, rg, end_logradouro, end_numero, end_bairro, end_cep, telefone, cod_cidade, observacoes)"
               + "VALUES ( '" + xRazao + "','" + xFantasia + "','" + xCnpjCpf + "','"  + xInscRg + "','" + xEndereco + "','" + xNumero + "','" + xBairro + "','" + xCep + "','" + xTelefone + "','" + xCodCidade + "','"+ xObservacoes + "')";
           }
           
           System.out.println(sql);
           Statement stm = VariaveisPublicas.ConexaoPadrao.createStatement();
           stm.executeUpdate(sql);
           stm.close();
           
            JOptionPane.showMessageDialog(rootPane, "Cliente Cadastrado!");
            limpacampos();
        }
        
        catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, ex);
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    private void limpacampos(){
        txt_codigo.setText("");
        txt_fantasia.setText("");
        txt_razaoSocial.setText("");
        cf_cnpjCpf.setText("");
        txt_inscEstadualRg.setText("");
        txt_endereco.setText("");
        txt_numero.setText("");
        txt_bairro.setText("");
        cf_cep.setText("");
        cf_telefone.setText("");
        txt_codCidade.setText("");
        txt_cidade.setText("");
        txt_uf.setText("");
        at_observacoes.setText("");
    }
    
    private void habilitacampos(){
        txt_fantasia.setEditable(true);
        txt_razaoSocial.setEditable(true);
        cf_cnpjCpf.setEditable(true);
        txt_inscEstadualRg.setEditable(true);
        txt_endereco.setEditable(true);
        txt_numero.setEditable(true);
        txt_bairro.setEditable(true);
        cf_cep.setEditable(true);
        cf_telefone.setEditable(true);
        txt_codCidade.setEditable(true);
        txt_cidade.setEditable(true);
        txt_uf.setEditable(true);
        at_observacoes.setEditable(true);
        btn_buscaCid.setEnabled(true);
    }
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
    private javax.swing.JTextArea at_observacoes;
    private javax.swing.JButton btn_buscaCid;
    private javax.swing.JButton btn_gravar;
    private javax.swing.JButton btn_incluir;
    private javax.swing.JButton btn_sair;
    private javax.swing.ButtonGroup buttonGroup_tipoCliente;
    private javax.swing.JFormattedTextField cf_cep;
    private javax.swing.JFormattedTextField cf_cnpjCpf;
    private javax.swing.JFormattedTextField cf_telefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbl_bairro;
    private javax.swing.JLabel lbl_cep;
    private javax.swing.JLabel lbl_cidade;
    private javax.swing.JLabel lbl_cnpjCpf;
    private javax.swing.JLabel lbl_codCidade;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_endereco;
    private javax.swing.JLabel lbl_fantasia;
    private javax.swing.JLabel lbl_inscEstadualRg;
    private javax.swing.JLabel lbl_numero;
    private javax.swing.JLabel lbl_razaoSocial;
    private javax.swing.JLabel lbl_telefone;
    private javax.swing.JLabel lbl_uf;
    private javax.swing.JRadioButton rb_fisica;
    private javax.swing.JRadioButton rb_juridica;
    private javax.swing.JTextField txt_bairro;
    private javax.swing.JTextField txt_cidade;
    private javax.swing.JTextField txt_codCidade;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_endereco;
    private javax.swing.JTextField txt_fantasia;
    private javax.swing.JTextField txt_inscEstadualRg;
    private javax.swing.JTextField txt_numero;
    private javax.swing.JTextField txt_razaoSocial;
    private javax.swing.JTextField txt_uf;
    // End of variables declaration//GEN-END:variables
}
