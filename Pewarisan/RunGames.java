/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pewarisan;

/**
 *
 * @author ASUS TUF ROG
 */
public class RunGames {
    public static void main(String[] args) {
        Enemy monster = new Enemy();
        Zombie zumbi = new Zombie();
        Pocong poconghitam = new Pocong();
        Burung gagak = new Burung();
        
        System.out.println("Nama = " + zumbi.name);
        System.out.println(zumbi.Hp);
        System.out.println(zumbi.attackPoin);
        zumbi.walk();
        zumbi.attack();
        
        System.out.println(poconghitam.name);
        System.out.println(poconghitam.name);
        System.out.println(poconghitam.attackPoin);
        poconghitam.jump();
        poconghitam.attack();
        
        
        System.out.println(gagak.name);
        System.out.println(gagak.Hp);
        System.out.println(gagak.attackPoin);
        gagak.walk();
        gagak.jump();
        gagak.Fly();
        gagak.attack();

    }
}