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
public class PhoneFormat {
    
    public String validatePhoneFormat(String phone){
        
        try{
            int num = Integer.parseInt(phone);
        } catch(NumberFormatException e){
            return "Error: el teléfono es numérico";
        }
        if(phone.contains("-"))
            return "Error: no escriba un guión en el número";
        if(phone.length() != 8){
            return "Error: el número debe contener 8 dígitos";
        }
        return "";
    }
    
}
