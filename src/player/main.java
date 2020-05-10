/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;

/**
 *
 * @author Javier
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    BasicPlayer option = new BasicPlayer();
    JFileChooser fileChooser = new JFileChooser();
    Lista lista = new Lista();
    int cont=0;
    
    public main() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnplay = new javax.swing.JButton();
        btnstop = new javax.swing.JButton();
        btnbefore = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnpause = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/jugar (2).png"))); // NOI18N
        btnplay.setToolTipText("");
        btnplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplayActionPerformed(evt);
            }
        });

        btnstop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/multimedia (2).png"))); // NOI18N
        btnstop.setName(""); // NOI18N
        btnstop.setPreferredSize(new java.awt.Dimension(124, 100));
        btnstop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstopActionPerformed(evt);
            }
        });

        btnbefore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rebobinar.png"))); // NOI18N
        btnbefore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbeforeActionPerformed(evt);
            }
        });

        btnnext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/jugar (1).png"))); // NOI18N
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnpause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pausa.png"))); // NOI18N
        btnpause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpauseActionPerformed(evt);
            }
        });

        jButton1.setText("..");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Resumir ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(btnplay, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnbefore, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnpause)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnnext, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(btnstop, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jButton2)))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(195, 195, 195))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnplay, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnpause, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnbefore, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnnext, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnstop, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(32, 32, 32)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivo mp3","mp3","mp3"));
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setMultiSelectionEnabled(true);
        int selection = fileChooser.showOpenDialog(this);
        
        if(selection == JFileChooser.APPROVE_OPTION){
          
       File files[] = fileChooser.getSelectedFiles();
           boolean noMp3 = false;
           
                   for(File file : files){
              lista.insertMusic(file.getName(), file.getPath());
//              list_modelo.addElement(File.getName());
//                lista_can.setModel(list_modelo);
        }
            }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplayActionPerformed
        // TODO add your handling code here:
        
       
        
    }//GEN-LAST:event_btnplayActionPerformed
    
    public void reproducircancion(String song){
      try {
            option.open(new File(song));
            option.play();
        } catch (Exception e) {
    
    }
    }
    
    
    
    private void btnpauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpauseActionPerformed
        // TODO add your handling code here:
        
        reproducircancion(lista.direccion_song(cont));
        cont++;
    }//GEN-LAST:event_btnpauseActionPerformed

    private void btnstopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstopActionPerformed
        try {
            // TODO add your handling code here:
            option.stop();
        } catch (BasicPlayerException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnstopActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnbeforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbeforeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbeforeActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbefore;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnpause;
    private javax.swing.JButton btnplay;
    private javax.swing.JButton btnstop;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
