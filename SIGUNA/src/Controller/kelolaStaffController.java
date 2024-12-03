/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author aidil
 */
public class kelolaStaffController {
        private Connection conn;

        public kelolaStaffController(Connection conn) {
            this.conn = conn;
        }
        
        public boolean addStaff(String id, String nama, String jenisKelamin, String username, 
                                String password, String jabatan, String status) {
            if (id.isEmpty() || nama.isEmpty() || jenisKelamin.isEmpty() || username.isEmpty() ||
                password.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Semua kolom harus diisi!", "Validasi", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            // Query untuk memasukkan data ke tabel user
            String sql = "INSERT INTO user (username, password, id, nama, jabatan, status, jenis_kelamin) " +
                         "VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, username);
                st.setString(2, password);
                st.setString(3, id);
                st.setString(4, nama);
                st.setString(5, jabatan);
                st.setString(6, status);
                st.setString(7, jenisKelamin);

                int rowInserted = st.executeUpdate();
                if (rowInserted > 0) {
                    JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");
                    return true;
                }
            } catch (java.sql.SQLIntegrityConstraintViolationException e) {
                if (e.getMessage().contains("PRIMARY")) {
                    JOptionPane.showMessageDialog(null, "Username telah digunakan!", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (e.getMessage().contains("id")) {
                    JOptionPane.showMessageDialog(null, "ID telah digunakan!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                // Menangani kesalahan umum lainnya
                Logger.getLogger(kelolaStaffController.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat menambahkan data.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            return false;
        }
        
    public boolean deleteStaff(String id) {
        String sql = "DELETE FROM user WHERE id = ?";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, id);

            int rowDeleted = st.executeUpdate();
            if (rowDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan atau sudah dihapus");
            }
        } catch (Exception e) {
            Logger.getLogger(kelolaStaffController.class.getName()).log(Level.SEVERE, null, e);
        }

        return false;
    }

    public boolean editStaff(String userId, String nama, String jenisKelamin, String jabatan, String status) {
        String sql = "UPDATE user SET nama = ?, jenis_kelamin = ?, jabatan = ?, status = ? WHERE id = ?";

        try (PreparedStatement st = conn.prepareStatement(sql)) {
            // Mengisi parameter dengan nilai baru
            st.setString(1, nama);
            st.setString(2, jenisKelamin);
            st.setString(3, jabatan);
            st.setString(4, status);
            st.setString(5, userId);

            int rowsUpdated = st.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Data staff berhasil diperbarui.");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Data staff tidak ditemukan.");
            }
        } catch (Exception e) {
            Logger.getLogger(kelolaStaffController.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat memperbarui data.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return false;
    }


    // Test
        public boolean addStaffTest(String id, String nama, String jenisKelamin, String username, 
                                String password, String jabatan, String status) {
            if (id.isEmpty() || nama.isEmpty() || jenisKelamin.isEmpty() || username.isEmpty() ||
                password.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Semua kolom harus diisi!", "Validasi", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            // Query untuk memasukkan data ke tabel user
            String sql = "INSERT INTO userTest (username, password, id, nama, jabatan, status, jenis_kelamin) " +
                         "VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, username);
                st.setString(2, password);
                st.setString(3, id);
                st.setString(4, nama);
                st.setString(5, jabatan);
                st.setString(6, status);
                st.setString(7, jenisKelamin);

                int rowInserted = st.executeUpdate();
                if (rowInserted > 0) {
                    JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");
                    return true;
                }
            } catch (java.sql.SQLIntegrityConstraintViolationException e) {
                if (e.getMessage().contains("PRIMARY")) {
                    JOptionPane.showMessageDialog(null, "Username telah digunakan!", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (e.getMessage().contains("id")) {
                    JOptionPane.showMessageDialog(null, "ID telah digunakan!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                // Menangani kesalahan umum lainnya
                Logger.getLogger(kelolaStaffController.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat menambahkan data.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            return false;
        }
        
    public boolean deleteStaffTest(String id) {
        String sql = "DELETE FROM userTest WHERE id = ?";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, id);

            int rowDeleted = st.executeUpdate();
            if (rowDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan atau sudah dihapus");
            }
        } catch (Exception e) {
            Logger.getLogger(kelolaStaffController.class.getName()).log(Level.SEVERE, null, e);
        }

        return false;
    }

    public boolean editStaffTest(String userId, String nama, String jenisKelamin, String jabatan, String status) {
        String sql = "UPDATE userTest SET nama = ?, jenis_kelamin = ?, jabatan = ?, status = ? WHERE id = ?";

        try (PreparedStatement st = conn.prepareStatement(sql)) {
            // Mengisi parameter dengan nilai baru
            st.setString(1, nama);
            st.setString(2, jenisKelamin);
            st.setString(3, jabatan);
            st.setString(4, status);
            st.setString(5, userId);

            int rowsUpdated = st.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Data staff berhasil diperbarui.");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Data staff tidak ditemukan.");
            }
        } catch (Exception e) {
            Logger.getLogger(kelolaStaffController.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat memperbarui data.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return false;
    }
}
