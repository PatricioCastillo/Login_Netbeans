/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Dash
 */
public class Users {
    
    // Declaración variables
    private String username; 
    private String password;
    
    // Constructores
    public Users()
    {
        username = "admin";
        password = "admin";
    }

    public Users(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Métodos accesadores
    public String getUsername() {
        return username;
    }

    // Métodos mutadores 
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    // Métodos imprimir
    public void imprimirUser()
    {
        System.out.println("username: " + getUsername());
        System.out.println("username: " + getPassword());
    }
}
