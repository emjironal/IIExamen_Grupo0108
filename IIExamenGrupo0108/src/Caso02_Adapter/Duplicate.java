/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso02_Adapter;

/**
 *
 * @author Nicole
 */
public class Duplicate {
    
    public Boolean validateDuplicates(Usuario user){
        return RegisteredUsersList.getInstance().getUsers().contains(user);
        
    }
}
