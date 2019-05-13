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
public class PhoneFormatValidator implements Validator{

    @Override
    public List<String> validate(Object T) {
        String phone = (String) T;
        
        List<String> errors = new ArrayList<>();
        PhoneFormat pf = new PhoneFormat();
        String error  = pf.validatePhoneFormat(phone);
        if(!error.isEmpty()){
            errors.add(error);
        }
        return errors;
    }
    
    
    
}
