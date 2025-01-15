/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MethodGetterdaanSetter;

/**
 *
 * @author ASUS TUF ROG
 */
public class UserParameter {
    public String username;
    public String password;
    
    public UserParameter(String username, String password){
        this.username = username;
        this.password = password;
    }
    
}

class DemoConstructor{
    public static void main(String[] args){
        UserParameter petani = new UserParameter("petanikode","kopi");
        System.out.println("Username: " + petani.username);
        System.out.println("Password: " + petani.password);
}
}