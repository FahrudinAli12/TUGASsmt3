/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;

import java.beans.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS TUF ROG
 */
public class Update {
    Connect konek = new Connect();
   String prog;
    
   public void update(String nim,String nama, String alamat, String gender){
        
         
        try {
            konek.koneksiData();
            java.sql.Statement update = konek.conn.createStatement();
            String sql = " update identitas set nama ='"+ nama +"',`alamat`='"+ alamat+"',`gender`='"+gender+"'  where nim = '"+nim+"'";
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
