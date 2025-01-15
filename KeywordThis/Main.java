/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KeywordThis;

/**
 *
 * @author ASUS TUF ROG
 */
public class Main {
    public static void main(String[] args){
        //Membuat objek dari kelas user
        User user = new User();
        
        user.setUsername("Rika");
        user.setPassword("54321");
        
        System.out.println("Username: " + user.getUsername());
        System.out.println("Password: " + user.getPassword());
    }
    
}
