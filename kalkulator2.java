/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator.gizi;

import javax.swing.JOptionPane;

/**
 *
 * @author windows
 */
public class kalkulator2 extends javax.swing.JFrame {

    /**
     * Creates new form kalkulator2
     */
    public kalkulator2() {
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

        judul = new javax.swing.JLabel();
        nasi = new javax.swing.JButton();
        telur = new javax.swing.JButton();
        ayam = new javax.swing.JButton();
        mikering = new javax.swing.JButton();
        mibasah = new javax.swing.JButton();
        susu = new javax.swing.JButton();
        coklat = new javax.swing.JButton();
        kopi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        back = new javax.swing.JButton();
        mineral = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        judul.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        judul.setText("NILAI GIZI");
        getContentPane().add(judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        nasi.setBackground(new java.awt.Color(204, 255, 204));
        nasi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nasi.setText("Nasi");
        nasi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        nasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nasiActionPerformed(evt);
            }
        });
        getContentPane().add(nasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 70, 30));

        telur.setBackground(new java.awt.Color(204, 255, 204));
        telur.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        telur.setText("Telur Ayam");
        telur.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        telur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telurActionPerformed(evt);
            }
        });
        getContentPane().add(telur, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 120, -1));

        ayam.setBackground(new java.awt.Color(204, 255, 204));
        ayam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ayam.setText("Daging Ayam");
        ayam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        ayam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayamActionPerformed(evt);
            }
        });
        getContentPane().add(ayam, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 163, -1));

        mikering.setBackground(new java.awt.Color(204, 255, 204));
        mikering.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mikering.setText("Mie Kering");
        mikering.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        mikering.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mikeringActionPerformed(evt);
            }
        });
        getContentPane().add(mikering, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, -1, -1));

        mibasah.setBackground(new java.awt.Color(204, 255, 204));
        mibasah.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mibasah.setText("Mie Basah");
        mibasah.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        mibasah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mibasahActionPerformed(evt);
            }
        });
        getContentPane().add(mibasah, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, -1, -1));

        susu.setBackground(new java.awt.Color(204, 255, 204));
        susu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        susu.setText("Susu Kedelai");
        susu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        susu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                susuActionPerformed(evt);
            }
        });
        getContentPane().add(susu, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        coklat.setBackground(new java.awt.Color(204, 255, 204));
        coklat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        coklat.setText("Coklat Bubuk");
        coklat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        coklat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coklatActionPerformed(evt);
            }
        });
        getContentPane().add(coklat, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 150, -1));

        kopi.setBackground(new java.awt.Color(204, 255, 204));
        kopi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kopi.setText("Kopi Bubuk Instant");
        kopi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        kopi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kopiActionPerformed(evt);
            }
        });
        getContentPane().add(kopi, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 191, -1));

        ta.setEditable(false);
        ta.setBackground(new java.awt.Color(204, 255, 204));
        ta.setColumns(20);
        ta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ta.setRows(5);
        ta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 3));
        jScrollPane1.setViewportView(ta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 652, 344));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Kandungan Nilai Gizi");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, -1));

        reset.setBackground(new java.awt.Color(204, 255, 204));
        reset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 780, -1, -1));

        exit.setBackground(new java.awt.Color(204, 255, 204));
        exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 780, -1, -1));

        back.setBackground(new java.awt.Color(204, 255, 204));
        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 780, -1, -1));

        mineral.setBackground(new java.awt.Color(204, 255, 204));
        mineral.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mineral.setText("Air Mineral");
        mineral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        mineral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mineralActionPerformed(evt);
            }
        });
        getContentPane().add(mineral, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 110, -1));

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\windows\\Pictures\\Saved Pictures\\Dispositif Avertisseur D'incendie Alarme Fleur Contexte.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 930));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nasiActionPerformed
        ta.setText(" Energi\t\t 180 kkal\t 8.37%" +
                "\n Lemak total\t\t 0.30 g\t 0.45%"+
                "\n    Vitamin A\t\t 0 mcg\t 0%"+
                "\n    Vitamin B1\t\t 0.05 mcg\t 5%"+
                "\n    Vitamin B2\t\t 0.10 mcg\t 10%"+
                "\n    Vitamin B3\t\t 2.60 mcg\t 17.33%"+
                "\n    Vitamin C\t\t 0 mcg\t 0%"+
                "\n Karbohidrat total\t 39.80 g\t 12.25%"+
                "\n Protein\t\t 3 g\t 5%"+
                "\n Natrium\t\t 1 mg\t 0.07%" + 
                "\n B-Karoten\t\t 0 mcg\t -" +
                "\n Karoten total\t\t   \t -"+
                "\n Air\t\t 56.70 g\t -"+
                "\n Abu\t\t 0.20 g\t -");
    }//GEN-LAST:event_nasiActionPerformed

    private void telurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telurActionPerformed
        ta.setText(" Energi\t\t 154 kkal\t 7.16%" +
                "\n Lemak total\t\t 10.80 g\t 16.12%"+
                "\n    Vitamin A\t\t 61 mcg\t 10.17%"+
                "\n    Vitamin B1\t\t 0.12 mcg\t 12%"+
                "\n    Vitamin B2\t\t 0.38 mcg\t 38%"+
                "\n    Vitamin B3\t\t 0.20 mcg\t 1.33%"+
                "\n    Vitamin C\t\t 0 mcg\t 0%"+
                "\n Karbohidrat total\t 0.70 g\t 0.22%"+
                "\n Protein\t\t 12.40 g\t 20.67%"+
                "\n Natrium\t\t 142 mg\t 9.47%" + 
                "\n B-Karoten\t\t 22 mcg\t -" +
                "\n Karoten total\t\t   \t -"+
                "\n Air\t\t 74.30 g\t -"+
                "\n Abu\t\t 0.80 g\t -");
    }//GEN-LAST:event_telurActionPerformed

    private void ayamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayamActionPerformed
        ta.setText(" Energi\t\t 298 kkal\t 13.86%" +
                "\n Lemak total\t\t 25 g\t 37.31%"+
                "\n    Vitamin A\t\t 245 mcg\t 40.83%"+
                "\n    Vitamin B1\t\t 0.08 mcg\t 8%"+
                "\n    Vitamin B2\t\t 0.14 mcg\t 14%"+
                "\n    Vitamin B3\t\t 10.40 mcg\t 69.33%"+
                "\n    Vitamin C\t\t 0 mcg\t 0%"+
                "\n Karbohidrat total\t 0 g\t 0%"+
                "\n Protein\t\t 18.20 g\t 30.33%"+
                "\n Natrium\t\t 109 mg\t 7.27%" + 
                "\n B-Karoten\t\t 0 mcg\t -" +
                "\n Karoten total\t\t   \t -"+
                "\n Air\t\t 55.90 g\t -"+
                "\n Abu\t\t 0.90 g\t -");
    }//GEN-LAST:event_ayamActionPerformed

    private void mikeringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mikeringActionPerformed
        ta.setText(" Energi\t\t 339 kkal\t 15.77%" +
                "\n Lemak total\t\t 1.70 g\t 2.54%"+
                "\n    Vitamin A\t\t 0 mcg\t 0%"+
                "\n    Vitamin B1\t\t 0 mcg\t 0%"+
                "\n    Vitamin B2\t\t 0.08 mcg\t 8%"+
                "\n    Vitamin B3\t\t 2.20 mcg\t 14.67%"+
                "\n    Vitamin C\t\t 0 mcg\t 0%"+
                "\n Karbohidrat total\t 6.30 g\t 1.94%"+
                "\n Protein\t\t 18.20 g\t 16.67%"+
                "\n Natrium\t\t 760 mg\t 50.67%" + 
                "\n B-Karoten\t\t 0 mcg\t -" +
                "\n Karoten total\t\t   \t -"+
                "\n Air\t\t 10.60 g\t -"+
                "\n Abu\t\t 1.40 g\t -");
    }//GEN-LAST:event_mikeringActionPerformed

    private void mibasahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mibasahActionPerformed
        ta.setText(" Energi\t\t 88 kkal\t 4.09%" +
                "\n Lemak total\t\t 3.30 g\t 4.93%"+
                "\n    Vitamin A\t\t 0 mcg\t 0%"+
                "\n    Vitamin B1\t\t 0 mcg\t 0%"+
                "\n    Vitamin B2\t\t 0 mcg\t 0%"+
                "\n    Vitamin B3\t\t 0 mcg\t 0%"+
                "\n    Vitamin C\t\t 0 mcg\t 0%"+
                "\n Karbohidrat total\t 14 g\t 4.31%"+
                "\n Protein\t\t 0.60 g\t 1%"+
                "\n Natrium\t\t 63 mg\t 4.20%" + 
                "\n B-Karoten\t\t 0 mcg\t -" +
                "\n Karoten total\t\t   \t -"+
                "\n Air\t\t 80 g\t -"+
                "\n Abu\t\t 2.10 g\t -");
    }//GEN-LAST:event_mibasahActionPerformed

    private void mineralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mineralActionPerformed
        ta.setText(" Energi\t\t 0 kkal\t 0%" +
                "\n Lemak total\t\t 0 g\t 0%"+
                "\n    Vitamin A\t\t 0 mcg\t 0%"+
                "\n    Vitamin B1\t\t 0 mcg\t 0%"+
                "\n    Vitamin B2\t\t 0 mcg\t 0%"+
                "\n    Vitamin B3\t\t 0 mcg\t 0%"+
                "\n    Vitamin C\t\t 0 mcg\t 0%"+
                "\n Karbohidrat total\t 0 g\t 0%"+
                "\n Protein\t\t 0 g\t 0%"+
                "\n Natrium\t\t 0 mg\t 0%" + 
                "\n B-Karoten\t\t 0 mcg\t -" +
                "\n Karoten total\t\t   \t -"+
                "\n Air\t\t 100 g\t -"+
                "\n Abu\t\t 0 g\t -");
    }//GEN-LAST:event_mineralActionPerformed

    private void susuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_susuActionPerformed
        ta.setText(" Energi\t\t 41 kkal\t 1.91%" +
                "\n Lemak total\t\t 2.50 g\t 3.37%"+
                "\n    Vitamin A\t\t 0 mcg\t 0%"+
                "\n    Vitamin B1\t\t 0.08 mcg\t 8%"+
                "\n    Vitamin B2\t\t 0.05 mcg\t 5%"+
                "\n    Vitamin B3\t\t 0.70 mcg\t 4.67%"+
                "\n    Vitamin C\t\t 2 mcg\t 2.22%"+
                "\n Karbohidrat total\t 5 g\t 1.54%"+
                "\n Protein\t\t 3.50 g\t 5.83%"+
                "\n Natrium\t\t 128 mg\t 8.53%" + 
                "\n B-Karoten\t\t 0 mcg\t -" +
                "\n Karoten total\t\t   \t -"+
                "\n Air\t\t 87 g\t -"+
                "\n Abu\t\t 2 g\t -");
    }//GEN-LAST:event_susuActionPerformed

    private void coklatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coklatActionPerformed
        ta.setText(" Energi\t\t 311 kkal\t 14.47%" +
                "\n Lemak total\t\t 4 g\t 5.97%"+
                "\n    Vitamin A\t\t 0 mcg\t 0%"+
                "\n    Vitamin B1\t\t 0.12 mcg\t 12%"+
                "\n    Vitamin B2\t\t 0 mcg\t 0%"+
                "\n    Vitamin B3\t\t 0.60 mcg\t 4%"+
                "\n    Vitamin C\t\t 0 mcg\t 0%"+
                "\n Karbohidrat total\t 48.90 g\t 15.05%"+
                "\n Protein\t\t 8 g\t 13.33%"+
                "\n Natrium\t\t 0 mg\t 0%" + 
                "\n B-Karoten\t\t 0 mcg\t -" +
                "\n Karoten total\t\t   \t -"+
                "\n Air\t\t 3.90 g\t -"+
                "\n Abu\t\t 15.40 g\t -");
    }//GEN-LAST:event_coklatActionPerformed

    private void kopiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kopiActionPerformed
        ta.setText(" Energi\t\t 129 kkal\t 6%" +
                "\n Lemak total\t\t 0.50 g\t 0.75%"+
                "\n    Vitamin A\t\t 0 mcg\t 0%"+
                "\n    Vitamin B1\t\t 0 mcg\t 0%"+
                "\n    Vitamin B2\t\t 0.21 mcg\t 21%"+
                "\n    Vitamin B3\t\t 30.60 mcg\t 204%"+
                "\n    Vitamin C\t\t 0 mcg\t 0%"+
                "\n Karbohidrat total\t 35 g\t 10.77%"+
                "\n Protein\t\t 12.30 g\t 20.50%"+
                "\n Natrium\t\t 72 mg\t 4.80%" + 
                "\n B-Karoten\t\t 0 mcg\t -" +
                "\n Karoten total\t\t   \t -"+
                "\n Air\t\t 2.60 g\t -"+
                "\n Abu\t\t 9.70 g\t -");
    }//GEN-LAST:event_kopiActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        ta.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        int jawab = JOptionPane.showOptionDialog(this,
            "Ingin Keluar?",
            "Close",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, null, null);
        if(jawab == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(this, "Program Akan Keluar");
            System.exit(0);}
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(kalkulator2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kalkulator2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kalkulator2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kalkulator2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kalkulator2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ayam;
    private javax.swing.JButton back;
    private javax.swing.JButton coklat;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel judul;
    private javax.swing.JButton kopi;
    private javax.swing.JButton mibasah;
    private javax.swing.JButton mikering;
    private javax.swing.JButton mineral;
    private javax.swing.JButton nasi;
    private javax.swing.JButton reset;
    private javax.swing.JButton susu;
    private javax.swing.JTextArea ta;
    private javax.swing.JButton telur;
    // End of variables declaration//GEN-END:variables
}
