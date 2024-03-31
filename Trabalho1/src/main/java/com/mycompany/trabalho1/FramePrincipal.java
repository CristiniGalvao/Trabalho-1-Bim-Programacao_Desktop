/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.trabalho1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriella 
 */
public class FramePrincipal extends javax.swing.JFrame {
 private FrameMenuPrincipal frameMenu;
    /**
     * Creates new form FramePrincipal
     */
    public FramePrincipal() {
        initComponents();
        setLocationRelativeTo(null);
      frameMenu = new FrameMenuPrincipal(this);  
    }

    public void abrirFrameMenuPrincipal() {
        frameMenu.setVisible(true);
        dispose();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        lbSenha = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        pfSnha = new javax.swing.JPasswordField();
        btVerificar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbTitulo.setText("Login");

        lbUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbUsuario.setText("Usuario");

        lbSenha.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbSenha.setText("Senha");

        tfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsuarioActionPerformed(evt);
            }
        });

        pfSnha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfSnhaActionPerformed(evt);
            }
        });

        btVerificar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btVerificar.setText("Verificar");
        btVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerificarActionPerformed(evt);
            }
        });

        btSair.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbUsuario)
                            .addComponent(lbSenha)
                            .addComponent(tfUsuario)
                            .addComponent(pfSnha, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(btVerificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbTitulo)
                .addGap(185, 185, 185))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lbTitulo)
                .addGap(45, 45, 45)
                .addComponent(lbUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pfSnha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVerificar)
                    .addComponent(btSair))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pfSnhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfSnhaActionPerformed
        
    }//GEN-LAST:event_pfSnhaActionPerformed

    private void btVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerificarActionPerformed
         String usuario = tfUsuario.getText();
         String senha = new String(pfSnha.getPassword()); 

                if (usuario.equalsIgnoreCase("Gabriella") && senha.equals("240549")) {
                    abrirFrameMenuPrincipal();
                }else if (usuario.equalsIgnoreCase("Gabriella")) {
                    JOptionPane.showMessageDialog(this, "Senha incorreta", "Erro de Login", JOptionPane.ERROR_MESSAGE);
                } else if (senha.equals("240549")){
                    JOptionPane.showMessageDialog(this, "Usuário inválido", "Erro de Login", JOptionPane.ERROR_MESSAGE);
                }else{
                   JOptionPane.showMessageDialog(this, "Login inválido", "Erro de Login", JOptionPane.ERROR_MESSAGE);  
                }
            
    }//GEN-LAST:event_btVerificarActionPerformed

    private void tfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsuarioActionPerformed
       
    }//GEN-LAST:event_tfUsuarioActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
         dispose(); 
    }//GEN-LAST:event_btSairActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSair;
    private javax.swing.JButton btVerificar;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPasswordField pfSnha;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
