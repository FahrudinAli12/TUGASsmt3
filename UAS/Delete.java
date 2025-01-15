/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS;

import java.beans.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS TUF ROG
 */
public class Delete {
   Connect konek = new Connect();
   String prog;
   
    
   public void delete(String IDKaryawan){
        konek.koneksiData();
        try {
            java.sql.Statement update = konek.conn.createStatement();
            //menghapus data berdasarkan nim mahasiswa
            String sql = "delete from datakaryawan where IDKaryawan = '" + IDKaryawan +"'";
            update.executeUpdate(sql);
            System.out.println("Deleting succes...");
            prog = "Berhasil Menghapus Masa Lalu";
            //update.close;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
 
    
}
