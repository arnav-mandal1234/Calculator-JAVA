
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arnav Kumar Mandal
 */
public class calculator extends javax.swing.JFrame {
 
   double NUM1;
   double NUM2;
   double RESULT;
   String SIGN;
   
    /**
     * Creates new form calculator
     */
    public calculator() {
        initComponents();
    
    setExtendedState(JFrame.MAXIMIZED_HORIZ);
    setVisible(true);
    setResizable(false);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        DISPLAY = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        SEVEN = new javax.swing.JButton();
        EIGHT = new javax.swing.JButton();
        ONE = new javax.swing.JButton();
        SIX = new javax.swing.JButton();
        TWO = new javax.swing.JButton();
        FOUR = new javax.swing.JButton();
        FIVE = new javax.swing.JButton();
        NINE = new javax.swing.JButton();
        THREE = new javax.swing.JButton();
        ZERO = new javax.swing.JButton();
        PLUSMINUS = new javax.swing.JButton();
        DOT = new javax.swing.JButton();
        DEL = new javax.swing.JButton();
        BY = new javax.swing.JButton();
        OO = new javax.swing.JButton();
        INTO = new javax.swing.JButton();
        MINUS = new javax.swing.JButton();
        PLUS = new javax.swing.JButton();
        EQUALS = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        DISPLAY.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        DISPLAY.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        DISPLAY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DISPLAYActionPerformed(evt);
            }
        });

        SEVEN.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        SEVEN.setText("7");
        SEVEN.setToolTipText("");
        SEVEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEVENActionPerformed(evt);
            }
        });

        EIGHT.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        EIGHT.setText("8");
        EIGHT.setToolTipText("");
        EIGHT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EIGHTActionPerformed(evt);
            }
        });

        ONE.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        ONE.setText("1");
        ONE.setToolTipText("");
        ONE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ONEActionPerformed(evt);
            }
        });

        SIX.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        SIX.setText("6");
        SIX.setToolTipText("");
        SIX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIXActionPerformed(evt);
            }
        });

        TWO.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        TWO.setText("2");
        TWO.setToolTipText("");
        TWO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TWOActionPerformed(evt);
            }
        });

        FOUR.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        FOUR.setText("4");
        FOUR.setToolTipText("");
        FOUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FOURActionPerformed(evt);
            }
        });

        FIVE.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        FIVE.setText("5");
        FIVE.setToolTipText("");
        FIVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FIVEActionPerformed(evt);
            }
        });

        NINE.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        NINE.setText("9");
        NINE.setToolTipText("");
        NINE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NINEActionPerformed(evt);
            }
        });

        THREE.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        THREE.setText("3");
        THREE.setToolTipText("");
        THREE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                THREEActionPerformed(evt);
            }
        });

        ZERO.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        ZERO.setText("0");
        ZERO.setToolTipText("");
        ZERO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZEROActionPerformed(evt);
            }
        });

        PLUSMINUS.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        PLUSMINUS.setText("+/-");
        PLUSMINUS.setToolTipText("");
        PLUSMINUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLUSMINUSActionPerformed(evt);
            }
        });

        DOT.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        DOT.setText(".");
        DOT.setToolTipText("");
        DOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(SEVEN, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8)
                            .addComponent(EIGHT, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8)
                            .addComponent(NINE, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(FOUR, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8)
                            .addComponent(FIVE, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8)
                            .addComponent(SIX, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(DOT, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(ZERO, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ONE, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TWO, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(THREE, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PLUSMINUS, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(4, 4, 4))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SEVEN, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EIGHT, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NINE, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FOUR, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FIVE, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SIX, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(THREE, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TWO, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ONE, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ZERO, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PLUSMINUS, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DOT, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );

        DEL.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        DEL.setText("<-");
        DEL.setToolTipText("");
        DEL.setMaximumSize(new java.awt.Dimension(69, 39));
        DEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELActionPerformed(evt);
            }
        });

        BY.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        BY.setText("/");
        BY.setToolTipText("");
        BY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BYActionPerformed(evt);
            }
        });

        OO.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        OO.setText("AC");
        OO.setToolTipText("");
        OO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OOActionPerformed(evt);
            }
        });

        INTO.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        INTO.setText("x");
        INTO.setToolTipText("");
        INTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INTOActionPerformed(evt);
            }
        });

        MINUS.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        MINUS.setText("-");
        MINUS.setToolTipText("");
        MINUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MINUSActionPerformed(evt);
            }
        });

        PLUS.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        PLUS.setText("+");
        PLUS.setToolTipText("");
        PLUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLUSActionPerformed(evt);
            }
        });

        EQUALS.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        EQUALS.setText("=");
        EQUALS.setToolTipText("");
        EQUALS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EQUALSActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ARNAV'S CALCULATOR");
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(EQUALS, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PLUS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MINUS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DISPLAY)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(OO, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(DEL, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(BY, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(INTO, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DISPLAY, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OO, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DEL, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BY, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(INTO, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(MINUS, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(PLUS, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(EQUALS, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DISPLAYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DISPLAYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DISPLAYActionPerformed

    private void DELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELActionPerformed
  String NUM=DISPLAY.getText();
       DISPLAY.setText(NUM.substring(0,NUM.length()-1));        // TODO add your handling code here:
    }//GEN-LAST:event_DELActionPerformed

    private void MINUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MINUSActionPerformed
NUM1=Double.parseDouble(DISPLAY.getText());
       DISPLAY.setText("");
       SIGN="-";        // TODO add your handling code here:
    }//GEN-LAST:event_MINUSActionPerformed

    private void ONEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ONEActionPerformed
       String NUM=DISPLAY.getText()+ONE.getText();
       DISPLAY.setText(NUM);
    }//GEN-LAST:event_ONEActionPerformed

    private void TWOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TWOActionPerformed
  String NUM=DISPLAY.getText()+TWO.getText();
       DISPLAY.setText(NUM);        // TODO add your handling code here:
    }//GEN-LAST:event_TWOActionPerformed

    private void THREEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_THREEActionPerformed
  String NUM=DISPLAY.getText()+THREE.getText();
       DISPLAY.setText(NUM);        // TODO add your handling code here:
    }//GEN-LAST:event_THREEActionPerformed

    private void FOURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FOURActionPerformed
  String NUM=DISPLAY.getText()+ FOUR.getText();
       DISPLAY.setText(NUM);        // TODO add your handling code here:
    }//GEN-LAST:event_FOURActionPerformed

    private void FIVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FIVEActionPerformed
  String NUM=DISPLAY.getText()+FIVE.getText();
       DISPLAY.setText(NUM);        // TODO add your handling code here:
    }//GEN-LAST:event_FIVEActionPerformed

    private void SIXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIXActionPerformed
  String NUM=DISPLAY.getText()+SIX.getText();
       DISPLAY.setText(NUM);        // TODO add your handling code here:
    }//GEN-LAST:event_SIXActionPerformed

    private void SEVENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEVENActionPerformed
  String NUM=DISPLAY.getText()+SEVEN.getText();
       DISPLAY.setText(NUM);        // TODO add your handling code here:
    }//GEN-LAST:event_SEVENActionPerformed

    private void EIGHTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EIGHTActionPerformed
  String NUM=DISPLAY.getText()+EIGHT.getText();
       DISPLAY.setText(NUM);        // TODO add your handling code here:
    }//GEN-LAST:event_EIGHTActionPerformed

    private void NINEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NINEActionPerformed
  String NUM=DISPLAY.getText()+NINE.getText();
       DISPLAY.setText(NUM);        // TODO add your handling code here:
    }//GEN-LAST:event_NINEActionPerformed

    private void ZEROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZEROActionPerformed
  String NUM=DISPLAY.getText()+ZERO.getText();
       DISPLAY.setText(NUM);        // TODO add your handling code here:
    }//GEN-LAST:event_ZEROActionPerformed

    private void DOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOTActionPerformed
  String NUM=DISPLAY.getText()+DOT.getText();
       DISPLAY.setText(NUM);        // TODO add your handling code here:
    }//GEN-LAST:event_DOTActionPerformed

    private void PLUSMINUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLUSMINUSActionPerformed
    double x=Double.parseDouble(DISPLAY.getText());
    x=x*(-1);
    DISPLAY.setText(String.valueOf(x));
    // TODO add your handling code here:
    }//GEN-LAST:event_PLUSMINUSActionPerformed

    private void OOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OOActionPerformed
  
       DISPLAY.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_OOActionPerformed

    private void PLUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLUSActionPerformed
       NUM1=Double.parseDouble(DISPLAY.getText());
       DISPLAY.setText("");
       SIGN="+";
       
        // TODO add your handling code here:
    }//GEN-LAST:event_PLUSActionPerformed

    private void INTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INTOActionPerformed
NUM1=Double.parseDouble(DISPLAY.getText());
       DISPLAY.setText("");
       SIGN="*";        // TODO add your handling code here:
    }//GEN-LAST:event_INTOActionPerformed

    private void BYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BYActionPerformed
NUM1=Double.parseDouble(DISPLAY.getText());
       DISPLAY.setText("");
       SIGN="/";        // TODO add your handling code here:
    }//GEN-LAST:event_BYActionPerformed

    private void EQUALSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EQUALSActionPerformed
       NUM2=Double.parseDouble(DISPLAY.getText());
       
       if(SIGN.equalsIgnoreCase("+"))
           RESULT=NUM1+NUM2;
       else if(SIGN.equalsIgnoreCase("-"))
           RESULT=NUM1-NUM2;
       else if(SIGN.equalsIgnoreCase("/"))
           RESULT=NUM1/NUM2;
       else if(SIGN.equalsIgnoreCase("*"))
           RESULT=NUM1*NUM2;
       DISPLAY.setText(String.valueOf(RESULT));
       


// TODO add your handling code here:
    }//GEN-LAST:event_EQUALSActionPerformed

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
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BY;
    private javax.swing.JButton DEL;
    private javax.swing.JTextField DISPLAY;
    private javax.swing.JButton DOT;
    private javax.swing.JButton EIGHT;
    private javax.swing.JButton EQUALS;
    private javax.swing.JButton FIVE;
    private javax.swing.JButton FOUR;
    private javax.swing.JButton INTO;
    private javax.swing.JButton MINUS;
    private javax.swing.JButton NINE;
    private javax.swing.JButton ONE;
    private javax.swing.JButton OO;
    private javax.swing.JButton PLUS;
    private javax.swing.JButton PLUSMINUS;
    private javax.swing.JButton SEVEN;
    private javax.swing.JButton SIX;
    private javax.swing.JButton THREE;
    private javax.swing.JButton TWO;
    private javax.swing.JButton ZERO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
