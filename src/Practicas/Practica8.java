/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Practicas;

/** @author AscCrs
 */

public class Practica8 extends javax.swing.JFrame {
    int numAnt,numAct;
    String operacion;

    public Practica8() {
        this.setTitle("Calculadora");
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlresult = new javax.swing.JLabel();
        jbclr = new javax.swing.JButton();
        jbmod = new javax.swing.JButton();
        jbdiv = new javax.swing.JButton();
        jb7 = new javax.swing.JButton();
        jb4 = new javax.swing.JButton();
        jb8 = new javax.swing.JButton();
        jb5 = new javax.swing.JButton();
        jb9 = new javax.swing.JButton();
        jb6 = new javax.swing.JButton();
        jbmult = new javax.swing.JButton();
        jbrest = new javax.swing.JButton();
        jb1 = new javax.swing.JButton();
        jb2 = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        jbsum = new javax.swing.JButton();
        jb0 = new javax.swing.JButton();
        jbdot = new javax.swing.JButton();
        jbres = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(60, 63, 65));
        jPanel1.setToolTipText("");

        jlresult.setBackground(new java.awt.Color(255, 102, 102));
        jlresult.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jlresult.setForeground(new java.awt.Color(0, 0, 0));
        jlresult.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jbclr.setBackground(new java.awt.Color(255, 153, 0));
        jbclr.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbclr.setForeground(new java.awt.Color(255, 255, 255));
        jbclr.setText("C");
        jbclr.setBorder(null);
        jbclr.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbclr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbclrActionPerformed(evt);
            }
        });

        jbmod.setBackground(new java.awt.Color(255, 153, 0));
        jbmod.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbmod.setForeground(new java.awt.Color(255, 255, 255));
        jbmod.setText("%");
        jbmod.setBorder(null);
        jbmod.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbmod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmodActionPerformed(evt);
            }
        });

        jbdiv.setBackground(new java.awt.Color(255, 153, 0));
        jbdiv.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbdiv.setForeground(new java.awt.Color(255, 255, 255));
        jbdiv.setText("÷");
        jbdiv.setBorder(null);
        jbdiv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbdiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbdivActionPerformed(evt);
            }
        });

        jb7.setBackground(new java.awt.Color(102, 102, 102));
        jb7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jb7.setForeground(new java.awt.Color(255, 255, 255));
        jb7.setText("7");
        jb7.setBorder(null);
        jb7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb7ActionPerformed(evt);
            }
        });

        jb4.setBackground(new java.awt.Color(102, 102, 102));
        jb4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jb4.setForeground(new java.awt.Color(255, 255, 255));
        jb4.setText("4");
        jb4.setBorder(null);
        jb4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb4ActionPerformed(evt);
            }
        });

        jb8.setBackground(new java.awt.Color(102, 102, 102));
        jb8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jb8.setForeground(new java.awt.Color(255, 255, 255));
        jb8.setText("8");
        jb8.setBorder(null);
        jb8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb8ActionPerformed(evt);
            }
        });

        jb5.setBackground(new java.awt.Color(102, 102, 102));
        jb5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jb5.setForeground(new java.awt.Color(255, 255, 255));
        jb5.setText("5");
        jb5.setBorder(null);
        jb5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb5ActionPerformed(evt);
            }
        });

        jb9.setBackground(new java.awt.Color(102, 102, 102));
        jb9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jb9.setForeground(new java.awt.Color(255, 255, 255));
        jb9.setText("9");
        jb9.setBorder(null);
        jb9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb9ActionPerformed(evt);
            }
        });

        jb6.setBackground(new java.awt.Color(102, 102, 102));
        jb6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jb6.setForeground(new java.awt.Color(255, 255, 255));
        jb6.setText("6");
        jb6.setBorder(null);
        jb6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb6ActionPerformed(evt);
            }
        });

        jbmult.setBackground(new java.awt.Color(255, 153, 0));
        jbmult.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbmult.setForeground(new java.awt.Color(255, 255, 255));
        jbmult.setText("×");
        jbmult.setBorder(null);
        jbmult.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbmult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmultActionPerformed(evt);
            }
        });

        jbrest.setBackground(new java.awt.Color(255, 153, 0));
        jbrest.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbrest.setForeground(new java.awt.Color(255, 255, 255));
        jbrest.setText("-");
        jbrest.setBorder(null);
        jbrest.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbrest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbrestActionPerformed(evt);
            }
        });

        jb1.setBackground(new java.awt.Color(102, 102, 102));
        jb1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jb1.setForeground(new java.awt.Color(255, 255, 255));
        jb1.setText("1");
        jb1.setBorder(null);
        jb1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });

        jb2.setBackground(new java.awt.Color(102, 102, 102));
        jb2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jb2.setForeground(new java.awt.Color(255, 255, 255));
        jb2.setText("2");
        jb2.setBorder(null);
        jb2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });

        jb3.setBackground(new java.awt.Color(102, 102, 102));
        jb3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jb3.setForeground(new java.awt.Color(255, 255, 255));
        jb3.setText("3");
        jb3.setBorder(null);
        jb3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb3ActionPerformed(evt);
            }
        });

        jbsum.setBackground(new java.awt.Color(255, 153, 0));
        jbsum.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbsum.setForeground(new java.awt.Color(255, 255, 255));
        jbsum.setText("+");
        jbsum.setBorder(null);
        jbsum.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbsum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsumActionPerformed(evt);
            }
        });

        jb0.setBackground(new java.awt.Color(102, 102, 102));
        jb0.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jb0.setForeground(new java.awt.Color(255, 255, 255));
        jb0.setText("0");
        jb0.setBorder(null);
        jb0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb0ActionPerformed(evt);
            }
        });

        jbdot.setBackground(new java.awt.Color(102, 102, 102));
        jbdot.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbdot.setForeground(new java.awt.Color(255, 255, 255));
        jbdot.setText(".");
        jbdot.setBorder(null);
        jbdot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jbres.setBackground(new java.awt.Color(255, 153, 0));
        jbres.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbres.setForeground(new java.awt.Color(255, 255, 255));
        jbres.setText("=");
        jbres.setBorder(null);
        jbres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlresult, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbclr, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbmod, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbdiv, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbmult, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jb4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbsum, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jb7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbrest, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jb0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbdot, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbres, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlresult, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbclr, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbmod, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbdiv, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbmult, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbrest, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbsum, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbdot, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jbres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb0ActionPerformed
        jlresult.setText(jlresult.getText()+"0");
    }//GEN-LAST:event_jb0ActionPerformed

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
        jlresult.setText(jlresult.getText()+"1");
    }//GEN-LAST:event_jb1ActionPerformed

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed
        jlresult.setText(jlresult.getText()+"2");
    }//GEN-LAST:event_jb2ActionPerformed

    private void jb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb3ActionPerformed
        jlresult.setText(jlresult.getText()+"3");
    }//GEN-LAST:event_jb3ActionPerformed

    private void jb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb4ActionPerformed
        jlresult.setText(jlresult.getText()+"4");
    }//GEN-LAST:event_jb4ActionPerformed

    private void jb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb5ActionPerformed
        jlresult.setText(jlresult.getText()+"5");
    }//GEN-LAST:event_jb5ActionPerformed

    private void jb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb6ActionPerformed
        jlresult.setText(jlresult.getText()+"6");
    }//GEN-LAST:event_jb6ActionPerformed

    private void jb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb7ActionPerformed
        jlresult.setText(jlresult.getText()+"7");
    }//GEN-LAST:event_jb7ActionPerformed

    private void jb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb8ActionPerformed
        jlresult.setText(jlresult.getText()+"8");
    }//GEN-LAST:event_jb8ActionPerformed

    private void jb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb9ActionPerformed
        jlresult.setText(jlresult.getText()+"9");
    }//GEN-LAST:event_jb9ActionPerformed

    private void jbclrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbclrActionPerformed
        jlresult.setText("");
    }//GEN-LAST:event_jbclrActionPerformed

    private void jbdivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbdivActionPerformed
        numAnt = Integer.parseInt(jlresult.getText());
        operacion = "/";
        jlresult.setText("");
    }//GEN-LAST:event_jbdivActionPerformed

    private void jbmultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbmultActionPerformed
        numAnt = Integer.parseInt(jlresult.getText());
        operacion = "*";
        jlresult.setText("");
    }//GEN-LAST:event_jbmultActionPerformed

    private void jbrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbrestActionPerformed
        numAnt = Integer.parseInt(jlresult.getText());
        operacion = "-";
        jlresult.setText("");
    }//GEN-LAST:event_jbrestActionPerformed

    private void jbsumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsumActionPerformed
        numAnt = Integer.parseInt(jlresult.getText());
        operacion = "+";
        jlresult.setText("");
    }//GEN-LAST:event_jbsumActionPerformed

    private void jbresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbresActionPerformed
        numAct=Integer.parseInt(jlresult.getText());
        switch(operacion){
            case "+" -> jlresult.setText(Integer.toString(numAnt+numAct));
            case "-" -> jlresult.setText(Integer.toString(numAnt-numAct));
            case "*" -> jlresult.setText(Integer.toString(numAnt*numAct));
            case "/" -> jlresult.setText(Integer.toString(numAnt/numAct));
            case "%" -> jlresult.setText(Integer.toString(numAnt%numAct));
        }
    }//GEN-LAST:event_jbresActionPerformed

    private void jbmodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbmodActionPerformed
        // TODO add your handling code here:
        numAnt = Integer.parseInt(jlresult.getText());
        operacion = "%";
        jlresult.setText("");
    }//GEN-LAST:event_jbmodActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Practica8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practica8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practica8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practica8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practica8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jb0;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb2;
    private javax.swing.JButton jb3;
    private javax.swing.JButton jb4;
    private javax.swing.JButton jb5;
    private javax.swing.JButton jb6;
    private javax.swing.JButton jb7;
    private javax.swing.JButton jb8;
    private javax.swing.JButton jb9;
    private javax.swing.JButton jbclr;
    private javax.swing.JButton jbdiv;
    private javax.swing.JButton jbdot;
    private javax.swing.JButton jbmod;
    private javax.swing.JButton jbmult;
    private javax.swing.JButton jbres;
    private javax.swing.JButton jbrest;
    private javax.swing.JButton jbsum;
    private javax.swing.JLabel jlresult;
    // End of variables declaration//GEN-END:variables
}
