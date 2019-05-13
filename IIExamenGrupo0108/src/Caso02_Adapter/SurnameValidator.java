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
public class SurnameValidator implements Validator{

    @Override
    public List<String> validate(Object T) {
        Usuario usr = (Usuario) T;
        Surname s = new Surname();
        List<String> errors = new ArrayList<>();
        String error = s.validateSurnames(usr);
        if(!error.isEmpty()){
            errors.add(error);
        }
        return errors;
    }
    
}
