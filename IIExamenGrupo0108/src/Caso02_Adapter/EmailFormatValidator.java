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
public class EmailFormatValidator implements Validator{

    @Override
    public List<String> validate(Object T) {
        String correo = (String) T;
        EmailFormat ef = new EmailFormat();
        List<String> errors = new ArrayList<>();
        String error = ef.validateEmail(correo);
        if(!error.isEmpty()){
            errors.add(error);
        }
        return errors;
    }
    
    
}
