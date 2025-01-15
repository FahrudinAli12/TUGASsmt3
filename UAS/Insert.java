/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS TUF ROG
 */
public class Insert {

    Connect conec = new Connect();
    String prog;

    public void insert(String IDKaryawan, String NAMA, int POSISI, String ALAMAT, String GENDER, String EMAIL ) {

        try {
            conec.koneksiData();
             String pos;
             
        
        if ( POSISI == 0 ) {
            pos = "MANAGER";
        } else if ( POSISI == 1 ) {
            pos = "ADMIN";
        } else {
            pos = "KARYAWAN";
        }

            Statement statement = conec.conn.createStatement();
            String sql = "insert into datakaryawan values('" + IDKaryawan + "','" + NAMA + "','" + pos + "','" + ALAMAT + "','" + GENDER +"','" + EMAIL +"');";

            statement.executeUpdate(sql);
            statement.close();

            System.out.println("inserting query...");
            prog = "Berhasil Menyimpan Kenangan Indah";
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }
}

