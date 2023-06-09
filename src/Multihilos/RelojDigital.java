/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Multihilos;

import java.util.Calendar;

/**
 *
 * @author AscCrs
 */

public class RelojDigital extends javax.swing.JFrame {
    
    private Thread clockThread;
  
    public RelojDigital() {
        initComponents();
       
        btnPause.addActionListener((java.awt.event.ActionEvent evt) -> {
            btnPauseActionPerformed(evt);
        });
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelClock = new javax.swing.JPanel();
        btnStart = new javax.swing.JButton();
        btnPause = new javax.swing.JButton();
        lblClock = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelClock.setForeground(new java.awt.Color(60, 63, 65));

        btnStart.setBackground(new java.awt.Color(204, 204, 204));
        btnStart.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnStart.setForeground(new java.awt.Color(0, 0, 0));
        btnStart.setText("Iniciar");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnPause.setBackground(new java.awt.Color(204, 204, 204));
        btnPause.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnPause.setForeground(new java.awt.Color(0, 0, 0));
        btnPause.setText("Detener");
        btnPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPauseActionPerformed(evt);
            }
        });

        lblClock.setBackground(new java.awt.Color(255, 255, 255));
        lblClock.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblClock.setForeground(new java.awt.Color(255, 255, 255));
        lblClock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClock.setText("00:00:00");

        javax.swing.GroupLayout panelClockLayout = new javax.swing.GroupLayout(panelClock);
        panelClock.setLayout(panelClockLayout);
        panelClockLayout.setHorizontalGroup(
            panelClockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClockLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(panelClockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblClock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelClockLayout.createSequentialGroup()
                        .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPause, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panelClockLayout.setVerticalGroup(
            panelClockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClockLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblClock, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(panelClockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPause, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelClock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelClock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        clockThread = new Thread(() -> {
            try {
                while (true) {
                    Calendar calendar = Calendar.getInstance();
                    int hr = calendar.get(Calendar.HOUR_OF_DAY)-1;
                    int min = calendar.get(Calendar.MINUTE);
                    int sec = calendar.get(Calendar.SECOND);
                    
                    String time = String.format("%02d:%02d:%02d", hr, min, sec);
                    lblClock.setText(time);
                    
                    Thread.sleep(1000);
                }
            } catch (InterruptedException ex) {
                System.out.print(ex);
            }
        });
        clockThread.start();
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseActionPerformed
        // TODO add your handling code here:
        clockThread.interrupt();
    }//GEN-LAST:event_btnPauseActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(RelojDigital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(RelojDigital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(RelojDigital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(RelojDigital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RelojDigital().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPause;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel lblClock;
    private javax.swing.JPanel panelClock;
    // End of variables declaration//GEN-END:variables
}
