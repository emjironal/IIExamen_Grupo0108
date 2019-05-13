/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso02_Adapter;

import java.util.Date;

/**
 *
 * @author Nicole
 */
public class BirthdayFormat {
    
    public String validateBirthday(Date birthday){
        
        Date today = new Date();
        today.setYear(2001);
        if (birthday.after(today)){
            return "El usuario debe ser mayor de edad";
        }
        return "";
    }
    
}
