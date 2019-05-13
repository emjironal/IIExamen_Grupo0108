/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso02_Adapter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Nicole
 */
public class BirthdayValidator implements Validator{

    @Override
    public List<String> validate(Object T) {
        Date birthday = (Date) T;
        List<String> errors = new ArrayList<>();
        BirthdayFormat bf = new BirthdayFormat();
        String error = bf.validateBirthday(birthday);
        if(!error.isEmpty()){
            errors.add(error);
        }
        return errors;
    } 
    
    
    
}
