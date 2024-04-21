/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.trabalho1;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriella
 */
public class FrameServicosRealizados extends javax.swing.JFrame {
    private FrameMenuPrincipal frameMenu;
    private FramePrincipal framePrincipal;
    private FramePecas framePecas;
    
    public FrameServicosRealizados() {
        initComponents();
        setLocationRelativeTo(null);
        this.frameMenu = frameMenu;
        this.framePrincipal = framePrincipal;
        this.framePecas = framePecas;
    }
    
        public void abrirFrameMenuPrincipal() {
        frameMenu.setVisible(true);
        dispose();
    }
        public void abrirFramePecas() {
        framePecas.setVisible(true);
        dispose();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        tfDescricao = new javax.swing.JTextField();
        lbDesc = new javax.swing.JLabel();
        lbQuantoTempo = new javax.swing.JLabel();
        tfTempo = new javax.swing.JTextField();
        btPecas = new javax.swing.JButton();
        lbPecas = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbTitulo.setText("Serviços Realizados");

        tfDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDescricaoActionPerformed(evt);
            }
        });

        lbDesc.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbDesc.setText("Descrição dos serviços realizados");

        lbQuantoTempo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbQuantoTempo.setText("Quanto tempo demorou o serviço");

        tfTempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTempoActionPerformed(evt);
            }
        });

        btPecas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btPecas.setText("Peças utilizadas");
        btPecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPecasActionPerformed(evt);
            }
        });

        lbPecas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbPecas.setText("Peças utilizadas no serviço");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSair)
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTempo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfDescricao, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbDesc))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbQuantoTempo))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbPecas)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btPecas)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(lbTitulo)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addGap(24, 24, 24)
                .addComponent(lbDesc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbQuantoTempo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbPecas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPecas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btSair))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDescricaoActionPerformed

    private void tfTempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTempoActionPerformed

    private void btPecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPecasActionPerformed
        abrirFramePecas();
    }//GEN-LAST:event_btPecasActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        String descricao = tfDescricao.getText();
        String tempo = tfTempo.getText();
                if (!descricao.isEmpty() && !tempo.isEmpty() ) {
                    abrirFrameMenuPrincipal();
                }else{
                   JOptionPane.showMessageDialog(this, "Texto inválido, não deixe nenhum campo de texto vazio", "Erro de Digitação", JOptionPane.ERROR_MESSAGE);  
                }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
         abrirFrameMenuPrincipal();
    }//GEN-LAST:event_btSairActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPecas;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel lbDesc;
    private javax.swing.JLabel lbPecas;
    private javax.swing.JLabel lbQuantoTempo;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JTextField tfTempo;
    // End of variables declaration//GEN-END:variables
}
