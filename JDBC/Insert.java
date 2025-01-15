/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS TUF ROG
 */
public class Insert {

    Connect conec = new Connect();
    String prog;

    public void insert(String nim, String nama, String alamat, String gender) {

        try {
            conec.koneksiData();

            Statement statement = conec.conn.createStatement();
            String sql = "insert into identitas values('" + nim + "','" + nama + "','" + alamat + "','" + gender + "');";

            statement.executeUpdate(sql);
            statement.close();

            System.out.println("inserting query...");
            prog = "Berhasil Menyimpan Kenangan Indah";
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }
}
