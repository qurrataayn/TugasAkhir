package kalkulator.gizi;
import javax.swing.JOptionPane;
public class FormUtama extends javax.swing.JDialog{

    public FormUtama() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jKalkulator1 = new javax.swing.JRadioButton();
        jKalkulator2 = new javax.swing.JRadioButton();
        SelectButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PILIH KALKULATOR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 442, 112));

        buttonGroup1.add(jKalkulator1);
        jKalkulator1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jKalkulator1.setText("Kalkulator IMT dan TEE");
        getContentPane().add(jKalkulator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 293, -1));

        buttonGroup1.add(jKalkulator2);
        jKalkulator2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jKalkulator2.setText("Nilai Gizi");
        getContentPane().add(jKalkulator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 293, 41));

        SelectButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SelectButton.setText("Select");
        SelectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SelectButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\windows\\Pictures\\Saved Pictures\\Download premium vector of Blank collage photo frame template vector.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SelectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectButtonActionPerformed
        if(jKalkulator1.isSelected()){
        new kalkulator_gizi().setVisible(true);
        } else if(jKalkulator2.isSelected()){
        new kalkulator2().setVisible(true);}
    }//GEN-LAST:event_SelectButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int jawab = JOptionPane.showOptionDialog(this, 
                    "Ingin Keluar?", 
                    "Close", 
                    JOptionPane.YES_NO_OPTION, 
                    JOptionPane.QUESTION_MESSAGE, null, null, null);
    if(jawab == JOptionPane.YES_OPTION){
        JOptionPane.showMessageDialog(this, "Program Akan Keluar");
        System.exit(0);}
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new FormUtama().setVisible(true);
        });}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SelectButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JRadioButton jKalkulator1;
    private javax.swing.JRadioButton jKalkulator2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}