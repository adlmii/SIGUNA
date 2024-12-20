/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/AWTForms/Frame.java to edit this template
 */
package View;

import Model.Session;

/**
 *
 * @author aidil
 */
public class menuStaff extends java.awt.Frame {

    /**
     * Creates new form menu
     */
    public menuStaff() {
        initComponents();
        lbl_idValue.setText(Session.userId);
        lbl_namaValue.setText(Session.nama);
        lbl_jabatanValue.setText(Session.jabatan);
        lbl_statusValue.setText(Session.status);
        lbl_jenisKelaminValue.setText(Session.jenis_kelamin);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        nav = new javax.swing.JPanel();
        lbl_Logo = new javax.swing.JLabel();
        lbl_logo2 = new javax.swing.JLabel();
        lbl_profile = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        lbl_idValue = new javax.swing.JLabel();
        lbl_nama = new javax.swing.JLabel();
        lbl_namaValue = new javax.swing.JLabel();
        lbl_role = new javax.swing.JLabel();
        lbl_jabatanValue = new javax.swing.JLabel();
        lbl_status = new javax.swing.JLabel();
        lbl_statusValue = new javax.swing.JLabel();
        lbl_jenisKelamin = new javax.swing.JLabel();
        lbl_jenisKelaminValue = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        konfigurasiAwalPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        LaporanPenjualanPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        KelolaStaff = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        btn_hapusStaff = new javax.swing.JToggleButton();
        btn_tambahStaff = new javax.swing.JToggleButton();

        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png")).getImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        nav.setBackground(new java.awt.Color(255, 0, 0));
        nav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Logo.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Logo.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        lbl_Logo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Logo.setText("SIGUNA");
        nav.add(lbl_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        lbl_logo2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        lbl_logo2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_logo2.setText("SISTEM INVENTARIS GUDANG ALFAMART");
        nav.add(lbl_logo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 250, -1));

        lbl_profile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_id.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lbl_id.setText("Id :");

        lbl_idValue.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lbl_idValue.setText("1");

        lbl_nama.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lbl_nama.setText("Nama :");

        lbl_namaValue.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lbl_namaValue.setText("nama");

        lbl_role.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lbl_role.setText("Jabatan :");

        lbl_jabatanValue.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lbl_jabatanValue.setText("Kepala Cabang");

        lbl_status.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lbl_status.setText("Status :");

        lbl_statusValue.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lbl_statusValue.setText("On/Off");

        lbl_jenisKelamin.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lbl_jenisKelamin.setText("Jenis Kelamin :");

        lbl_jenisKelaminValue.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lbl_jenisKelaminValue.setText("L/P");

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTabbedPane1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        konfigurasiAwalPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama Barang", "Kode Barang", "Kuantitas", "Harga"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout konfigurasiAwalPanelLayout = new javax.swing.GroupLayout(konfigurasiAwalPanel);
        konfigurasiAwalPanel.setLayout(konfigurasiAwalPanelLayout);
        konfigurasiAwalPanelLayout.setHorizontalGroup(
            konfigurasiAwalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
        );
        konfigurasiAwalPanelLayout.setVerticalGroup(
            konfigurasiAwalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Konfigurasi Awal", konfigurasiAwalPanel);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Barang Terjual", "Jumlah", "Profit"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout LaporanPenjualanPanelLayout = new javax.swing.GroupLayout(LaporanPenjualanPanel);
        LaporanPenjualanPanel.setLayout(LaporanPenjualanPanelLayout);
        LaporanPenjualanPanelLayout.setHorizontalGroup(
            LaporanPenjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
        );
        LaporanPenjualanPanelLayout.setVerticalGroup(
            LaporanPenjualanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Laporan Penjualan", LaporanPenjualanPanel);

        KelolaStaff.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jTable3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Jenis kelamin", "Status"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        btn_hapusStaff.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btn_hapusStaff.setText("Hapus Staff");

        btn_tambahStaff.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btn_tambahStaff.setText("Tambah Staff");

        javax.swing.GroupLayout KelolaStaffLayout = new javax.swing.GroupLayout(KelolaStaff);
        KelolaStaff.setLayout(KelolaStaffLayout);
        KelolaStaffLayout.setHorizontalGroup(
            KelolaStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KelolaStaffLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_tambahStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_hapusStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        KelolaStaffLayout.setVerticalGroup(
            KelolaStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KelolaStaffLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(KelolaStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tambahStaff)
                    .addComponent(btn_hapusStaff))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Kelola Staff", KelolaStaff);

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lbl_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainLayout.createSequentialGroup()
                        .addComponent(lbl_role)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_jabatanValue))
                    .addGroup(mainLayout.createSequentialGroup()
                        .addComponent(lbl_jenisKelamin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_jenisKelaminValue))
                    .addGroup(mainLayout.createSequentialGroup()
                        .addComponent(lbl_status)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_statusValue))
                    .addGroup(mainLayout.createSequentialGroup()
                        .addComponent(lbl_nama)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_namaValue, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainLayout.createSequentialGroup()
                        .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_idValue, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addComponent(nav, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_id)
                            .addComponent(lbl_idValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nama)
                            .addComponent(lbl_namaValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_role)
                            .addComponent(lbl_jabatanValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_status)
                            .addComponent(lbl_statusValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_jenisKelamin)
                            .addComponent(lbl_jenisKelaminValue))))
                .addGap(62, 62, 62)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuStaff().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel KelolaStaff;
    private javax.swing.JPanel LaporanPenjualanPanel;
    private javax.swing.JToggleButton btn_hapusStaff;
    private javax.swing.JToggleButton btn_tambahStaff;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JPanel konfigurasiAwalPanel;
    private javax.swing.JLabel lbl_Logo;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_idValue;
    private javax.swing.JLabel lbl_jabatanValue;
    private javax.swing.JLabel lbl_jenisKelamin;
    private javax.swing.JLabel lbl_jenisKelaminValue;
    private javax.swing.JLabel lbl_logo2;
    private javax.swing.JLabel lbl_nama;
    private javax.swing.JLabel lbl_namaValue;
    private javax.swing.JLabel lbl_profile;
    private javax.swing.JLabel lbl_role;
    private javax.swing.JLabel lbl_status;
    private javax.swing.JLabel lbl_statusValue;
    private javax.swing.JPanel main;
    private javax.swing.JPanel nav;
    // End of variables declaration//GEN-END:variables
}
