package kalkulator.gizi;
import javax.swing.JOptionPane;

public class kalkulator_gizi extends javax.swing.JFrame {
public String faktor_stress;
public String faktor_aktivitas;

    public kalkulator_gizi() {
        initComponents();}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabelJenisKelamin = new javax.swing.JLabel();
        laki = new javax.swing.JRadioButton();
        prp = new javax.swing.JRadioButton();
        jLabelTB = new javax.swing.JLabel();
        tb = new javax.swing.JTextField();
        jLabelBB = new javax.swing.JLabel();
        bb = new javax.swing.JTextField();
        jLabelUmur = new javax.swing.JLabel();
        Umur = new javax.swing.JTextField();
        jPanelIMT = new javax.swing.JPanel();
        jIMTbutton = new javax.swing.JButton();
        indeksmassa = new javax.swing.JLabel();
        standarWHO = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btTEE = new javax.swing.JButton();
        lblBEE = new javax.swing.JLabel();
        lblTEE = new javax.swing.JLabel();
        cbStress = new javax.swing.JComboBox<>();
        cbAktvts = new javax.swing.JComboBox<>();
        jLabelFaktorAktivitas = new javax.swing.JLabel();
        jLabelFaktorstress = new javax.swing.JLabel();
        hasilBEE = new javax.swing.JTextField();
        hasilTEE = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        back = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelJenisKelamin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelJenisKelamin.setText("Jenis Kelamin");
        getContentPane().add(jLabelJenisKelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 170, 42));

        buttonGroup1.add(laki);
        laki.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        laki.setText("Laki-laki");
        laki.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        laki.setMaximumSize(new java.awt.Dimension(2, 2));
        laki.setMinimumSize(new java.awt.Dimension(2, 2));
        laki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lakiActionPerformed(evt);
            }
        });
        getContentPane().add(laki, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 119, -1));

        buttonGroup1.add(prp);
        prp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        prp.setText("Perempuan");
        prp.setMaximumSize(new java.awt.Dimension(2, 2));
        prp.setMinimumSize(new java.awt.Dimension(2, 2));
        prp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prpActionPerformed(evt);
            }
        });
        getContentPane().add(prp, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 140, -1));

        jLabelTB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTB.setText("Tinggi Badan (cm)");
        getContentPane().add(jLabelTB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 170, 40));

        tb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbActionPerformed(evt);
            }
        });
        getContentPane().add(tb, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 258, 40));

        jLabelBB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelBB.setText("Berat Badan (kg)");
        getContentPane().add(jLabelBB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 170, 39));
        jLabelBB.getAccessibleContext().setAccessibleName("Berat Badan");

        bb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbActionPerformed(evt);
            }
        });
        getContentPane().add(bb, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 258, 39));

        jLabelUmur.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelUmur.setText("Umur (tahun)");
        getContentPane().add(jLabelUmur, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 170, 44));

        Umur.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(Umur, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 258, 44));

        jPanelIMT.setBackground(new java.awt.Color(255, 255, 204));
        jPanelIMT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jIMTbutton.setBackground(new java.awt.Color(255, 255, 255));
        jIMTbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jIMTbutton.setText("IMT");
        jIMTbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jIMTbuttonMouseClicked(evt);
            }
        });
        jIMTbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIMTbuttonActionPerformed(evt);
            }
        });

        indeksmassa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        indeksmassa.setText("Indeks Masa Tubuh Anda  :");

        standarWHO.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        standarWHO.setText("Standar WHO                       :");

        javax.swing.GroupLayout jPanelIMTLayout = new javax.swing.GroupLayout(jPanelIMT);
        jPanelIMT.setLayout(jPanelIMTLayout);
        jPanelIMTLayout.setHorizontalGroup(
            jPanelIMTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIMTLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelIMTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(standarWHO)
                    .addComponent(indeksmassa)
                    .addComponent(jIMTbutton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelIMTLayout.setVerticalGroup(
            jPanelIMTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIMTLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jIMTbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indeksmassa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(standarWHO)
                .addGap(10, 10, 10))
        );

        getContentPane().add(jPanelIMT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 600, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        btTEE.setBackground(new java.awt.Color(255, 255, 255));
        btTEE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btTEE.setText("TEE");
        btTEE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btTEEMouseClicked(evt);
            }
        });
        btTEE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTEEActionPerformed(evt);
            }
        });

        lblBEE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblBEE.setText("Kebutuhan Energi Basal (BEE)");

        lblTEE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTEE.setText("Total Kebutuhan Kalori (TEE)");

        cbStress.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbStress.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   ", "Tidak sakit", "Demam", "Infeksi berat", "Cedera termal", "Operasi minor", "Trauma", "Kanker" }));

        cbAktvts.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbAktvts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   ", "Bedrest", "Kebanyakan duduk", "Aktivitas ringan", "Aktivitas sedang", "Aktivitas berat" }));

        jLabelFaktorAktivitas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelFaktorAktivitas.setText("Faktor Aktivitas");

        jLabelFaktorstress.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelFaktorstress.setText("Faktor Stress");

        hasilBEE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        hasilTEE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbStress, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbAktvts, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblBEE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hasilBEE, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btTEE)
                            .addComponent(jLabelFaktorAktivitas)
                            .addComponent(jLabelFaktorstress))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblTEE)
                        .addGap(15, 15, 15)
                        .addComponent(hasilTEE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabelFaktorstress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbStress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelFaktorAktivitas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbAktvts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btTEE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblBEE)
                            .addComponent(hasilBEE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTEE))
                    .addComponent(hasilTEE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 600, -1));

        clear.setBackground(new java.awt.Color(255, 255, 255));
        clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clear.setText("Clear");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 770, 113, 43));

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 770, 117, 43));

        close.setBackground(new java.awt.Color(255, 255, 255));
        close.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 770, 117, 43));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\windows\\Pictures\\yok (2).jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 920));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 520, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbActionPerformed

    }//GEN-LAST:event_bbActionPerformed

    private void tbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbActionPerformed

    }//GEN-LAST:event_tbActionPerformed

    private void btTEEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTEEActionPerformed

    }//GEN-LAST:event_btTEEActionPerformed

@SuppressWarnings({"ConvertToStringSwitch", "StringEquality"})
    private void btTEEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTEEMouseClicked
        double nilai = Double.valueOf(lblTEE.getText());
        double TB = Double.valueOf(tb.getText());
        TB = TB/100;
        double BB;
        BB = Double.valueOf(bb.getText());
        double s = Double.valueOf(cbStress.getSelectedIndex());
        double a = Double.valueOf(cbAktvts.getSelectedIndex());
        int umur = Integer.valueOf(Umur.getText());
        double JK = Double.valueOf(lblBEE.getText());{
            if (laki.isSelected()){
                JK = 66+(13.7*BB)+(5*TB)-(6.8*umur);
            }else if(prp.isSelected()){
                JK = 655+(9.6*BB)+(1.8*TB)-(4.7*umur);}}
        faktor_stress = (String)cbStress.getSelectedItem();{
            if("Tidak sakit".equals(faktor_stress)){s = 0;
            }else if(faktor_stress=="Demam"){s = 1;
            }else if(faktor_stress=="Infeksi berat"){s = 1.6;
            }else if(faktor_stress=="Cedera termal"){s = 2.1;
            }else if(faktor_stress=="Operasi minor"){s = 1.2;
            }else if(faktor_stress=="Trauma"){s = 1.35;
            }else if(faktor_stress=="Kanker"){s = 1.5;}}
        faktor_aktivitas = (String)cbAktvts.getSelectedItem();{
                if (faktor_aktivitas == "Bedrest"){
                    if(laki.isSelected()){
                        a = 1.3;
                        double akt = Double.parseDouble("1.3");
                        JK = 66+(13.7*BB)+(5*TB)-(6.8*umur);
                        double JeK = Double.parseDouble("JK");
                        nilai = JeK*a*s;
                        hasilBEE.setText(" "+JK+"  kkal/hari");
                        hasilTEE.setText(" "+nilai+"   kkal/hari");
                    }
                    else if(prp.isSelected()){a = 1.3;}
                }else if (faktor_aktivitas=="Kebanyakan duduk"){
                    if(laki.isSelected()){a = 1.3;}
                    else if(prp.isSelected()){a = 1.3;}
                }else if (faktor_aktivitas=="Aktivitas ringan"){
                    if(laki.isSelected()){a = 1.65;}
                    else if(prp.isSelected()){a = 1.55;}
                }else if (faktor_aktivitas=="Aktivitas sedang"){
                    if(laki.isSelected()){a = 1.76;}
                    else if(prp.isSelected()){a = 1.7;}
                }else if (faktor_aktivitas=="Aktivitas berat"){
                    if(laki.isSelected()){a = 2.1;}
                    else if(prp.isSelected()){a = 2;}}
                nilai = JK*a*s;
                hasilBEE.setText(" "+JK+"  kkal/hari");
                hasilTEE.setText(" "+nilai+"   kkal/hari");}
    }//GEN-LAST:event_btTEEMouseClicked

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        int jawab = JOptionPane.showOptionDialog(this,
            "Ingin Keluar?",
            "Close",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, null, null);
        if(jawab == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(this, "Program Akan Keluar");
            System.exit(0);}
    }//GEN-LAST:event_closeActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        
    }//GEN-LAST:event_clearActionPerformed

    private void jIMTbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIMTbuttonActionPerformed
        String keterangan = "";
        double TB = Double.valueOf(tb.getText());
        TB = TB/100;
        double BB = Double.valueOf(bb.getText());
        double IMT = BB/(TB*TB);
        if (IMT < 18.5){keterangan = "Kurus";}
        else if ((IMT >= 18.5)&&(IMT <= 24.9)) {keterangan = "Normal";}
        else if ((IMT >= 25)&&(IMT <= 29.9)) {keterangan = "Gemuk";}
        else if (IMT >= 30) {keterangan = "Obesitas";}
        indeksmassa.setText("Indeks Masa Tubuh Anda  : "+ IMT);
        standarWHO.setText("Standar WHO                       : "+ keterangan);
    }//GEN-LAST:event_jIMTbuttonActionPerformed

    private void jIMTbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIMTbuttonMouseClicked

    }//GEN-LAST:event_jIMTbuttonMouseClicked

    private void prpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prpActionPerformed
        if (prp.isSelected()){
            laki.setSelected(false);
        }
    }//GEN-LAST:event_prpActionPerformed

    private void lakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lakiActionPerformed
        if (laki.isSelected()){
            prp.setSelected(false);
        }
    }//GEN-LAST:event_lakiActionPerformed

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        // TODO add your handling code here:
        laki.setSelected(false);
        prp.setSelected(false);
        tb.setText("");
        bb.setText("");
        Umur.setText("");
        indeksmassa.setText("Indeks Masa Tubuh Anda  : ");
        standarWHO.setText("Standar WHO                       : ");
        cbStress.setSelectedItem(ABORT);
        cbAktvts.setSelectedItem(ABORT);
        lblBEE.setText("Kebutuhan Energi Basal (BEE)   : ");
        lblTEE.setText("Total Kebutuhan Kalori (TEE)     : ");
    }//GEN-LAST:event_clearMouseClicked


    public static void main(String args[]){
        java.awt.EventQueue.invokeLater(new Runnable(){public void run(){
            new kalkulator_gizi().setVisible(true);}});
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Umur;
    private javax.swing.JButton back;
    private javax.swing.JTextField bb;
    private javax.swing.JButton btTEE;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbAktvts;
    private javax.swing.JComboBox<String> cbStress;
    private javax.swing.JButton clear;
    private javax.swing.JButton close;
    private javax.swing.JTextField hasilBEE;
    private javax.swing.JTextField hasilTEE;
    private javax.swing.JLabel indeksmassa;
    private javax.swing.JButton jIMTbutton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBB;
    private javax.swing.JLabel jLabelFaktorAktivitas;
    private javax.swing.JLabel jLabelFaktorstress;
    private javax.swing.JLabel jLabelJenisKelamin;
    private javax.swing.JLabel jLabelTB;
    private javax.swing.JLabel jLabelUmur;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelIMT;
    private javax.swing.JRadioButton laki;
    private javax.swing.JLabel lblBEE;
    private javax.swing.JLabel lblTEE;
    private javax.swing.JRadioButton prp;
    private javax.swing.JLabel standarWHO;
    private javax.swing.JTextField tb;
    // End of variables declaration//GEN-END:variables
}