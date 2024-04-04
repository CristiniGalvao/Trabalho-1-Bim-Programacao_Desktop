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
public class FrameMenuPrincipal extends javax.swing.JFrame {
private FramePrincipal framePrincipal;
private FrameCadastroCliente frameCliente;
private FrameCadastroCarro frameCarro;
    /**
     * Creates new form MenuPrincipal
     */
    public FrameMenuPrincipal(FramePrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
        initComponents();
        setLocationRelativeTo(null);
        frameCliente = new FrameCadastroCliente();
        frameCarro = new FrameCadastroCarro();
    }
    
        public void abrirFrameCadastroCliente() {
        frameCliente.setVisible(true);
        dispose();
    }
        public void abrirFrameCadastroCarro() {
        frameCarro.setVisible(true);
        dispose();
    }
        public void encerrarTudo(){
        framePrincipal.dispose(); 
        frameCliente.dispose(); 
        dispose(); 
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        btCadastroCliente = new javax.swing.JButton();
        btCadastroCarro = new javax.swing.JButton();
        lbSubTitulo = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbTitulo.setText("Bem Vindo a Oficina Frank Castle");

        btCadastroCliente.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btCadastroCliente.setText("Cadastro Cliente");
        btCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroClienteActionPerformed(evt);
            }
        });

        btCadastroCarro.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btCadastroCarro.setText("Cadastro Carro");
        btCadastroCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroCarroActionPerformed(evt);
            }
        });

        lbSubTitulo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbSubTitulo.setText("Selecione uma das opcões abaixo para continuar");

        btSair.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btSair.setText("Encerrar");
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
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(lbTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lbSubTitulo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(btCadastroCarro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbSubTitulo)
                .addGap(49, 49, 49)
                .addComponent(btCadastroCliente)
                .addGap(18, 18, 18)
                .addComponent(btCadastroCarro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSair)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroClienteActionPerformed
            abrirFrameCadastroCliente();
            
    }//GEN-LAST:event_btCadastroClienteActionPerformed

    private void btCadastroCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroCarroActionPerformed
            abrirFrameCadastroCarro(); 
    }//GEN-LAST:event_btCadastroCarroActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        encerrarTudo();
    }//GEN-LAST:event_btSairActionPerformed

   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastroCarro;
    private javax.swing.JButton btCadastroCliente;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel lbSubTitulo;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}
