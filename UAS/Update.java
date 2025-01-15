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
public class Update {
    Connect konek = new Connect();
   String prog;
    
   public void update(String IDKaryawan, String NAMA, String POSISI, String ALAMAT, String GENDER, String EMAIL ){
        
         
        try {
            konek.koneksiData();
            java.sql.Statement update = konek.conn.createStatement();
            String sql = " update datakaryawan set NAMA ='"+ NAMA +"',`POSISI`='"+ POSISI +"',`ALAMAT`='"+ALAMAT+"',`GENDER`='"+GENDER+"',`EMAIL`='"+EMAIL+"'  where IDKaryawan = '"+IDKaryawan+"'";
            update.executeUpdate(sql);
            update.close();
            System.out.println("Updating succes...");
            prog = "Berhasil Memperbarui Kenangan Yang Pahit";
            //update.close;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
