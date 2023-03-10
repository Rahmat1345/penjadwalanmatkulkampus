package View;

import Core.Data;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class InputDataView extends javax.swing.JPanel {
    public InputDataView() {
        initComponents();
        initView();
    }

    private void initView(){
        lblDosen.setText("");
        lblMakul.setText("");
        lblRuang.setText("");
        lblkromosom.setText("");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
            
    public Data prosesData = new Data();
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bawah = new javax.swing.JPanel();
        btGenerateKromoson = new javax.swing.JButton();
        btOptimasi = new javax.swing.JButton();
        btTraceProgram = new javax.swing.JButton();
        Atas = new javax.swing.JPanel();
        right = new javax.swing.JPanel();
        btMakul = new javax.swing.JButton();
        btDosen = new javax.swing.JButton();
        btRuang = new javax.swing.JButton();
        btKromosom = new javax.swing.JButton();
        middle = new javax.swing.JPanel();
        txtmakul = new javax.swing.JTextField();
        txtdosen = new javax.swing.JTextField();
        txtruang = new javax.swing.JTextField();
        txtkromosom = new javax.swing.JTextField();
        left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Tengah = new javax.swing.JPanel();
        kiri = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        kanan = new javax.swing.JPanel();
        lblMakul = new javax.swing.JLabel();
        lblDosen = new javax.swing.JLabel();
        lblRuang = new javax.swing.JLabel();
        lblkromosom = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        bawah.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bawah.setLayout(new java.awt.GridLayout(1, 3));

        btGenerateKromoson.setText("Generate Kromosom");
        btGenerateKromoson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGenerateKromosonActionPerformed(evt);
            }
        });
        bawah.add(btGenerateKromoson);

        btOptimasi.setText("Optimasi");
        btOptimasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOptimasiActionPerformed(evt);
            }
        });
        bawah.add(btOptimasi);

        btTraceProgram.setText("Trace Program");
        btTraceProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTraceProgramActionPerformed(evt);
            }
        });
        bawah.add(btTraceProgram);

        add(bawah, java.awt.BorderLayout.PAGE_END);

        Atas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Masukan Data"));
        Atas.setLayout(new java.awt.BorderLayout());

        right.setLayout(new java.awt.GridLayout(4, 0));

        btMakul.setText("Input");
        btMakul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMakulActionPerformed(evt);
            }
        });
        right.add(btMakul);

        btDosen.setText("Input");
        btDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDosenActionPerformed(evt);
            }
        });
        right.add(btDosen);

        btRuang.setText("Input");
        btRuang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRuangActionPerformed(evt);
            }
        });
        right.add(btRuang);

        btKromosom.setText("Input");
        btKromosom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKromosomActionPerformed(evt);
            }
        });
        right.add(btKromosom);

        Atas.add(right, java.awt.BorderLayout.EAST);

        middle.setLayout(new java.awt.GridLayout(4, 0));

        txtmakul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmakulActionPerformed(evt);
            }
        });
        middle.add(txtmakul);

        txtdosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdosenActionPerformed(evt);
            }
        });
        middle.add(txtdosen);

        txtruang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtruangActionPerformed(evt);
            }
        });
        middle.add(txtruang);

        txtkromosom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkromosomActionPerformed(evt);
            }
        });
        middle.add(txtkromosom);

        Atas.add(middle, java.awt.BorderLayout.CENTER);

        left.setLayout(new java.awt.GridLayout(4, 0));

        jLabel1.setText("Mata Kuliah :");
        left.add(jLabel1);

        jLabel2.setText("Dosen :");
        left.add(jLabel2);

        jLabel3.setText("Ruang :");
        left.add(jLabel3);

        jLabel4.setText("Kromosom :");
        left.add(jLabel4);

        Atas.add(left, java.awt.BorderLayout.WEST);

        add(Atas, java.awt.BorderLayout.PAGE_START);

        Tengah.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Data"));
        Tengah.setLayout(new java.awt.GridLayout(1, 2));

        kiri.setLayout(new java.awt.GridLayout(4, 0));

        jLabel5.setText("Mata Kuliah :");
        kiri.add(jLabel5);

        jLabel6.setText("Dosen :");
        kiri.add(jLabel6);

        jLabel7.setText("Ruang :");
        kiri.add(jLabel7);

        jLabel8.setText("Kromosom :");
        kiri.add(jLabel8);

        Tengah.add(kiri);

        kanan.setLayout(new java.awt.GridLayout(4, 0));

        lblMakul.setText("Mata Kuliah :");
        kanan.add(lblMakul);

        lblDosen.setText("Dosen :");
        kanan.add(lblDosen);

        lblRuang.setText("Ruang :");
        kanan.add(lblRuang);

        lblkromosom.setText("Kromosom :");
        kanan.add(lblkromosom);

        Tengah.add(kanan);

        add(Tengah, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    public JTextField getTxtdosen() {
        return txtdosen;
    }

    public void setTxtdosen(JTextField txtdosen) {
        this.txtdosen = txtdosen;
    }

    public JTextField getTxtkromosom() {
        return txtkromosom;
    }

    public void setTxtkromosom(JTextField txtkromosom) {
        this.txtkromosom = txtkromosom;
    }

    public JTextField getTxtmakul() {
        return txtmakul;
    }

    public void setTxtmakul(JTextField txtmakul) {
        this.txtmakul = txtmakul;
    }

    public JTextField getTxtruang() {
        return txtruang;
    }

    public void setTxtruang(JTextField txtruang) {
        this.txtruang = txtruang;
    }

    private void btMakulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMakulActionPerformed
        // TODO add your handling code here:        
        if (txtmakul.getText().trim().length() <= 0 || txtmakul.getText() == null){
            JOptionPane.showMessageDialog(null, "Jumlah Mata Kuliah Tidak Boleh Kosong");
        }else{
            prosesData.insertDataMakul(this);
            lblMakul.setText(prosesData.getLabelMakul());
        }
    }//GEN-LAST:event_btMakulActionPerformed

    private void btDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDosenActionPerformed
        // TODO add your handling code here:
        if (txtdosen.getText().trim().length() <=0 || txtdosen.getText() == null){
            JOptionPane.showMessageDialog(null, "Jumlah DOsen tidak boleh kosong");
        }else{
            prosesData.insertDataDosen(this);
            lblDosen.setText(prosesData.getLabelDosen());
        }
    }//GEN-LAST:event_btDosenActionPerformed

    private void btRuangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRuangActionPerformed
        // TODO add your handling code here:
        if (txtruang.getText().trim().length() <= 0 || txtruang.getText() == null){
            JOptionPane.showMessageDialog(null, "Jumlah Ruang tidak boleh kosong");
        }else{
            prosesData.insertDataRuang(this);
            lblRuang.setText(prosesData.getLabelRuang());
        }
    }//GEN-LAST:event_btRuangActionPerformed

    private void btKromosomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKromosomActionPerformed
        // TODO add your handling code here:
        if (txtkromosom.getText().trim().length() <=0 || txtkromosom.getText() == null){
            JOptionPane.showMessageDialog(null, "Jumlah Kromosom Tidak Boleh Kosong");
        }else{
            prosesData.insertDataKromosom(this);
            lblkromosom.setText(prosesData.getLabelKromosom());
        }
    }//GEN-LAST:event_btKromosomActionPerformed
               
    private void btGenerateKromosonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGenerateKromosonActionPerformed
        /*prosesKromosom = new CreateKromosome(prosesData.getIntKromosom(), prosesData.getDosen(), prosesData.getMakul(), prosesData.getRuang(), prosesData.getIntMakul(), prosesData.getIntDosen(), prosesData.getIntRuang(), prosesData.getTempDosen(), prosesData.getTempMakul(), prosesData.getTempRuang());
        prosesKromosom.buatTabel();*/
        prosesData.buatKromosom();
        prosesData.tampilKromosomAwal();
        prosesData.buatTabel();
    }//GEN-LAST:event_btGenerateKromosonActionPerformed

    private void btOptimasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOptimasiActionPerformed
        // TODO add your handling code here:
        prosesData.optimasi();
        //prosesData.tampilValueGen();
    }//GEN-LAST:event_btOptimasiActionPerformed

    private void btTraceProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTraceProgramActionPerformed
        // TODO add your handling code here:
        prosesData.traceData();
    }//GEN-LAST:event_btTraceProgramActionPerformed

    private void txtmakulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmakulActionPerformed
        // TODO add your handling code here:
        btMakul.doClick();
    }//GEN-LAST:event_txtmakulActionPerformed

    private void txtdosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdosenActionPerformed
        // TODO add your handling code here:
        btDosen.doClick();
    }//GEN-LAST:event_txtdosenActionPerformed

    private void txtruangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtruangActionPerformed
        // TODO add your handling code here:
        btRuang.doClick();
    }//GEN-LAST:event_txtruangActionPerformed

    private void txtkromosomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkromosomActionPerformed
        // TODO add your handling code here:
        btKromosom.doClick();
    }//GEN-LAST:event_txtkromosomActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Atas;
    private javax.swing.JPanel Tengah;
    private javax.swing.JPanel bawah;
    private javax.swing.JButton btDosen;
    private javax.swing.JButton btGenerateKromoson;
    private javax.swing.JButton btKromosom;
    private javax.swing.JButton btMakul;
    private javax.swing.JButton btOptimasi;
    private javax.swing.JButton btRuang;
    private javax.swing.JButton btTraceProgram;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel kanan;
    private javax.swing.JPanel kiri;
    private javax.swing.JLabel lblDosen;
    private javax.swing.JLabel lblMakul;
    private javax.swing.JLabel lblRuang;
    private javax.swing.JLabel lblkromosom;
    private javax.swing.JPanel left;
    private javax.swing.JPanel middle;
    private javax.swing.JPanel right;
    private javax.swing.JTextField txtdosen;
    private javax.swing.JTextField txtkromosom;
    private javax.swing.JTextField txtmakul;
    private javax.swing.JTextField txtruang;
    // End of variables declaration//GEN-END:variables
}
