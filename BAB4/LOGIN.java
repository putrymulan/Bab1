/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB4;

/**
 *
 * @author ASUS
 */
public class LOGIN {
    private String username, password;
    public String nama;
    
    public LOGIN(){
        nama = "Putri Mulan";
        username = "Mulan";
        password = "mulan46";
    }
    public String getUsername(){
        return username;
    }
    public String  getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    
    boolean CekLOGIN(String Username, String password){
        if(username.equals(getUsername()) && password.equals(getPassword())){
                return true;
        }
        return false;
    }
}