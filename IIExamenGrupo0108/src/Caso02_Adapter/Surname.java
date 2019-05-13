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
public class Surname {
    
    public String validateSurnames(Usuario usr){
        if (usr.getSurname1().isEmpty() || usr.getSurname2().isEmpty()){
            return "Error: usuario debe tener ambos apellidos";
        }
        return "";
    }
}
