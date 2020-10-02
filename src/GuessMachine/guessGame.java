package GuessMachine;


public class guessGame extends javax.swing.JFrame {

   Guesser g;
    public guessGame() {
        initComponents();
        g = new Guesser();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        guessTxt = new javax.swing.JTextField();
        guessBtn = new javax.swing.JButton();
        hintLbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        guessesLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter A NumberFrom 1 To 100:");

        guessTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessTxtActionPerformed(evt);
            }
        });

        guessBtn.setText("Submit Guess");
        guessBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessBtnActionPerformed(evt);
            }
        });

        hintLbl.setBackground(new java.awt.Color(255, 255, 255));
        hintLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hintLbl.setForeground(new java.awt.Color(255, 0, 0));
        hintLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hintLbl.setText("Enter A Number And Press The Button");
        hintLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        hintLbl.setOpaque(true);

        jLabel3.setText("Guesses So Far: ");

        guessesLbl.setBackground(new java.awt.Color(0, 0, 0));
        guessesLbl.setForeground(new java.awt.Color(255, 255, 255));
        guessesLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guessesLbl.setText("0");
        guessesLbl.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(guessTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(105, 105, 105)
                            .addComponent(guessBtn))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(hintLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(guessesLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(guessTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(guessBtn)
                .addGap(44, 44, 44)
                .addComponent(hintLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(guessesLbl))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guessTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guessTxtActionPerformed

    private void guessBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessBtnActionPerformed
        int guess = Integer.parseInt(guessTxt.getText());
        g.setGuess(guess);
        hintLbl.setText(g.giveHint());
        guessesLbl.setText(g.getGuesses()+"");
        if (g.won()) {
            guessBtn.setEnabled(false);
        }
    }//GEN-LAST:event_guessBtnActionPerformed

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
            java.util.logging.Logger.getLogger(guessGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guessGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guessGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guessGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guessGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton guessBtn;
    private javax.swing.JTextField guessTxt;
    private javax.swing.JLabel guessesLbl;
    private javax.swing.JLabel hintLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
