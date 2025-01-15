/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author ASUS TUF ROG
 */
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        
        Phone VivoY15 = new Xiaomi();
        
        PhoneUser Jenyve = new PhoneUser(VivoY15);
        
        Jenyve.turnOnThephone();
        
        Scanner input = new Scanner (System.in);
        String aksi = null;
        
        while(true){
            System.out.println("=====APLIKASI INTERFACE=====");
            System.out.println("[1] Nyalakan Hp");
            System.out.println("[2] Matikan Hp");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("Pilih Aksi");
            aksi=input.nextLine();
            if(aksi.equals("1")){
                Jenyve.turnOnThephone();
            }
            else if(aksi.equals("2")){
                Jenyve.turnOffThePhone();
            }
            else if(aksi.equals("3")){
                Jenyve.makePhoneLouder();
            }
            else if(aksi.equals("4")){
                Jenyve.makePhoneSilent();
            }
            else if(aksi.equals("0")){
                System.exit(0);
            }
            else{
                System.out.println("Salah woy");
            }
        }
    }
    
}

