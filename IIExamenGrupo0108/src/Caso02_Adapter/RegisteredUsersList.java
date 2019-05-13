/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso02_Adapter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nicole
 */
public class RegisteredUsersList {
    
    private List<Usuario> usuarios;
    private static RegisteredUsersList instance;
    
    private RegisteredUsersList(){
        usuarios = new ArrayList();
    }
    
    public static RegisteredUsersList getInstance(){
        if(instance == null){
            instance = new RegisteredUsersList();
        }
        return instance;
    }
    
    public void addUser(Usuario newUser){
        usuarios.add(newUser);
    }
    
    public List<Usuario> getUsers(){
        return usuarios;
    }
}
