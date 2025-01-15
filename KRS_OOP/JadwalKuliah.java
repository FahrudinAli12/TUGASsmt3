/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KRS_OOP;

/**
 *
 * @author ASUS TUF ROG
 */
public class JadwalKuliah {

    public static void main(String[] args) {
        MasterDosen master1 = new MasterDosen();
        MasterMataKuliah master2 = new MasterMataKuliah();
        MasterMahasiswa master3 = new MasterMahasiswa();
   String dosen1 = master1.dosen1;
   String dosen2 = master1.dosen2;
   String dosen3 = master1.dosen3;
   String dosen4 = master1.dosen4;
   String dosen5 = master1.dosen5;
   String dosen6 = master1.dosen6;
   String dosen7 = master1.dosen7;
   
    String matkul1 = master2.matkul1;
    String matkul2 = master2.matkul2;
    String matkul3 = master2.matkul3;
    String matkul4 = master2.matkul4;
    String matkul5 = master2.matkul5;
    String matkul6 = master2.matkul6;
    String matkul7 = master2.matkul7;
    
    String mahasiswa = master3.mahasiswa;
    
    String dosenpengajar = dosen1+matkul1+mahasiswa;
        System.out.println("============SIM UNU BLITAR============");
        System.out.println("NAMA MAHASISWA : "+ master3.mahasiswa);
        System.out.println("NAMA MATA KULIAH : "+ master2.matkul3);
        System.out.println("DOSEN PENGAJAR :"+ master1.dosen3);
        System.out.println(master3.mahasiswa + "Mengambil Mata Kuliah"+ master2.matkul3 + "Yang Di Ampu oleh"+ master1.dosen3);
    }
    

    
}
