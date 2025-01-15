/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Konstruktor;

/**
 *
 * @author ASUS TUF ROG
 */
public class User {
    private String username;
    private String password;
    
    public User(){
        System.out.println("eksekusi method constructor...");
    }
    
}

class DemoConstructor{
    public static void main(String[] args){
        User petani = new User();
    }
}

