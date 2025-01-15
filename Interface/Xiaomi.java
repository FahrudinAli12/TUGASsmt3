/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author ASUS TUF ROG
 */
public class Xiaomi implements Phone{

    private int volume;
    private boolean isPowerOn;
    
    public Xiaomi(){
        this.volume=50;
    }
    
    @Override
    public void powerOn() {
        isPowerOn = true ;
        System.out.println("Handphone menyala.....");
        System.out.println("Selamat datang di xiaomi phone");
        System.out.println("Android version 100");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Handphone dimatikan");
    }

    @Override
    public void volumeUp() {
        if(isPowerOn){
            if(this.volume == MAX_VOLUME){
                System.out.println("Volume Full");
                System.out.println("Sudah " + this.getVolume() + "%");
            }else{
                this.volume += 10;
                System.out.println("Volume sekarang :" + this.getVolume());
            }
        }else{
            System.out.println("Nyalakan dulu Hp nya...");
        }
    }

    @Override
    public void volumeDown() {
        if(isPowerOn){
            if(this.volume == MIN_VOLUME){
                System.out.println("Volume sudah paling rendah");
                System.out.println("Sudah " + this.getVolume() + "%");
            }else{
                this.volume -= 10;
                System.out.println("Volume sekarang :" + this.getVolume());
            }
        }else{
            System.out.println("Nyalakan dulu Hp nya...");
        }
    }
    public int getVolume(){
        return this.volume;
    }
}
