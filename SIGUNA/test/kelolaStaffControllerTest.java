package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Controller.kelolaStaffController;

public class kelolaStaffControllerTest {
    private Connection conn;
    private kelolaStaffController controller;

    @Before
    public void setUp() throws SQLException {
        // Koneksi ke database
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_siguna", "root", "");
        
        // Buat tabel userTest
        try (Statement stmt = conn.createStatement()) {
            stmt.execute("CREATE TABLE IF NOT EXISTS userTest (" +
                         "username VARCHAR(50) PRIMARY KEY, " +
                         "password VARCHAR(50), " +
                         "id VARCHAR(50) UNIQUE, " +
                         "nama VARCHAR(100), " +
                         "jabatan VARCHAR(50), " +
                         "status VARCHAR(50), " +
                         "jenis_kelamin VARCHAR(10))");
        }

        // Inisialisasi controller dengan tabel userTest
        controller = new kelolaStaffController(conn);
    }

    @After
    public void tearDown() throws SQLException {
        // Drop tabel userTest
        try (Statement stmt = conn.createStatement()) {
            stmt.execute("DROP TABLE IF EXISTS userTest");
        }

        // Tutup koneksi
        if (conn != null) {
            conn.close();
        }
    }

    @Test
    public void testAddStaff() {
        boolean result = controller.addStaffTest("123", "John Doe", "Laki-laki", "johndoe", "password123", "Staff", "On");
        assertTrue(result);
    }

    @Test
    public void testAddStaff_duplikatUsername() {
        // Tambahkan pengguna pertama
        controller.addStaffTest("123", "John Doe", "Laki-laki", "johndoe", "password123", "Staff", "On");

        // Tambahkan pengguna kedua dengan username sama
        boolean result = controller.addStaffTest("124", "Jane Doe", "Perempuan", "johndoe", "password456", "Staff", "On");
        assertFalse(result);
    }

    @Test
    public void testAddStaff_duplikatId() {
        // Tambahkan pengguna pertama
        controller.addStaffTest("123", "John Doe", "Laki-laki", "johndoe", "password123", "Staff", "On");

        // Tambahkan pengguna kedua dengan ID yang sama
        boolean result = controller.addStaffTest("123", "Jane Doe", "Perempuan", "janedoe", "password456", "Staff", "On");
        assertFalse(result);
    }

    @Test
    public void testAddStaff_MissingFields() {
        // Tambahkan pengguna dengan beberapa kolom kosong
        boolean result = controller.addStaffTest("", "John Doe", "Laki-laki", "johndoe", "password123", "Staff", "On");
        assertFalse(result);
    }

        @Test
    public void testEditStaff() {
        // Pertama, tambahkan staff untuk mengedit
        controller.addStaffTest("123", "John Doe", "Laki-laki", "johndoe", "password123", "Staff", "On");

        // Kemudian lakukan edit
        boolean result = controller.editStaffTest("123", "John Doe Edited", "Perempuan", "Staff", "Off");
        assertTrue(result);

        // Verifikasi apakah data telah terupdate
        String sql = "SELECT * FROM userTest WHERE id = '123'";
        try (PreparedStatement st = conn.prepareStatement(sql);
             ResultSet rs = st.executeQuery()) {
            if (rs.next()) {
                assertEquals("John Doe Edited", rs.getString("nama"));
                assertEquals("Perempuan", rs.getString("jenis_kelamin"));
                assertEquals("Staff", rs.getString("jabatan"));
                assertEquals("Off", rs.getString("status"));
            } else {
                fail("Data tidak ditemukan setelah diupdate.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            fail("Terjadi kesalahan dalam verifikasi data.");
        }
    }

    @Test
    public void testDeleteStaff() {
        // Pertama, tambahkan staff untuk dihapus
        controller.addStaffTest("123", "John Doe", "Laki-laki", "johndoe", "password123", "Staff", "On");

        // Lakukan penghapusan
        boolean result = controller.deleteStaffTest("123");
        assertTrue(result);

        // Verifikasi apakah data sudah terhapus
        String sql = "SELECT * FROM userTest WHERE id = '123'";
        try (PreparedStatement st = conn.prepareStatement(sql);
             ResultSet rs = st.executeQuery()) {
            assertFalse(rs.next()); // Harusnya tidak ada data yang ditemukan
        } catch (SQLException e) {
            e.printStackTrace();
            fail("Terjadi kesalahan dalam verifikasi penghapusan.");
        }
    }
}
