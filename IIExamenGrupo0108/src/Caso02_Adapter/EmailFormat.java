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
public class EmailFormat {
    
    public String validateEmail(String email){
        if(!email.contains("@")){
            return "Error: formato de correo incorrecto";
        }
        return "";
    }
}
