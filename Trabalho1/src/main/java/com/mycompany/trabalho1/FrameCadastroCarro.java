/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.trabalho1;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class FrameCadastroCarro extends javax.swing.JFrame {
    private FrameMenuPrincipal frameMenu;
    private FramePrincipal framePrincipal;
    
    private DefaultTableModel modelo = new DefaultTableModel();
    private int linhaSelecionada = -1;
    
    public FrameCadastroCarro(FrameMenuPrincipal frameMenu, FramePrincipal framePrincipal) {
        initComponents();     
        setLocationRelativeTo(null);
        this.frameMenu = frameMenu;
        this.framePrincipal = framePrincipal;
    }
    
        public void carregaTabela(){
        modelo.addColumn("Modelo");
         modelo.addColumn("Marca");
        modelo.addColumn("Ano");
        modelo.addColumn("Placa");
        modelo.addColumn("Problema relatados");
        tbCarro.setModel(modelo);
        tbCarro.getColumnModel().getColumn(0).setPreferredWidth(120);
        tbCarro.getColumnModel().getColumn(1).setPreferredWidth(12);
        tbCarro.getColumnModel().getColumn(2).setPreferredWidth(120);
        tbCarro.getColumnModel().getColumn(3).setPreferredWidth(13);
        tbCarro.getColumnModel().getColumn(4).setPreferredWidth(120);
    }
    public void abrirFrameMenuPrincipal() {
        frameMenu.setVisible(true);
        dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbSubTitulo = new javax.swing.JLabel();
        lbModelo = new javax.swing.JLabel();
        tfModelo = new javax.swing.JTextField();
        lbMarca = new javax.swing.JLabel();
        tfMarca = new javax.swing.JTextField();
        lbPlaca = new javax.swing.JLabel();
        tfPlaca = new javax.swing.JTextField();
        tfAno = new javax.swing.JTextField();
        lbAno = new javax.swing.JLabel();
        lbProblems = new javax.swing.JLabel();
        tfProblema = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCarro = new javax.swing.JTable();
        btEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbTitulo.setText("Cadastro Carro");

        lbSubTitulo.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        lbSubTitulo.setForeground(new java.awt.Color(102, 0, 0));
        lbSubTitulo.setText("Todos os campos são obrigatorio o preenchimento");

        lbModelo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbModelo.setText("Modelo");

        tfModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfModeloActionPerformed(evt);
            }
        });

        lbMarca.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbMarca.setText("Marca");

        tfMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMarcaActionPerformed(evt);
            }
        });

        lbPlaca.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbPlaca.setText("Placa");

        tfPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPlacaActionPerformed(evt);
            }
        });

        tfAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAnoActionPerformed(evt);
            }
        });

        lbAno.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbAno.setText("Ano");

        lbProblems.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbProblems.setText("Problema apresentado no carro : ");

        tfProblema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfProblemaActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfProblema, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btSalvar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btSair))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbModelo))
                                            .addGap(66, 66, 66))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lbAno, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tfAno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGap(31, 31, 31)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbPlaca)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfPlaca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbMarca))))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(151, 151, 151)
                            .addComponent(lbTitulo))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lbProblems))))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbSubTitulo)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSubTitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbModelo)
                    .addComponent(lbMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPlaca)
                            .addComponent(lbAno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(lbProblems)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfProblema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btSair))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        tbCarro.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tbCarro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Modelo", "Marca", "Ano", "Placa", "Problema apresentado"
            }
        ));
        jScrollPane1.setViewportView(tbCarro);

        btEditar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btEditar)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(btEditar))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfModeloActionPerformed
   
    }//GEN-LAST:event_tfModeloActionPerformed

    private void tfMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMarcaActionPerformed
     
    }//GEN-LAST:event_tfMarcaActionPerformed

    private void tfAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAnoActionPerformed
        
    }//GEN-LAST:event_tfAnoActionPerformed

    private void tfPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPlacaActionPerformed
       
    }//GEN-LAST:event_tfPlacaActionPerformed

    private void tfProblemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfProblemaActionPerformed
     
    }//GEN-LAST:event_tfProblemaActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

    String modeloCarro = tfModelo.getText();
    String marcaCarro = tfMarca.getText();
    String anoCarro = tfAno.getText();
    String placaCarro = tfPlaca.getText();
    String problemaCarro = tfProblema.getText();
  
    if (!modeloCarro.isEmpty() && !marcaCarro.isEmpty() && !anoCarro.isEmpty() && !placaCarro.isEmpty() && !problemaCarro.isEmpty()) {
    if (linhaSelecionada >= 0) {
        modelo.removeRow(linhaSelecionada);
        modelo.insertRow(linhaSelecionada, new Object[]{modeloCarro,marcaCarro,anoCarro,placaCarro,problemaCarro});
    } else {
        modelo.addRow(new Object[]{modeloCarro,marcaCarro,anoCarro,placaCarro,problemaCarro});
    }

    JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!");
    tfModelo.setText("");
    tfMarca.setText("");
    tfAno.setText("");
    tfPlaca.setText("");
    tfProblema.setText("");
    linhaSelecionada = -1;
    } else {
        JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos", "Erro de Digitação", JOptionPane.ERROR_MESSAGE);
    }
      
       
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
       abrirFrameMenuPrincipal();
    }//GEN-LAST:event_btSairActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
         linhaSelecionada = -1;
       linhaSelecionada = tbCarro.getSelectedRow();
       if(linhaSelecionada >=0){
    modelo.removeRow(linhaSelecionada);
           String modelo = (String)tbCarro.getValueAt(linhaSelecionada, 0);
           String marca = (String)tbCarro.getValueAt(linhaSelecionada, 1);
           String ano = (String)tbCarro.getValueAt(linhaSelecionada, 2);
           String placa = (String)tbCarro.getValueAt(linhaSelecionada, 3);
           String problema = (String)tbCarro.getValueAt(linhaSelecionada, 4);
          
           tfModelo.setText(modelo);
           tfMarca.setText(marca);
           tfAno.setText(ano);
           tfPlaca.setText(placa);
           tfProblema.setText(problema);
       }else{
           JOptionPane.showMessageDialog(this, "Selecione um  registro na tabela", "Erro ao selecionar", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_btEditarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAno;
    private javax.swing.JLabel lbMarca;
    private javax.swing.JLabel lbModelo;
    private javax.swing.JLabel lbPlaca;
    private javax.swing.JLabel lbProblems;
    private javax.swing.JLabel lbSubTitulo;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTable tbCarro;
    private javax.swing.JTextField tfAno;
    private javax.swing.JTextField tfMarca;
    private javax.swing.JTextField tfModelo;
    private javax.swing.JTextField tfPlaca;
    private javax.swing.JTextField tfProblema;
    // End of variables declaration//GEN-END:variables
}
