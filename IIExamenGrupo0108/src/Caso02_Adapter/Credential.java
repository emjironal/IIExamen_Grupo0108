/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso02_Adapter;

import java.util.List;

/**
 *
 * @author Nicole
 */
public class Credential {
    
    public boolean validateCredencial( String username, String password){
        
        List<Usuario> users = RegisteredUsersList.getInstance().getUsers();
        for (Usuario usr : users){
            if(usr.getLogin() == username && usr.getPassword() == password)
                return true;
        }
        return false;
    }
}
